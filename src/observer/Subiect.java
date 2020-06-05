package observer;

public interface Subiect {

	
	public void addObserver(AbstractObserver obs);
	public void removeObserver(AbstractObserver obs);
	public void sendNotificare(String mesaj);
	
}
