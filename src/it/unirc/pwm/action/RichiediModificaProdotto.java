package it.unirc.pwm.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class RichiediModificaProdotto extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Richiedi Modifica Prodotto: ");
    Prodotto pM;
	public Prodotto getpM() {
		return pM;
	}
	public void setpM(Prodotto pM) {
		this.pM = pM;
	}
	public String execute() throws Exception {
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		pM=pd.getProdotto(pM);
		logger.info("Prodotto "+pM);
		return SUCCESS;
	}
}
