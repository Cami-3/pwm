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

public class Login extends ActionSupport implements SessionAware,ClienteAware {

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
		logger.info("account n� " + account.getId());
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		TitolareDAO td = TitolareDAOFactory.getDAO();



        cliente=new Cliente();
        titolare=new Titolare();
        
        //provo a fare il login del cliente
        if(cd.getCliente(cliente)!=null) {
			logger.info("Cliente: (dopo IF) " + cliente.getNome() + " " + cliente.getCognome());
			session.put("utente", cliente);
			logger.info("cliente ok");
			return "cliente";	
        }
        //provo a fare il login titolare
        else if(td.getTitolare(titolare)!=null) {
        	logger.info("titolare  ok");
        	return "titolare";
        }
		else {
			return INPUT;
		}

	}



}