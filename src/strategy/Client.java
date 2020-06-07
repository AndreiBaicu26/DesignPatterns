package strategy;

public class Client {

	private String nume;
	ModVerificareActe modVerificareActe;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modVerificareActe = new VerificarePersoanaFizica();
		
	}
	//merg ambele

	public Client(String nume, ModVerificareActe mod) {
		super();
		this.nume = nume;
		this.modVerificareActe = mod;
		
	}
	public void verificaActe() {
		this.modVerificareActe.verificaDocumente(this.nume);
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ModVerificareActe getModVerificareActe() {
		return modVerificareActe;
	}

	public void setModVerificareActe(ModVerificareActe modVerificareActe) {
		this.modVerificareActe = modVerificareActe;
	}
	
	
	
	
}
