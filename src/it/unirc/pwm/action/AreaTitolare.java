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
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteAware;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareDAO;
import it.unirc.pwm.ht.titolare.TitolareDAOFactory;

public class AreaTitolare extends ActionSupport implements SessionAware,ClienteAware {

	private static Logger logger = LogManager.getLogger("Login");
	private String email;
	private String password;
	private Map<String,Object> session; 
	private Cliente cliente;
	private Titolare titolare;
	private Account account;




	public Titolare getTitolare() {
		return titolare;
	}

	public void setTitolare(Titolare titolare) {
		this.titolare = titolare;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void setCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String execute() throws Exception {
		System.out.println(email + " " + password);

	

		AccountDAO ad = AccountDAOFactory.getDAO();
		account=new Account();
		account.setEmail(email);
		account.setPassword(password);
		account= ad.getAccount(account);
		logger.info("account n° " + account.getId());
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		TitolareDAO td = TitolareDAOFactory.getDAO();



        cliente=new Cliente();
        titolare=new Titolare();
		cliente.setIdcliente(account.getId());
		cliente = cd.getCliente(cliente);
		titolare.setIdtitolare(account.getId());
		titolare = td.getTitolare(titolare);
		session=new HashMap<String, Object>();
		logger.info("Cliente: (prima dell'if) " + cliente.getNome() + " " + cliente.getCognome());
		if(cliente.getNome()!=null){
			
			logger.info("Cliente: (dopo IF) " + cliente.getNome() + " " + cliente.getCognome());
			session.put("utente", cliente);
			logger.info("cliente ok");
			return "cliente";	

		}
		if(titolare!=null) {
			session.put("utente", titolare);

			return "titolare";
		}
		else {
			return INPUT;
		}

	}



}
