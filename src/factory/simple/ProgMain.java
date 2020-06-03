package factory.simple;

public class ProgMain {

	public static void infoCredite(ICredit credit) {
		System.out.println("Tip credit: " + credit.getNumeCredit() + "\n"+
							"Nume Titular: " + credit.getNumeTitular() +"\n"+
							"Suma: " + credit.getSumaCredit() +"\n");
		
	}

	public static void main(String[] args) {

		CreditFactory creditFactory = new CreditFactory();
		
		ICredit ipotecar = creditFactory.createCredit(TipCredit.IPOTECAR, "Andrei", 5000.0f);
		ICredit nevoi = creditFactory.createCredit(TipCredit.NEVOI_PERSONALE, "Denisa",4000.0f);
		
		infoCredite(ipotecar);
		infoCredite(nevoi);

	}
	
	
}
