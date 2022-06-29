package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;
import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;



public class VisualizzaProdotti extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Visualizza prodotti: ");
	List<Prodotto> prodotti;
	
	
	
	

	public List<Prodotto> getProdotti() {
		return prodotti;
	}


	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}


	@Override
	public String execute() throws Exception {
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		prodotti = pd.getProdotti();
		 logger.info("Nel DB ci sono: "+prodotti.size()+" prodotti");
		return SUCCESS;
	}


}
