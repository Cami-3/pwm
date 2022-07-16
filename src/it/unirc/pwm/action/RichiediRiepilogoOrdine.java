package it.unirc.pwm.action;

import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;

public class RichiediRiepilogoOrdine extends ActionSupport implements ServletResponseAware,SessionAware{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Richiedi Riepilogo Ordine: ");
	private Map <String,Object> session;
	Vector<ProdottoPerCarrello> carrello1;
float totale;

	
	public Map<String, Object> getSession() {
	return session;
}


public void setSession(Map<String, Object> session) {
	this.session = session;
}


public Vector<ProdottoPerCarrello> getCarrello1() {
	return carrello1;
}


public void setCarrello1(Vector<ProdottoPerCarrello> carrello1) {
	this.carrello1 = carrello1;
}


public float getTotale() {
	return totale;
}


public void setTotale(float totale) {
	this.totale = totale;
}


	public String execute() throws Exception {
		logger.info("execute");
		logger.info(session);
		carrello1 = (Vector<ProdottoPerCarrello>) session.get("carrello");
		float t=0;
		for(ProdottoPerCarrello ppc: carrello1) {
			t=t+ppc.getP().getPrezzo();
		}
		totale=t;
		 logger.info("adesso il carrello contiente: "+carrello1);
		return SUCCESS;
	}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}
}
