package singleton;

public class AgentieStaticBlock {
	private String nume;
	private int numarAngajati;
	
	private static AgentieStaticBlock instanta;
	
	
	
	private AgentieStaticBlock() {
		super();
		this.nume = "AgeTur";
		this.numarAngajati = 200;
	}

	
	
	static {
		try {
			instanta = new AgentieStaticBlock();
		}catch(Exception e) {
			System.out.println("Eroare");
		}
		
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


	public static AgentieStaticBlock getInstance() {
		return instanta;
	}
	
	@Override
	public String toString() {
		return "AgentieStatic[nume=" + nume + ", numarAngajati=" + numarAngajati + "]" + this.hashCode();
	}
	
}
