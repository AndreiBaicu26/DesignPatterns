package singleton;

public class AgentieEager {

	
	private String nume;
	private int numarAngajati;
	private static final AgentieEager instanta = new AgentieEager(); //final pentru a nu o modifica
	
	
	private AgentieEager() {
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


	public static AgentieEager getInstance() {
		return instanta;
	}


	@Override
	public String toString() {
		return "AgentieEager [nume=" + nume + ", numarAngajati=" + numarAngajati + "]" + this.hashCode();
	}
	
	

	
	
}
