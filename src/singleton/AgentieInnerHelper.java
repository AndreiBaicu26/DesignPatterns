package singleton;

public class AgentieInnerHelper {
	private String nume;
	private int numarAngajati;
	
	private static class HelperClass {
		private static final AgentieInnerHelper instanta = new AgentieInnerHelper();
	}
	
	
	
	private AgentieInnerHelper() {
		super();
		this.nume = "AgeTur";
		this.numarAngajati = 200;
	}

	
	

	public String getNume() {
		return nume;
	}


	public int getNumarAngajati() {
		return numarAngajati;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}


	public static AgentieInnerHelper getInstance() {
		return HelperClass.instanta;
	}
	
	@Override
	public String toString() {
		return "AgentieInnerHelper[nume=" + nume + ", numarAngajati=" + numarAngajati + "]" + this.hashCode();
	}
	
}
