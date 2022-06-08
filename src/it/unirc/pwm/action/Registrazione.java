package it.unirc.pwm.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;


public class Registrazione extends ActionSupport {

	private static final long serialVersionUID = 1L;


	private static Logger logger = LogManager.getLogger("Registrazione");

	private Cliente cliente=new Cliente(); 
	private Account account=new Account(); 
	private String confermaPassword;
	private String email;
	private String password;
	

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

	public String getConfermaPassword() {
		return confermaPassword;
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

	public void setConfermaPassword(String confermaPassword) {
		this.confermaPassword = confermaPassword;
	}




	public String execute(){
		logger.info("Sono nell'execute");
		AccountDAO ac = AccountDAOFactory.getDAO();
		Account b = ac.getLastAccount();
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		logger.info("i dao sono ok");
		account.setId(b.getId()+1);
		account.setEmail(email);
		account.setPassword(password);
		account.setNumero("0000000000");
		account.setCliente(cliente);
		ac.inserisciAccount(account);
		cd.inserisciCliente(cliente);
		logger.info("ho finito");

		return SUCCESS;
	}



}