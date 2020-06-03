package factory.method;

public class FactoryCreditIpotecar implements AbstractFactory {

	@Override
	public AbstractCredit createCredit(String numeTitular, double suma) {
		return new CreditIpotecar(suma, numeTitular);
	}

}
