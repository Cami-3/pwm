package it.unirc.pwm.hibernate.util;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerificaMapping {
	private static Logger logger = LogManager.getLogger("VerificaMapping");
	public static void main(String[] args) {
		logger.info("Sono nel main");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx=null;  
		try{
			tx=session.beginTransaction();
			tx.commit();
			System.out.println("va bene cosi");
		}
		catch (Exception e) {
			if (tx!=null)
				tx.rollback();
		}
		finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		sessionFactory.close();
	}
	

}
