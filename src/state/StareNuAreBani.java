package state;

public class StareNuAreBani implements Stare {

	@Override
	public void doAction(Bancomat b) {
		b.setStare(this);
		System.out.println("Bancomatul " + b.getIdBancomat() + " este in starea NU ARE BANI");
	}

}
