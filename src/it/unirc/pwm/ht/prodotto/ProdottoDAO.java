package it.unirc.pwm.ht.prodotto;

import java.util.List;



public interface ProdottoDAO {
	public Prodotto getProdotto(Prodotto c);
	public boolean inserisciProdotto(Prodotto c);
	public boolean aggiornaProdotto(Prodotto c);
	public boolean eliminaProdotto(Prodotto c);
	public List<Prodotto> getProdottiDonna();
	public List<Prodotto> getProdottiUomo();
	public List<Prodotto> getProdottiBambino();
	public List<Prodotto> getProdotti();
	public List<Prodotto> getProdottiRandom();
	public List<Prodotto> getProdottoByNome(String tipoCliente,String nome);
	public Prodotto getLastProdotto();
	public List<Prodotto> getProdottiAll();

}
