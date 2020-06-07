package proxy;

public class ProgMain {

	public static void main(String[] args) {
		
		Client c = new Client("Andrei", 19);
		Client c1 = new Client("Denisa", 15);
		
		JocRestrictionat joc = new JocRestrictionat("wtf", c);
		//joc.vinde();
		
		ProxyJoc proxy = new ProxyJoc(joc);
		proxy.vinde();
		
		ProxyJoc proxy1 = new ProxyJoc("AAAA", c);
		proxy1.vinde();
		
		ProxyJoc proxy2 = new ProxyJoc("AAAA", c1);
		proxy2.vinde();
	}

}
