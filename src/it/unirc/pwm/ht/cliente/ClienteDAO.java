package it.unirc.pwm.ht.cliente;



public interface ClienteDAO {
	public Cliente getCliente(Cliente c);
	public boolean inserisciCliente(Cliente c);
	public boolean aggiornaCliente(Cliente c);
	public boolean eliminaCliente(Cliente c);
	

}
