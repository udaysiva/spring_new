package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





import org.arpit.java2blog.dao.CountryDAO;
import org.arpit.java2blog.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class CountryService {
	@Autowired
	 CountryDAO countryDao;
	 
	 @Transactional
	 public List getAllCountries() {
	  return countryDao.getAllCountries();
	 }
	 
	 @Transactional
	 public Country getCountry(int id) {
	  return countryDao.getCountry(id);
	 }
	 
	 @Transactional
	 public void addCountry(Country country) {
	  countryDao.addCountry(country);
	  System.out.println("Records got inserted successfully");
	 }
	 
	 @Transactional
	 public void updateCountry(Country country) {
	  countryDao.updateCountry(country);
	 
	 }
	 
	 @Transactional
	 public void deleteCountry(int id) {
	  countryDao.deleteCountry(id);
	 }
}
