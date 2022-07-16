package it.unirc.pwm.ht.ordine;



public interface OrdineDAO {
	public Ordine getOrdine(Ordine c);
	public boolean inserisciOrdine(Ordine c);
	public boolean aggiornaOrdine(Ordine c);
	public boolean eliminaOrdine(Ordine c);
	public Ordine getLastOrdine();

}
