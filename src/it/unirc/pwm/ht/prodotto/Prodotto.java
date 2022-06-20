package it.unirc.pwm.ht.prodotto;
// Generated 30 mag 2022, 12:25:21 by Hibernate Tools 5.4.12.Final

import java.util.HashSet;
import java.util.Set;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareDAO;
import it.unirc.pwm.ht.titolare.TitolareDAOFactory;

/**
 * Prodotto generated by hbm2java
 */
public class Prodotto implements java.io.Serializable {

	private int idprodotto;
	private String nome;
	private String marca;
	private float prezzo;
	private String genere;
	private int taglia;
	private String colore;
	private int quantita;
	private String tipoCliente;
	private Set ordineProdottos = new HashSet(0);

	public Prodotto() {
	}

	public Prodotto(int idprodotto, String nome, String marca, float prezzo, String genere, int taglia, String colore,
			int quantita, String tipoCliente) {
		this.idprodotto = idprodotto;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.genere = genere;
		this.taglia = taglia;
		this.colore = colore;
		this.quantita = quantita;
		this.tipoCliente = tipoCliente;
	}

	public Prodotto(int idprodotto, String nome, String marca, float prezzo, String genere, int taglia, String colore,
			int quantita, String tipoCliente, Set ordineProdottos) {
		this.idprodotto = idprodotto;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.genere = genere;
		this.taglia = taglia;
		this.colore = colore;
		this.quantita = quantita;
		this.tipoCliente = tipoCliente;
		this.ordineProdottos = ordineProdottos;
	}

	public int getIdprodotto() {
		return this.idprodotto;
	}

	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getGenere() {
		return this.genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getTaglia() {
		return this.taglia;
	}

	public void setTaglia(int taglia) {
		this.taglia = taglia;
	}

	public String getColore() {
		return this.colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getQuantita() {
		return this.quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Set getOrdineProdottos() {
		return this.ordineProdottos;
	}

	public void setOrdineProdottos(Set ordineProdottos) {
		this.ordineProdottos = ordineProdottos;
	}

	
	

	
}
