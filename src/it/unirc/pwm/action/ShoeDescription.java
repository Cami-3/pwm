package it.unirc.pwm.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class ShoeDescription extends ActionSupport implements Action {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private Prodotto prodotto;
	private List<Prodotto> prodottostessonome;
	
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	

	public List<Prodotto> getProdottostessonome() {
		return prodottostessonome;
	}
	public void setProdottostessonome(List<Prodotto> prodottostessonome) {
		this.prodottostessonome = prodottostessonome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		
		ProdottoDAO pDao = ProdottoDAOFactory.getDAO();
		
		Prodotto p = new Prodotto();
		p.setIdprodotto(id);
		System.out.println("id : " + id);
		prodotto = pDao.getProdotto(p);
		System.out.println("nome prodotto:" +prodotto.getNome());
		
		//prodottostessonome = pDao.getProdottoByNome(p.getNome(),p.getTipo_cliente());
		//System.out.println(prodottostessonome.toString());
		
		return SUCCESS;
	}
	
	
	
	
	
	

}
