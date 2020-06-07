package decorator;

public class ProgMain {
	
	public static void main(String[] args) {

		OfertaVanzareRedusa jocVandut = new VanzareCuReducere50(new Joc("WTF", 50));
		
		jocVandut.vindeJoc();
		jocVandut.reducere50();
	}
}
