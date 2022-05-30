package it.unirc.pwm.ht.titolare;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.hibernate.util.HibernateUtil;










public class TitolareDAOHibernateImpl implements TitolareDAO{


	protected TitolareDAOHibernateImpl(){
	}

	public Titolare getTitolare(Titolare c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Titolare res = new Titolare();
		try {
			res= (Titolare) session.get(Titolare.class,c.getIdtitolare());
		} catch (HibernateException e) {

			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return res;
	}

	public boolean inserisciTitolare(Titolare c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=false;
		try {
			transaction = session.beginTransaction();
			session.save(c);
			transaction.commit();
			result=true;
		} catch (Exception e) {

			transaction.rollback();

			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return result;
	}

	public boolean aggiornaTitolare(Titolare c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
		} finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	public boolean eliminaTitolare(Titolare c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		try {
			transaction = session.beginTransaction();
			session.delete(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return true;
	}




}
