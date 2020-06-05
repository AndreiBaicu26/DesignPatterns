package state;

public class StareAreCard implements Stare{

	@Override
	public void doAction(Bancomat b) {
		b.setStare(this);
		System.out.println("Bancomatul " + b.getIdBancomat() + " este in starea ARE CARD");
		
		
	}

}
