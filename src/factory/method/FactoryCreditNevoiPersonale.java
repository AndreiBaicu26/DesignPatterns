package factory.method;

public class FactoryCreditNevoiPersonale implements AbstractFactory{

	@Override
	public AbstractCredit createCredit(String numeTitular, double suma) {
		return new CreditNevoiPersonale(suma, numeTitular);
	}

}
