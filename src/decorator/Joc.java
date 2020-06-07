package decorator;

public class Joc implements VanzareJoc {

	public String nume;
	public int pret;
	
	public Joc(String nume, int pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	
	@Override
	public void vindeJoc() {
		System.out.println("S-a vandut jocul " + this.nume + " la pretul de " + this.pret);
		
	}
	
	
	
}
