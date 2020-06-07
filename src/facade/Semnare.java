package facade;

public class Semnare {

	private String numeAngajat;
	
	
	
	public Semnare(String numeAngajat) {
		super();
		this.numeAngajat = numeAngajat;
	}



	public void semnare() {
		System.out.println(this.numeAngajat + " a semnat de primire");
	}
}
