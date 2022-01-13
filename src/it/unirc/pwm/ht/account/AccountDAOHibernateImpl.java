package it.unirc.pwm.ht.account;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.ht.prodotto.Prodotto;








public class AccountDAOHibernateImpl implements AccountDAO{

	
	protected AccountDAOHibernateImpl(){
	}

	public Account getAccount(Account c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			c= (Account) session.createQuery("from Account where email=?1 and password=?2").setParameter(1, c.getEmail()).setParameter(2, c.getPassword())
					.setMaxResults(1).uniqueResult();
			
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}

	public boolean inserisciAccount(Account c) {
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

	public boolean aggiornaAccount(Account c) {
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
	
	public boolean eliminaAccount(Account c) {
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

	@Override
	public Account autentica(Account c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			Query<Account> q = session.createQuery("from Account where email=?1 and password=?2").setParameter(1, c.getEmail()).setParameter(2, c.getPassword());
		//	c= (Account) q.executeUpdate(); //setta come c il risultato della query q
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		
		return c;
	}
	

}
