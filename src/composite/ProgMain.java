package composite;

public class ProgMain {
	public static void main(String[] args) {
		Manager m = new Manager("Andrei");
		Manager m2 = new Manager ("Denisa");
		
	
		m.adaugaPozitie(new BOH("AAAA"));
		
		FOH foh1 = new FOH("GIGICA");
		FOH foh2 = new FOH("GIGEL");
	
		
		m.adaugaPozitie(foh1);
		m2.adaugaPozitie(foh2);
		
		foh1.adaugaPozitie(new BOH("Angel"));
		
		m.descriereNod();
		m2.descriereNod();
	}
}	
