package it.unirc.pwm.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class IncrementaProdotto extends ActionSupport{
		private static final long serialVersionUID = 1L;
		private static Logger logger = LogManager.getLogger("Incrementa Prodotti: ");
		private Prodotto p1;

		
		
		public Prodotto getP1() {
			return p1;
		}



		public void setP1(Prodotto p1) {
			this.p1 = p1;
		}



		public String execute(){
			
			ProdottoDAO pd = ProdottoDAOFactory.getDAO();
			int id = pd.getLastProdotto().getIdprodotto();
			p1.setIdprodotto(id+1);
			pd.inserisciProdotto(p1);

			return SUCCESS;
		}

}
