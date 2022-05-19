package it.unirc.pwm.action;

import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;




public class EliminaDalCarrello extends ActionSupport implements ServletResponseAware,SessionAware{
	private static final long serialVersionUID = 1L;
	private Map <String,Object> session;
	private static Logger logger = LogManager.getLogger("Elimina dal carrello: ");
	private int idProdElim;
	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public int getIdProdElim() {
		return idProdElim;
	}
	public void setIdProdElim(int idProdElim) {
		this.idProdElim = idProdElim;
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		Vector<ProdottoPerCarrello> carrello = (Vector<ProdottoPerCarrello>) session.get("carrello");
		Iterator<ProdottoPerCarrello> iter = carrello.iterator();
		while(iter.hasNext()) {
			ProdottoPerCarrello c2=iter.next();
		if(c2.getP().getIdprodotto()==idProdElim) {
				iter.remove();
				logger.info("Ho eliminato il prodotto n° " + c2.getP().getIdprodotto() + " dal carrello"  );
			}
			else {
				logger.info("il prodotto non è presente nel carrello");
			}
		}	
		session.put("carrello", carrello);	
		return SUCCESS;
	}
	
	

	
	
	
	
	
	
	

}
