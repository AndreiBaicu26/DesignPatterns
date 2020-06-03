package builder;

public class Cont {

	private boolean areSalariulPeCard;
	private boolean areCardAtasat;
	private boolean areInternetBanking;
	
	public Cont() {
		super();
		this.areSalariulPeCard = false;
		this.areCardAtasat = false;
		this.areInternetBanking = false;
	}
	
	public Cont(boolean areSalariulPeCard, boolean areCardAtasat, boolean areInternetBanking) {
		super();
		this.areSalariulPeCard = areSalariulPeCard;
		this.areCardAtasat = areCardAtasat;
		this.areInternetBanking = areInternetBanking;
	}

	public boolean isAreSalariulPeCard() {
		return areSalariulPeCard;
	}

	public boolean isAreCardAtasat() {
		return areCardAtasat;
	}

	public boolean isAreInternetBanking() {
		return areInternetBanking;
	}

	public void setAreSalariulPeCard(boolean areSalariulPeCard) {
		this.areSalariulPeCard = areSalariulPeCard;
	}

	public void setAreCardAtasat(boolean areCardAtasat) {
		this.areCardAtasat = areCardAtasat;
	}

	public void setAreInternetBanking(boolean areInternetBanking) {
		this.areInternetBanking = areInternetBanking;
	}

	@Override
	public String toString() {
		return "Cont [areSalariulPeCard=" + areSalariulPeCard + ", areCardAtasat=" + areCardAtasat
				+ ", areInternetBanking=" + areInternetBanking + "]";
	}
	
	
	
	
}
