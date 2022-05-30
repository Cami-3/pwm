package it.unirc.pwm.ht.cliente;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pwm.hibernate.util.HibernateUtil;

public class ClienteDAOHibernateImpl implements ClienteDAO{

	
	protected ClienteDAOHibernateImpl(){
	}

//	public Cliente getForId(int id) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		try {
//			c=(Cliente) session.get(Cliente.class,id);
//		} catch(HibernateException e) {
//			return null;
//		}finally {
//			if(session!=null)
//				session.close();
//		}
//		return c;
//	}
	public Cliente getCliente(Cliente c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Cliente res = new Cliente();
		try {		
			res= (Cliente) session.get(Cliente.class,c.getIdcliente());
			
		} catch (HibernateException e) {
			
			return null;
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return res;
	}

	public boolean inserisciCliente(Cliente c) {
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

	public boolean aggiornaCliente(Cliente c) {
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
	
	public boolean eliminaCliente(Cliente c) {
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
