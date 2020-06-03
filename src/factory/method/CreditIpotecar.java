package factory.method;

public class CreditIpotecar extends AbstractCredit {

	
	public CreditIpotecar(double sumaCredit, String numeTitular) {
		super(sumaCredit, numeTitular);
		
	}

	@Override
	public void creareCredit() {
		System.out.println("A fost creat un credit Ipotecar in valoare de " + this.sumaCredit + " \n Titular: " + this.numeTitular );
		
	}

}
