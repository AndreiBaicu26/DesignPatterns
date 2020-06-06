package chain;

public class ProgMain {

	public static void main(String[] args) {
		
		Notificator notificatorEmail = new NotificatorEmail();
		Notificator notificatorSMS = new NotificatorSMS();
		Notificator notificatorManager = new NotificatorManager();
		
		notificatorEmail.setUrmatorulNotificator(notificatorSMS);
		notificatorSMS.setUrmatorulNotificator(notificatorManager);
		
		Client client1 = new Client("andrei@gmail.com","Andrei", "0728282828282");
		Client client2 = new Client(null,"Denisa", "0728282828282");
		Client client3 = new Client(null,"Ion", null);
		
		notificatorEmail.notifica(client1, "Notificare noua");
		notificatorEmail.notifica(client2, "Notificare noua");
		notificatorEmail.notifica(client3, "Notificare noua");
	}

}
