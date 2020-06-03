package builder;

public class ContBuilder implements AbstractBuilder{

	private Cont cont;
	
	
	public ContBuilder() {
		super();
		this.cont = new Cont();
	}

	@Override
	public Cont build() {
	
		return this.cont;
	}

	public ContBuilder setAreSalariulPeCard(boolean areSalariulPeCard) {
		this.cont.setAreSalariulPeCard(areSalariulPeCard);
		return this;
	}

	public ContBuilder setAreCardAtasat(boolean areCardAtasat) {
		this.cont.setAreCardAtasat(areCardAtasat); 
		return this;
	}

	public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
		this.cont.setAreInternetBanking(areInternetBanking);
		return this;
	}

	
}
