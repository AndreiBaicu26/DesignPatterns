package template;

public abstract class InteractiuneBancomat {

	
	public int idBancomat;

	public InteractiuneBancomat(int idBancomat) {
		super();
		this.idBancomat = idBancomat;
	}
	
	public abstract void introducereCard();
	public abstract void introducerePin();
	public abstract void specificareSuma();
	public abstract void retragereBani();
	public abstract void retragereCard();
	
	public final void executaRetragereBani() {
		
		this.introducereCard();
		this.introducerePin();
		this.specificareSuma();
		this.retragereBani();
		this.retragereCard();
		
	}
	
	
}
