package it.unirc.pwm.ht.ordine;
public class OrdineProdottoDAOFactory {

  private static OrdineProdottoDAO dao = null;
  
  private OrdineProdottoDAOFactory(){
  }
  
  public static synchronized OrdineProdottoDAO getDAO() {
    if ( dao == null ) {
    	dao = new OrdineProdottoDAOHibernateImpl();
    }
    return dao;
  } 
}