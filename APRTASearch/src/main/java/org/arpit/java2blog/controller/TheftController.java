package org.arpit.java2blog.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogXF;
import org.apache.log4j.Logger;
import org.arpit.java2blog.dto.ResponseClass;
import org.arpit.java2blog.model.Theft;
import org.arpit.java2blog.model.Theft1;
import org.arpit.java2blog.service.TheftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheftController {
	
	Logger logger = Logger.getLogger(this.getClass());
	 
	 @Autowired
	 TheftService theftService;
	 @RequestMapping(value = "/getAllData", method = RequestMethod.GET, headers = "Accept=application/json")
	 public List getTheftData() {
		  
		  List listOfCountries = theftService.getAllData();
		  return listOfCountries;
		 }
	 /*@RequestMapping(value = "/getData/{TXT_REG_NUMBER_VEHICLE}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Theft getDatabyReg(@PathVariable String  TXT_REG_NUMBER_VEHICLE) {
	  return theftService.getData(TXT_REG_NUMBER_VEHICLE);
	 }*/
	 @RequestMapping(value = "/getData", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ResponseClass getDatabyReg(HttpServletRequest request) {
		 logger.info("Entering TheftController getDatabyReg");
		 String regNo = null;
 		 String engNo = null;
 		 String chassiNo = null;
 		List obj = null;
 		 Theft value = null;
 		Theft1 value1 = null;
 		
 		ResponseClass response= new ResponseClass();
		 regNo =  request.getParameter("regNo");
		 engNo =  request.getParameter("engNo");
		 chassiNo =  request.getParameter("chassiNo");
		 
		 if(regNo!=null ||  (engNo!=null && chassiNo!=null)){
			 
			 if(regNo!=null){
				 obj = theftService.getData(regNo);
				/* if(obj instanceof Theft){
					 value = (Theft)obj;
					 
				 }else{
					 value1 = (Theft1)obj;
				 }*/
			 }
			 else{
				 
				 if(engNo!=null && chassiNo!=null)
				 {
					 obj=theftService.getData1(chassiNo, engNo);
					 /*if(obj instanceof Theft)
					 {
						 value = (Theft)obj;
					 }
					 else 
					 {
						 value1 = (Theft1)obj;
					 }
*/				 }
				 //value = theftService.getData1(chassiNo, engNo);
				 
			 }
			 if(obj!=null && obj.size()>0){
				 
				 response.setStatus("Success");
			     response.setMessage("Data retrieved Successfully");
			     
			     response.setTheftInfo(obj);
				 
			 }
			/* if(value!=null || value1!=null){
				 
			 
			 if(value!=null && (value.getTXT_CHASSIS_NUMBER()!=null || value.getTXT_ENGINE_NUMBER()!=null || value.getTXT_REG_NUMBER_VEHICLE()!=null)){
				 
				 response.setStatus("Success");
			     response.setMessage("Data retrieved Successfully");
			     
			     response.setTheftInfo(value);
			}
			  if(value1!=null && (value1.getTXT_CHASSIS_NUMBER()!=null || value1.getTXT_ENGINE_NUMBER()!=null || value1.getTXT_REG_NUMBER_VEHICLE()!=null))
			 
			 {
				 
				 response.setStatus("Success");
			     response.setMessage("Data retrieved Successfully");
			     response.setTheftInfo(value1);
			 }
						 
						 
			 }*/
			 else {
				 response.setStatus("Failure");
			     response.setMessage("No Data Found for given value");
			     response.setTheftInfo(null);
			}
			 
			 	 
		 }
		 else{
			 
			 response.setStatus("Failure");
		     response.setMessage("Registration Number or Chassis,Engine Number are mandatory");
		     response.setTheftInfo(null);
			 
		 }
 		 
	  return response;
	 }
	 
}
