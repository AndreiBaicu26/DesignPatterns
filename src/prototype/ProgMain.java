package prototype;

public class ProgMain {

	public static void main(String[] args) {
		
		IClient client1 = new Client("19199", "Andrei", 123);
		IClient client2 = client1.clonare();

		System.out.println(client1.toString());
	}

}
