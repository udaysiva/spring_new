package org.arpit.java2blog.service;

import java.util.List;

import org.arpit.java2blog.dao.CountryDAO;
import org.arpit.java2blog.dao.TheftDAO;
import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.model.Theft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("theftService")
public class TheftService {
	@Autowired
	 TheftDAO theftDao;
	
	@Transactional
	 public List getAllData() {
	  return theftDao.getAllData();
	 }
	 
	 @Transactional
	 public List getData(String TXT_REG_NUMBER_VEHICLE) {
	  return theftDao.getData(TXT_REG_NUMBER_VEHICLE);
	 }
	  @Transactional
		 public List getData1(String TXT_CHASSIS_NUMBER, String TXT_ENGINE_NUMBER) {
		  return theftDao.getData1(TXT_CHASSIS_NUMBER,TXT_ENGINE_NUMBER);
	  
	 }
	 
}
