package strategy;

public class VerificarePersoanaJuridica implements ModVerificareActe{

	@Override
	public void verificaDocumente(String numeClient) {
		System.out.println("Pentru " + numeClient + " se verifica actele de infiintare ale firmei si dovada inregistrarii  la RC");
		
	}

}
