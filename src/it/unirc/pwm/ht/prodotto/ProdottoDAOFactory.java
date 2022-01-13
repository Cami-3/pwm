package it.unirc.pwm.ht.prodotto;
public class ProdottoDAOFactory {

  private static ProdottoDAO dao = null;
  
  private ProdottoDAOFactory(){
  }
  
  public static synchronized ProdottoDAO getDAO() {
    if ( dao == null ) {
    	dao = new ProdottoDAOHibernateImpl();
    }
    return dao;
  } 
}