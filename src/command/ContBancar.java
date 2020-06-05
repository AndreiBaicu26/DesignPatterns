package command;

public class ContBancar implements ActiuneBancomat{

	String numeTitular;
	
	
	
	public ContBancar(String numeTitular) {
		super();
		this.numeTitular = numeTitular;
	}

	@Override
	public void depunere() {
		System.out.println("A fost depusa o suma de bani");
		
	}

	@Override
	public void retragere() {
		System.out.println("A fost retrasa o suma de bani");
		
	}


	@Override
	public void anulareDepunere() {
		System.out.println("Depunere anulata");
		
	}

	@Override
	public void anulareRetragere() {
		System.out.println("Retragere anulata");
		
	}


}
