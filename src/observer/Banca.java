package observer;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subiect{

	List<AbstractObserver> observers;
	private String numeBanca;
	
	
	public Banca( String numeBanca) {
		super();
		this.observers = new ArrayList<>();
		this.numeBanca = numeBanca;
	}

	@Override
	public void addObserver(AbstractObserver obs) {
		this.observers.add(obs);
		
	}

	@Override
	public void removeObserver(AbstractObserver obs) {
		this.observers.remove(obs);
		
	}

	@Override
	public void sendNotificare(String mesaj) {
		for(AbstractObserver o: this.observers) {
			o.primireNotificare(mesaj);
		}
		
	}
	
	public void notificareNoua() {
		this.sendNotificare("Curs nou Euro");
	}

}
