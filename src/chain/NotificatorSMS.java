package chain;

public class NotificatorSMS extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		
		if(client.getNrTelefon() != null) {
			System.out.println(client.getNume() + " ai primit pe telefon mesajul " + mesaj);
		}else {
			this.getNotificator().notifica(client, mesaj);	
		}
	}

}
