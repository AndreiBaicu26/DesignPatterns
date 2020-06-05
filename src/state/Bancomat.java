package state;

public class Bancomat {
	
	Stare stare;
	private int idBancomat;
	private int sumaDisponibila;
	
	public Bancomat(int idBancomat, int suma) {
		super();
		this.stare = new StareNuAreCard();
		this.idBancomat = idBancomat;
		this.sumaDisponibila = suma;
	}

	
	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		if( !(stare instanceof StareAreCard)) {
			System.out.println("Va rog introduceti cardul");
		}else {
			this.stare = stare;
		}
		
	}

	public void retragereBani(int suma) {
		if((this.stare instanceof StareArePinIntrodus) &&(this.sumaDisponibila > 0)) {
			System.out.println("Ati extras " + suma + " lei.");
		}else {
			if(this.sumaDisponibila <= 0) {
				System.out.println("NU exista bani in bancomat");
				this.stare = new StareNuAreCard();
			}
			
		}
	}
	
	public void introducerePin() {
		if(this.stare instanceof StareAreCard) {
			this.setStare(new StareArePinIntrodus());
		}else {
			System.out.println("Cardul nu este inserat");
		}
	}
	
	public void introducereCard() {
		if(this.stare instanceof StareNuAreCard) {
			this.setStare(new StareAreCard());
		}else {
			System.out.println("Este deja un card in bancomat");
		}
	
	}
	
	public int getIdBancomat() {
		return idBancomat;
	}
	
	
	
	
}
