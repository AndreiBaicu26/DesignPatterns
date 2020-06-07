package flyweight;

public class OptionaleJoc {

	public String intrare;
	public String iesire;
	public boolean esteImpachetat;
	
	public OptionaleJoc(String intrare, String iesire, boolean esteImpachetat) {
		super();
		this.intrare = intrare;
		this.iesire = iesire;
		this.esteImpachetat = esteImpachetat;
	}

	public String getIntrare() {
		return intrare;
	}

	public String getIesire() {
		return iesire;
	}

	public boolean isEsteImpachetat() {
		return esteImpachetat;
	}
	
	
	
}
