package it.unirc.pwm.ht.account;
public class AccountDAOFactory {

  private static AccountDAO dao = null;
  
  private AccountDAOFactory(){
  }
  
  public static synchronized AccountDAO getDAO() {
    if ( dao == null ) {
    	dao = new AccountDAOHibernateImpl();
    }
    return dao;
  } 
}