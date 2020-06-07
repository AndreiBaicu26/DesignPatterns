package composite;

import java.util.ArrayList;
import java.util.List;

public class FOH implements ICompositePozitie {

	private String nume;
	private List<InterfataNod> noduri;
	
	
	
	
	public FOH(String nume) {
		super();
		this.nume = nume;
		this.noduri = new ArrayList<InterfataNod>();
	}

	@Override
	public void descriereNod() {
		System.out.println("FOH " + this.nume + " are in subordine: " );
		for(InterfataNod nod : this.noduri) {
			nod.descriereNod();
		}
		
	}

	@Override
	public void adaugaPozitie(InterfataNod nod) {
		if(nod instanceof BOH) {
			this.noduri.add(nod);
		}else {
			System.out.println(nod.getName() + "--- nu poate fi adaugat");
		}
		
	}
	
	@Override
	public String getName() {
		return this.nume;
	}

	@Override
	public InterfataNod getPozitie(int index) {
		if(index >= 0 && this.noduri.size()>0) {
			return this.noduri.get(index);
		}else {
			return null;
		}
	}

	public String getNume() {
		return nume;
	}
	
	@Override
	public void stergePozitie(InterfataNod nod) {
		this.noduri.remove(nod);
		
	}

}
