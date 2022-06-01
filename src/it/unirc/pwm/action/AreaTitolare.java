package it.unirc.pwm.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareAware;
import it.unirc.pwm.ht.titolare.TitolareDAO;
import it.unirc.pwm.ht.titolare.TitolareDAOFactory;

public class AreaTitolare extends ActionSupport implements SessionAware,TitolareAware {

	private static Logger logger = LogManager.getLogger("AreaTitolare");
	private Map<String,Object> session; 
	private Titolare titolare;
	private Account account;

	

	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public static Logger getLogger() {
		return logger;
	}



	public static void setLogger(Logger logger) {
		AreaTitolare.logger = logger;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public Titolare getTitolare() {
		return titolare;
	}



	public void setTitolare(Titolare titolare) {
		this.titolare = titolare;
	}



	@Override
	public String execute() throws Exception {
		titolare=(Titolare) session.get("utente");
		account=(Account) session.get("account");
	
			
		
		
		return SUCCESS;


	}



}
