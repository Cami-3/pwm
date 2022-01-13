package it.unirc.pwm.ht.titolare;

import java.util.List;



public interface TitolareDAO {
	public Titolare getTitolare(Titolare c);
	public boolean inserisciTitolare(Titolare c);
	public boolean aggiornaTitolare(Titolare c);
	public boolean eliminaTitolare(Titolare c);
	

}
