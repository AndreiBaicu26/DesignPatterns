package proxy;

public class JocRestrictionat implements IJocRestrictionat {

	private String numeProdus;
	private Client client;
	

	public JocRestrictionat(String numeProdus, Client c) {
		super();
		this.numeProdus = numeProdus;
		this.client = c;
	}

	@Override
	public void vinde() {
		System.out.println(this.numeProdus + " a fost vandut!");
		
	}

	@Override
	public void descriere() {
		System.out.println("Acesta este un joc restrictonat pentru minori");		
	}

	public String getNumeProdus() {
		return numeProdus;
	}

	public Client getClient() {
		return client;
	}
	
}
