package it.unirc.pwm.ht.titolare;
public class TitolareDAOFactory {

  private static TitolareDAO dao = null;
  
  private TitolareDAOFactory(){
  }
  
  public static synchronized TitolareDAO getDAO() {
    if ( dao == null ) {
    	dao = new TitolareDAOHibernateImpl();
    }
    return dao;
  } 
}