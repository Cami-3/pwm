package it.unirc.pwm.action;


import java.util.Date;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.ordine.Ordine;
import it.unirc.pwm.ht.ordine.OrdineDAO;
import it.unirc.pwm.ht.ordine.OrdineDAOFactory;
import it.unirc.pwm.ht.ordine.OrdineProdotto;
import it.unirc.pwm.ht.ordine.OrdineProdottoId;
import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;
import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;

public class Pagamento extends ActionSupport implements ServletResponseAware, SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private static Logger logger = LogManager.getLogger("Pagamento: ");
	Vector<ProdottoPerCarrello> carrello;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Vector<ProdottoPerCarrello> getCarrello() {
		return carrello;
	}

	public void setCarrello(Vector<ProdottoPerCarrello> carrello) {
		this.carrello = carrello;
	}

	@Override
	public String execute() throws Exception {
		carrello = (Vector<ProdottoPerCarrello>) session.get("carrello");
		logger.info("Il carrello contiene: " +carrello.size() +" prodotti");
		Cliente c = (Cliente) session.get("utente");
		logger.info("Il cliente e' : " +c.getNome() +" "+c.getCognome());
		Date d = new Date();
		OrdineDAO od = OrdineDAOFactory.getDAO();
		Prodotto p = new Prodotto();
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		int cumulativo_ordine = od.getLastOrdine().getCumulativoOrdine();
		//logger.info("Data : " +d);
		for (ProdottoPerCarrello ppc : carrello) {
			int nod=od.getLastOrdine().getIdordine();
			logger.info("Numero ordine : " +nod);
			Ordine o = new Ordine();
			o.setIdordine(nod+1);
			o.setCliente(c);
			o.setData(d);
			o.setCumulativoOrdine(cumulativo_ordine);
			OrdineProdottoId id1 = new OrdineProdottoId(o.getIdordine(), ppc.getP().getIdprodotto());
			logger.info("Op : " +id1.toString());
			OrdineProdotto op = new OrdineProdotto(id1, o, ppc.getP());
			logger.info("Comprato prodotto : " +ppc.getP().getNome());
			p = pd.getProdotto(ppc.getP());
			p.setQuantita(p.getQuantita() - ppc.getQuantRichiesta());
			od.inserisciOrdine(o);
			pd.aggiornaProdotto(p);
			logger.info("Aggiornato prodotto : " +ppc.getP().getNome());
		}
		return SUCCESS;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub

	}

}
