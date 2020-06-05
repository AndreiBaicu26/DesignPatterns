package command;

public class ProgMain {

	public static void main(String[] args) {
		
		ActiuneBancomat cont = new ContBancar("Andrei");
		
		
		Operator o = new Operator();
		
		AbstractCommand depunere = new ComandaDepunere(cont);
		AbstractCommand retragere = new ComandaRetragere(cont);
		
		o.invoca(depunere);
		o.invoca(retragere);
		
		o.undo(retragere);

	}

}
