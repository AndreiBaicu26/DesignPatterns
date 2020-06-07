package decorator;

public abstract class OfertaVanzareRedusa implements VanzareJoc {

	public VanzareJoc vanzareJoc;

	public OfertaVanzareRedusa(VanzareJoc vanzareJoc) {
		super();
		this.vanzareJoc = vanzareJoc;
	}

	@Override
	public void vindeJoc() {
		vanzareJoc.vindeJoc();
	}
	
	public abstract void reducere50();
	
	
}
