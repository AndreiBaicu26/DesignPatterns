package observer;


public class ProgMain {

	public static void main(String[] args) {
		AbstractObserver c1 = new ClientAbonat("Andrei");
		AbstractObserver c2 = new ClientAbonat("Denisa");
		
		Banca banca = new Banca("BT");
		banca.addObserver(c1);
		banca.addObserver(c2);
		
		banca.notificareNoua();
	}
	
	

	

}
