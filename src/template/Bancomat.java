package template;

public class Bancomat extends InteractiuneBancomat {

	public Bancomat(int idBancomat) {
		super(idBancomat);
		
	}

	@Override
	public void introducereCard() {
		System.out.println("S-a introdus cardul");
		
	}

	@Override
	public void introducerePin() {
		System.out.println("S-a introdus PIN-ul");
		
	}

	@Override
	public void specificareSuma() {
		System.out.println("S-a specificat suma");
		
	}

	@Override
	public void retragereBani() {
		System.out.println("S-au retras banii");
		
	}

	@Override
	public void retragereCard() {
		System.out.println("S-a retras cardul");
		
	}

}
