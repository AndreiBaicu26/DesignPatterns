package flyweight;

import java.util.HashMap;

public class FabricaManagerStocare  {

	private HashMap<Integer, IStocareJoc> jocuriStocate;

	public FabricaManagerStocare() {
		super();
		this.jocuriStocate = new HashMap<>();
	}
	
	public int getNrJocuri() {
		return this.jocuriStocate.size();
	}
	
	public IStocareJoc getJocuriStocate(int index) {
		
		IStocareJoc joc = this.jocuriStocate.get(index);
		if(joc == null) {
			joc = new StocareJocConcreteFLy("Catan", 200, "Strategie");
			this.jocuriStocate.put(index,joc);
		}
		return joc;
	}
	
}
