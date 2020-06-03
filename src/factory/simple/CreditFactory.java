package factory.simple;

public class CreditFactory {

	
	public ICredit createCredit(TipCredit tipCredit, String nume, float suma) {
		
		switch(tipCredit) {
			 
			case IPOTECAR: return new CreditIpotecar(suma, nume);
				
			case NEVOI_PERSONALE: return new CreditNevoiPersonale(suma, nume);
				
			default: return null;
			
		}
		
		
	}
}
