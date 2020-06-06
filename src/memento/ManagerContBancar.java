package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerContBancar {

	private List<MementoContBancar> lista = new ArrayList<MementoContBancar>();	
	
	public void adaugaMemento(MementoContBancar memento) {
		this.lista.add(memento);
	}
	
	public MementoContBancar getMemento(int index) {
		return this.lista.get(index);
	}
	
	public MementoContBancar getLastMemento() throws Exception {
		if(this.lista.size() > 0) {
			MementoContBancar mementoContBancar = this.lista.get(this.lista.size() -1);
			this.lista.remove(this.lista.size() -1);
			return mementoContBancar;
		}else {
			throw new Exception("Nu exista conturi salvate");
			
		}
	}
	
	
	
}
