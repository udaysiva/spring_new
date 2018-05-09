package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.model.Theft;
import org.arpit.java2blog.model.Theft1;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TheftDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 public List getAllData() {
		  Session session = this.sessionFactory.getCurrentSession();

		  
		  
		  List TheftList = session.createQuery("from Theft").list();
		  return TheftList;
		 }
	 public List getData(String TXT_REG_NUMBER_VEHICLE) {
		  Session session = this.sessionFactory.getCurrentSession();
		  List list = null;
		  Theft1 data1 = null;
		  Query query=session.createQuery("from Theft where TXT_REG_NUMBER_VEHICLE= :reg");
	        query.setParameter("reg",TXT_REG_NUMBER_VEHICLE);
	        
	        list = query.list();
	        
	        System.out.println(list.size());
	        if(list.size()==0)
	        {
	        	//Session session1 = this.sessionFactory.getCurrentSession();
	        	 Query query1=session.createQuery("from Theft1 where TXT_REG_NUMBER_VEHICLE= :reg");
	        	 query1.setParameter("reg",TXT_REG_NUMBER_VEHICLE);
	        	  list = query1.list();
	        	  return list;
	        	  /*if(list.size()!=0){
	        		  
	        		  data1 =(Theft1) list.get(0);
	        		  
	        	  }
	         	return  data1;*/
	        }
	        else{
	        	
	        	/*Theft data=(Theft) list.get(0);
	        	
	        	return  data;*/
	        	return list;
	        }
	        
				  
	 }
	        
		 
	 
	 public List getData1(String TXT_CHASSIS_NUMBER,String TXT_ENGINE_NUMBER) {
		  Session session = this.sessionFactory.getCurrentSession();
		  List list = null;
		  Theft1 data1 = null;
		  Query query=session.createQuery("from Theft where TXT_CHASSIS_NUMBER= :chasis and TXT_ENGINE_NUMBER= :engine");
	        query.setParameter("chasis",TXT_CHASSIS_NUMBER);
	        query.setParameter("engine",TXT_ENGINE_NUMBER);
	         list = query.list();
	         if(list.size()==0)
	         {
	        	 Query query1=session.createQuery("from Theft1 where TXT_CHASSIS_NUMBER= :chasis and TXT_ENGINE_NUMBER= :engine");
	        			 query1.setParameter("chasis",TXT_CHASSIS_NUMBER);
	 	        query1.setParameter("engine",TXT_ENGINE_NUMBER);
	        	  list = query1.list();
	        	  /*if(list.size()!=0){
	        		  
		        		  
		        		  data1 =(Theft1) list.get(0);
		        		  
		        	  
	        	  }
	        	  return  data1;*/
	        	  return list;
	         }
	         else
	         {
	        
	          /*Theft data=(Theft) list.get(0);
			  return data;*/
	        	 return list;
	         }
	 }
}
