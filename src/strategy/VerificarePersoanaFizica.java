package strategy;

public class VerificarePersoanaFizica implements ModVerificareActe {

	
	
	@Override
	public void verificaDocumente(String numeClient) {
		System.out.println("Pentru " + numeClient + " se verifica buletin si adeverinta de munca");
		
	}

}
