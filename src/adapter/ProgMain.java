package adapter;

import adapter.adapter_clase.AdapterClase;
import adapter.adapter_obiecte.AdapterJocuriLego;
import adapter.framework_achizitionat.Lego;
import adapter.framework_existent.Joc;
import adapter.framework_existent.VanzareJoc;

public class ProgMain {

	public static void descriereJoc(VanzareJoc joc) {
		joc.scanareJoc();
		joc.vanzareJoc();
	}
	
	public static void main(String[] args) {
	
		Joc joc = new Joc(200, "WTF");
		descriereJoc(joc);
		
		AdapterJocuriLego adapter = new AdapterJocuriLego(new Lego("StarWars", 5000));
		descriereJoc(adapter);
		
		AdapterClase adapterClase = new AdapterClase("StarWars 2",5454);
		descriereJoc(adapterClase);
	}

}
