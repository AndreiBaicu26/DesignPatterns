package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements ICompositePozitie {

	private String nume;
	private List<InterfataNod> noduri;
	
	
	

	public Manager(String nume) {
		super();
		this.nume = nume;
		this.noduri = new ArrayList<InterfataNod>();
	}

	@Override
	public void descriereNod() {
		System.out.println("Managerul " + this.nume + " are in subordine: " );
		for(InterfataNod nod : this.noduri) {
			nod.descriereNod();
		}
		
	}

	@Override
	public void adaugaPozitie(InterfataNod nod) {
		if(nod instanceof FOH) {
			this.noduri.add(nod);
		}else {
			System.out.println(nod.getName() + "--- nu poate fi adaugat");
		}
		
		
	}

	
	@Override
	public InterfataNod getPozitie(int index) {
		if(index >= 0 && this.noduri.size()>0) {
			return this.noduri.get(index);
		}else {
			return null;
		}
	}

	@Override
	public void stergePozitie(InterfataNod nod) {
		
		this.noduri.remove(nod);		
	}

	@Override
	public String getName() {
		return this.nume;
	}

}
