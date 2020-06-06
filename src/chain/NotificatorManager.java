package chain;

public class NotificatorManager extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		
		System.out.println("Clientul " + client.getNume() + " nu poate fi notificat");
		
	}

	
}
