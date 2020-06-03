package factory.method;

public class CreditNevoiPersonale  extends AbstractCredit{

	public CreditNevoiPersonale(double sumaCredit, String numeTitular) {
		super(sumaCredit, numeTitular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creareCredit() {
		System.out.println("A fost creat un credit de nevoi personale in valoare de " + this.sumaCredit + " \n Titular: " + this.numeTitular );
		
	}

}
