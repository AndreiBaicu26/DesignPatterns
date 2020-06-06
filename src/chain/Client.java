package chain;

public class Client {

	private String email;
	private String nume;
	private String nrTelefon;
	
	public Client(String email, String nume, String nrTelefon) {
		super();
		this.email = email;
		this.nume = nume;
		this.nrTelefon = nrTelefon;
	}

	public String getEmail() {
		return email;
	}

	public String getNume() {
		return nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}
	
	
	
}
