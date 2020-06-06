package chain;

public class NotificatorEmail extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		if(client.getEmail() != null) {
			System.out.println(client.getNume() + " ati primit pe email mesajul " + mesaj);
		}else {
			this.getNotificator().notifica(client, mesaj);
		}
		
	}

}
