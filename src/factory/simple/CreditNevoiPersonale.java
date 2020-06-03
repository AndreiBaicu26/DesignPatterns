package factory.simple;

public class CreditNevoiPersonale implements ICredit {

	
	private String numeTitular;
	private float sumaCredit;
	
	
	public CreditNevoiPersonale( float sumaCredit,String numeTitular) {
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
		return "Credit nevoi personale";
	}
	
	@Override
	public float getSumaCredit() {
		return this.sumaCredit;
	}
	
}
