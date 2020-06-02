package singleton;


public enum AgentieEnum {
	instanta; 
	
	private String nume;
	private int numarAngajati;
	
	
	private AgentieEnum() {
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

	
	@Override
	public String toString() {
		return "AgentieEnum[nume=" + nume + ", numarAngajati=" + numarAngajati + "]" + this.hashCode();
	}
}
