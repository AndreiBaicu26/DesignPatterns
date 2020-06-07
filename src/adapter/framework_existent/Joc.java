package adapter.framework_existent;

public class Joc implements VanzareJoc{

	private int pret;
	private String nume;
	
	public Joc(int pret, String nume) {
		super();
		this.pret = pret;
		this.nume = nume;
	}

	@Override
	public void scanareJoc() {
		System.out.println("A fost scanat jocul " + this.nume);
		
	}

	@Override
	public void vanzareJoc() {
		System.out.println("A fost vandut jocul " + this.nume + " cu pretul de " + this.pret);
		
	}
	
	
	
	
}
