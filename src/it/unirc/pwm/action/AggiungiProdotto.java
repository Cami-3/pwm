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
import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;


public class AggiungiProdotto extends ActionSupport {

	private static final long serialVersionUID = 1L;


	private static Logger logger = LogManager.getLogger("Aggiungi prodotto: ");

	private Prodotto p;





	public Prodotto getP() {
		return p;
	}





	public void setP(Prodotto p) {
		this.p = p;
	}





	public String execute(){
		
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		int id = pd.getLastProdotto().getIdprodotto();
		p.setIdprodotto(id+1);
		pd.inserisciProdotto(p);

		return SUCCESS;
	}



}