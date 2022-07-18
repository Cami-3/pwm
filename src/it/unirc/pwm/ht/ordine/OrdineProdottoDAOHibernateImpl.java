package it.unirc.pwm.ht.ordine;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.ht.prodotto.Prodotto;









public class OrdineProdottoDAOHibernateImpl implements OrdineProdottoDAO{

	
	protected OrdineProdottoDAOHibernateImpl(){
	}

	public OrdineProdotto getOrdineProdotto(OrdineProdotto c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			
			
			c= (OrdineProdotto) session.get(OrdineProdotto.class,c.getId());
			
		} catch (HibernateException e) {
			
			return null;
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}

	public boolean inserisciOrdineProdotto(OrdineProdotto c) {
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

	public boolean aggiornaOrdineProdotto(OrdineProdotto c) {
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
	
	public boolean eliminaOrdineProdotto(OrdineProdotto c) {
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
	
	public OrdineProdotto getLastOrdineProdotto() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		OrdineProdotto i = null; 
		try {
			i = (OrdineProdotto) session.createQuery("from OrdineProdotto order by id desc").setMaxResults(1).uniqueResult();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return i;
	}

	

	


}
