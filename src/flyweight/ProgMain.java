package flyweight;

public class ProgMain {

	public static void main(String[] args) {
		FabricaManagerStocare fabrica = new FabricaManagerStocare();
		OptionaleJoc op1 = new OptionaleJoc("01-01-20", "02-02-20", true);
		OptionaleJoc op2 = new OptionaleJoc("01-01-21", "02-02-21", false);
		OptionaleJoc op3 = new OptionaleJoc("01-01-22", "02-02-22", true);
		OptionaleJoc op4 = new OptionaleJoc("01-01-23", "02-02-23", false);
		
		
		fabrica.getJocuriStocate(0).descriereJoc(op1);
		fabrica.getJocuriStocate(1).descriereJoc(op2);
		System.out.println(fabrica.getNrJocuri());
		

	}

}
