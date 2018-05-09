package iib.gov.in.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VoilationDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		  this.sessionFactory = sf;
		 }
	 public List getData(String REGISTRATION_NUMBER) {
		
			  Session session = this.sessionFactory.getCurrentSession();
			  List list = null;
			  
			  Query query=session.createQuery("from Voilation where REGISTRATION_NUMBER= :reg");
		        query.setParameter("reg",REGISTRATION_NUMBER);
		        
		        list = query.list();
		        return list;
		 }
}
