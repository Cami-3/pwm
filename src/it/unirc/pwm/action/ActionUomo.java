package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.*;



public class ActionUomo extends ActionSupport {
	private static final long serialVersionUID = 1L;//serializzazione, serve qando si sposta il progetto con la usb
	private List<Prodotto> prodottiUomo;//lista di prodotti donna	prelevati da db
	private static Logger logger = LogManager.getLogger("ShopUomo: ");//classico logger, si deve utilizzare log4j

	
	public List<Prodotto> getProdottiUomo() {
		return prodottiUomo;
	}
	public void setProdottiUomo(List<Prodotto> prodottiUomo) {
		this.prodottiUomo = prodottiUomo;
	}
	@Override
	//metodo alla base di tutte le action
	public String execute() throws Exception {
		logger.info("Sono nell'execute");
		ProdottoDAO pu = ProdottoDAOFactory.getDAO();//chiamo il Dao di prodotto per interagire con il DB
		logger.info("DAO prelevato");
		//quando si chiama pd si trovao tutti i metodi che ci sono ne ldao di prodotto
		//si associa a prodottiDonna il Dao che preleva dal db i prodotti donna
		prodottiUomo=pu.getProdottiUomo();//si finisce la action
		logger.info("Ho prelevato l'array" + pu);
		return SUCCESS;
	}


}
