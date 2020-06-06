package chain;

public abstract class Notificator {

	private Notificator urmatorulNotificator;
	
	public void setUrmatorulNotificator(Notificator notificator) {
		this.urmatorulNotificator = notificator;
	}
	
	public Notificator getNotificator() {
		return this.urmatorulNotificator;
	}
	
	public abstract void notifica(Client client, String mesaj);
}
