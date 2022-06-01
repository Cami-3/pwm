package it.unirc.pwm.action;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class Logout extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private Map<String,Object> session; 

	public String getEmail() {
		return email;
	}

	public void setUsername(String email) {
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

	

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

	public String execute(){
		
		session.clear();
		session.remove("utente");
		return SUCCESS;
	}



}