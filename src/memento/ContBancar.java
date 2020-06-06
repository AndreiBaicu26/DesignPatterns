package memento;

public class ContBancar {

	private int idCont;
	private int pin;
	public ContBancar(int idCont, int pin) {
		super();
		this.idCont = idCont;
		this.pin = pin;
	}
	
	public int getIdCont() {
		return idCont;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public MementoContBancar salvareMemento() {
		return new MementoContBancar(pin);
	}
	
	
	@Override
	public String toString() {
		return "ContBancar [idCont=" + idCont + ", pin=" + pin + "]";
	}

	public void undoMemento(MementoContBancar mementoContBancar) {
		this.pin = mementoContBancar.getPin();
	}
	
	
}
