package facade;

public class Facade {
	
	public void verificare(int colet, String angajat, String produ) {
		
		Colet c = new Colet(colet);
		Semnare s = new Semnare(angajat);
		ProdusDefect prod = new ProdusDefect(produ);
		
		c.verificareProduseInColet();
		s.semnare();
		prod.produsDefect();
	}
}
