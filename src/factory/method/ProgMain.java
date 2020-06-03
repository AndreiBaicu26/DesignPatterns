package factory.method;

public class ProgMain {

	public static void main(String[] args) {
		
		AbstractCredit ipotecar = new FactoryCreditIpotecar().createCredit("Andrei", 500.00); 		
		AbstractCredit nevoiPersonale = new FactoryCreditNevoiPersonale().createCredit("Denisa", 400.00); 

		
		ipotecar.creareCredit();
		nevoiPersonale.creareCredit();
	}
}
