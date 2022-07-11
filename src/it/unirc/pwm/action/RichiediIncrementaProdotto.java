package it.unirc.pwm.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class RichiediIncrementaProdotto extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Richiedi Incremento Prodotto: ");
	Prodotto pA;
	

	



	public Prodotto getpA() {
		return pA;
	}






	public void setpA(Prodotto pA) {
		this.pA = pA;
	}









	@Override
	public String execute() throws Exception {
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		pA=pd.getProdotto(pA);
		logger.info("Prodotto "+pA);
		return SUCCESS;
	}
}
