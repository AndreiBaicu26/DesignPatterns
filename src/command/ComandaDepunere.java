package command;

public class ComandaDepunere implements AbstractCommand {

	ActiuneBancomat actiune;
	
	
	
	public ComandaDepunere(ActiuneBancomat actiune) {
		super();
		this.actiune = actiune;
	}

	@Override
	public void executa() {
		actiune.depunere();
		
	}

	@Override
	public void unexecute() {
		actiune.anulareDepunere();
		
	}

}
