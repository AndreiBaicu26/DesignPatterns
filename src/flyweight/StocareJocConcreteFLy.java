package flyweight;

public class StocareJocConcreteFLy implements IStocareJoc {

	private String denumire;
	private int cm;
	private String categorie;
	
	
	public StocareJocConcreteFLy(String denumire, int cm, String categorie) {
		super();
		this.denumire = denumire;
		this.cm = cm;
		this.categorie = categorie;
	}

	

	@Override
	public void descriereJoc(OptionaleJoc optionale) {
		System.out.println("S-a stocat jocul " + this.denumire +
				" cu dimensiunea " + this.cm + ", de categorie" +this.denumire +
				". Produsul are iesiri pe data de " + optionale.getIesire() + " intrari pe data de " + 
				optionale.getIntrare() + " este impachetat " + (optionale.isEsteImpachetat() ? "DA" : "NU"));
		
	}
	
	
	
}
