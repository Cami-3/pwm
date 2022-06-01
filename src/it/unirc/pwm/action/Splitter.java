package it.unirc.pwm.action;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteAware;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareAware;

public class Splitter extends ActionSupport implements SessionAware,ClienteAware,TitolareAware {
	
	private static Logger logger = LogManager.getLogger("Splitter");
	private Map<String,Object> session; 
	private Cliente cliente;
	private Account account;
	private Titolare titolare;
	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Titolare getTitolare() {
		return titolare;
	}
	public void setTitolare(Titolare titolare) {
		this.titolare = titolare;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generate
		
		String tu = (String) session.get("TipologiaUtente");
		
		System.out.println(tu);
		if(tu!=null) {
		if(tu.equals("cli")){return "cli";}
		else {return "tit";}
		}
		else { 
			return "login";
		}
	}
	
	

	
}
