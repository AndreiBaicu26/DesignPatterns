package proxy;

public class ProxyJoc implements IJocRestrictionat{

	private JocRestrictionat joc;
	
	public ProxyJoc(JocRestrictionat j) {
		this.joc = j;
	}
	//merg ambele
	public ProxyJoc(String numeJoc, Client c) {
		super();
		this.joc = new JocRestrictionat(numeJoc, c);
	}

	@Override
	public void vinde() {
		if(joc.getClient().getVarsta() >= 18) {
			joc.vinde();
		}else {
			System.out.println("Nu se poate vinde jocul " + this.joc.getNumeProdus() + ", deoarece clietul " + this.joc.getClient().getNume() + " "
					+ "nu are 18 ani");
		}
		
	}

	@Override
	public void descriere() {
		this.joc.descriere();
		
	}
	
	
}
