package state;

public class StareArePinIntrodus implements Stare{

	@Override
	public void doAction(Bancomat b) {
		b.setStare(this);
		System.out.println("Bancomatul " + b.getIdBancomat() + " este in starea ARE PIN INTRODUS");
		
	}

}
