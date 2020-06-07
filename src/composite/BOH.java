package composite;

public class BOH implements InterfataNod{

	public String numeAngajat;
	
	public BOH(String numeAngajat) {
		super();
		this.numeAngajat = numeAngajat;
	}

	@Override
	public void descriereNod() {
		System.out.println("      Membru BOH = " + this.numeAngajat);
		
	}

	@Override
	public String getName() {
		return this.numeAngajat;
	}
}
