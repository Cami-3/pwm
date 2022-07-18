package it.unirc.pwm.ht.ordine;



public interface OrdineProdottoDAO {
	public OrdineProdotto getOrdineProdotto(OrdineProdotto c);
	public boolean inserisciOrdineProdotto(OrdineProdotto c);
	public boolean aggiornaOrdineProdotto(OrdineProdotto c);
	public boolean eliminaOrdineProdotto(OrdineProdotto c);
	public OrdineProdotto getLastOrdineProdotto();

}
