package factory.method;

public abstract class AbstractCredit {

	public double sumaCredit;
	public String numeTitular;
	
	public AbstractCredit(double sumaCredit, String numeTitular) {
		super();
		this.sumaCredit = sumaCredit;
		this.numeTitular = numeTitular;
	}

	public abstract void creareCredit();
	
	public double getSumaCredit() {
		return sumaCredit;
	}

	public String getNumeTitular() {
		return numeTitular;
	}

	public void setSumaCredit(double sumaCredit) {
		this.sumaCredit = sumaCredit;
	}

	public void setNumeTitular(String numeTitular) {
		this.numeTitular = numeTitular;
	}
	
	
	
	
}
