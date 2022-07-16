package it.unirc.pwm.ht.ordine;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.ht.prodotto.Prodotto;









public class OrdineDAOHibernateImpl implements OrdineDAO{

	
	protected OrdineDAOHibernateImpl(){
	}

	public Ordine getOrdine(Ordine c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			
			
			c= (Ordine) session.get(Ordine.class,c.getIdordine());
			
		} catch (HibernateException e) {
			
			return null;
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}

	public boolean inserisciOrdine(Ordine c) {
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

	public boolean aggiornaOrdine(Ordine c) {
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
	
	public boolean eliminaOrdine(Ordine c) {
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
	
	public Ordine getLastOrdine() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Ordine i = null; 
		try {
			i = (Ordine) session.createQuery("from Ordine order by id desc").setMaxResults(1).uniqueResult();
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
