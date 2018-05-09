package iib.gov.in.controller;
import iib.gov.in.dto.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import iib.gov.in.service.VoilationService;
import iib.gov.in.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoilationController {
@Autowired
VoilationService voilationservice;
@RequestMapping(value = "/getData", method = RequestMethod.GET, headers = "Accept=application/json")
public ResponseClass getDatabyReg(HttpServletRequest request) {
	 	 String regNo = null;
	 
	List obj = null;
	 
	
	ResponseClass response= new ResponseClass();
	 regNo =  request.getParameter("regNo");
	
	 
	 if(regNo!=null)
	 {
		 obj = voilationservice.getData(regNo);
	 }
	 
	 if(obj!=null && obj.size()>0){
		 
		 response.setStatus("Success");
	     response.setMessage("Data retrieved Successfully");
	     
	     response.setVoilationInfo(obj);
		 
	 }
	 else {
		 response.setStatus("Failure");
	     response.setMessage("No Data Found for given value");
	     response.setVoilationInfo(null);
	}
	 
	return response;

}
}
