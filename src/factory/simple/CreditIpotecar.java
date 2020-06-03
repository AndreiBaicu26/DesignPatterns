package factory.simple;

public class CreditIpotecar implements ICredit{
	
	private String numeTitular;
	private float sumaCredit;
	
	
	public CreditIpotecar( float sumaCredit, String numeTitular) {
		super();
		this.numeTitular = numeTitular;
		this.sumaCredit = sumaCredit;
	}
	
	
	public String getNumeTitular() {
		return numeTitular;
	}

	public void setNumeTitular(String numeTitular) {
		this.numeTitular = numeTitular;
	}

	public void setSumaCredit(float sumaCredit) {
		this.sumaCredit = sumaCredit;
	}

	@Override
	public String getNumeCredit() {
		return "Credit Ipotecar";
	}
	
	@Override
	public float getSumaCredit() {
		return this.sumaCredit;
	}
}
