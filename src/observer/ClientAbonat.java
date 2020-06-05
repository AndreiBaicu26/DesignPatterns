package observer;

public class ClientAbonat implements AbstractObserver {

	String nume;
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primireNotificare(String mesaj) {
		System.out.println(this.nume + " ai primit notificarea: " + mesaj);
		
	}

}
