package memento;

public class ProgMain {

	public static void main(String[] args) {
		
		ContBancar cont = new ContBancar(200, 1234);
		ManagerContBancar manager = new ManagerContBancar();
		
		System.out.println(cont.toString());
		
		manager.adaugaMemento(cont.salvareMemento());
		cont.setPin(2222);
		System.out.println(cont.toString());
		cont.setPin(1222);
		System.out.println(cont.toString());
		
		cont.undoMemento(manager.getMemento(0));
		System.out.println(cont);

		try {
			MementoContBancar m = manager.getLastMemento();
			cont.undoMemento(manager.getLastMemento());
			System.out.println(cont.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	}

}
