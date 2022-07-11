package it.unirc.pwm.action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class EliminaProdotti extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Elimina Prodotti: ");
	int idp;

	
	
	
	public int getIdp() {
		return idp;
	}




	public void setIdp(int idp) {
		this.idp = idp;
	}




	@Override
	public String execute() throws Exception {
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		Prodotto p = new Prodotto();
		p.setIdprodotto(idp);
		p=pd.getProdotto(p);
		pd.eliminaProdotto(p);
		logger.info("Il prodotto è stato eliminato!");
		return SUCCESS;
	}


}
