package prototype;

public class Client implements IClient{

	private String cnp;
	private String nume;
	private int pinCard;
	
	//presupunem ca dureaza foarte mult
	public Client(String cnp, String nume, int pinCard) {
		super();
		this.cnp = cnp;
		this.nume = nume;
		this.pinCard = pinCard;
	}

	public String getCnp() {
		return cnp;
	}

	public String getNume() {
		return nume;
	}

	public int getPinCard() {
		return pinCard;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPinCard(int pinCard) {
		this.pinCard = pinCard;
	}
	
	private Client() {
		super();
	}

	@Override
	public IClient clonare() {
		Client c = new Client();
		c.setCnp(this.cnp);
		c.setNume(this.nume);
		c.setPinCard(this.pinCard);
		
		return c;
	}

	@Override
	public String toString() {
		return "Client [cnp=" + cnp + ", nume=" + nume + ", pinCard=" + pinCard + "]";
	}
	
	
	
	
}
