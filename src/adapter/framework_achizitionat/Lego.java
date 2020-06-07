package adapter.framework_achizitionat;

public class Lego {

	public String numeLego;
	public int pretLego;
	
	public Lego(String numeLego, int pretLego) {
		super();
		this.numeLego = numeLego;
		this.pretLego = pretLego;
	}
	
	public void scanareSPecialaLego() {
		System.out.println("A fost scanat piesa lego " + this.numeLego);
	}
	
	public void vanareLego() {
		System.out.println("A fost vandut LEGO-ul " + this.numeLego + " cu pretul de " + this.pretLego);
	}
	
}
