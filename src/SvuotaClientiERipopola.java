
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;

public class SvuotaClientiERipopola {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger("SCER");
		logger.info("Sto svuotando tutta la tabella clienti...");
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		AccountDAO ac = AccountDAOFactory.getDAO();
		List<Cliente> lc = cd.getClienti();
		for(Cliente c : lc) {
			cd.eliminaCliente(c);
			Account a = c.getAccount();
			ac.eliminaAccount(a);
		}
		Account b = ac.getLastAccount();
		Date d = new Date(1996,05,05);
		Account a = new Account(b.getId()+1,"a@a.it","manue","0000000000");
		Cliente c = new Cliente(a,"R","E",d,"CFg,fà","268462","5654");
		ac.inserisciAccount(a);
		cd.inserisciCliente(c);
	}

}
