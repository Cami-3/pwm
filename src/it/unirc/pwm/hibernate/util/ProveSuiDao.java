package it.unirc.pwm.hibernate.util;

import java.util.List;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class ProveSuiDao {
	public static void main(String[] args) {
		ProdottoDAO pDAO = ProdottoDAOFactory.getDAO();
		List<Prodotto> p = pDAO.getProdottiDonna();
		System.out.println(p);
	}

}
