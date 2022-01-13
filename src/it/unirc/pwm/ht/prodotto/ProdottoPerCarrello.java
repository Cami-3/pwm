package it.unirc.pwm.ht.prodotto;


public class ProdottoPerCarrello {
	private Prodotto p;
	private int quantRichiesta;
	
	
	
	public ProdottoPerCarrello(Prodotto p, int quantRichiesta) {
		super();
		this.p = p;
		this.quantRichiesta = quantRichiesta;
	}
	
	public Prodotto getP() {
		return p;
	}
	public void setP(Prodotto p) {
		this.p = p;
	}
	public int getQuantRichiesta() {
		return quantRichiesta;
	}
	public void setQuantRichiesta(int quantRichiesta) {
		this.quantRichiesta = quantRichiesta;
	}
	

}
