package command;

public class ComandaRetragere implements AbstractCommand {

	ActiuneBancomat actiune;
	
	
	
	public ComandaRetragere(ActiuneBancomat actiune) {
		super();
		this.actiune = actiune;
	}

	@Override
	public void executa() {
		actiune.retragere();
		
	}

	@Override
	public void unexecute() {
		actiune.anulareRetragere();
		
	}

}
