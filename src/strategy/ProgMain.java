package strategy;

public class ProgMain {

	public static void main(String[] args) {
		
		ModVerificareActe fizic = new VerificarePersoanaFizica();
		ModVerificareActe juridic = new VerificarePersoanaJuridica();
		
		Client c = new Client( "Andrei");
		Client c1 = new Client( "Denisa");
		c.setModVerificareActe(juridic);
		c1.setModVerificareActe(new VerificarePersoanaJuridica());
		c.verificaActe();
		c1.verificaActe();
	}
}
