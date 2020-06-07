package facade;

public class ProdusDefect {

	private String numeProdus;

	public ProdusDefect(String numeProdus) {
		super();
		this.numeProdus = numeProdus;
	}
	
	public void produsDefect() {
		System.out.println("A fost verificat produsul " + this.numeProdus);
	}
	
}
