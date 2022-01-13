package it.unirc.pwm.action;

import it.unirc.pwm.ht.prodotto.Prodotto;

public class ComponenteCarrello {
	
	private Prodotto p;
	private int quantRichiesta;
	
	




	public ComponenteCarrello(Prodotto p, int quantRichiesta) {
		super();
		this.p = p;
		this.quantRichiesta = quantRichiesta;
	}




	public Prodotto ProdottogetC() {
		return p;
	}




	public void setC(Prodotto p) {
		this.p = p;
	}




	public int getQuantRichiesta() {
		return quantRichiesta;
	}


	public void setQuantRichiesta(int quantRichiesta) {
		this.quantRichiesta = quantRichiesta;
	}




	public Object getC() {
		// TODO Auto-generated method stub
		return null;
	}
		

}
