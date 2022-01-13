package it.unirc.pwm.ht.ordine;
public class OrdineDAOFactory {

  private static OrdineDAO dao = null;
  
  private OrdineDAOFactory(){
  }
  
  public static synchronized OrdineDAO getDAO() {
    if ( dao == null ) {
    	dao = new OrdineDAOHibernateImpl();
    }
    return dao;
  } 
}