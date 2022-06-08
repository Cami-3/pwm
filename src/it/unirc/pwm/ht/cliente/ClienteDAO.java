package it.unirc.pwm.ht.cliente;

import java.util.List;

public interface ClienteDAO {
	public Cliente getCliente(Cliente c);
	public boolean inserisciCliente(Cliente c);
	public boolean aggiornaCliente(Cliente c);
	public boolean eliminaCliente(Cliente c);
	public List<Cliente> getClienti();
//	public Cliente getForId(int id);

}
