package adapter.adapter_obiecte;

import adapter.framework_achizitionat.Lego;
import adapter.framework_existent.VanzareJoc;

public class AdapterJocuriLego implements VanzareJoc{

	Lego piesa;
	
	
	public AdapterJocuriLego(Lego piesa) {
		super();
		this.piesa = piesa;
	}

	@Override
	public void scanareJoc() {
		this.piesa.scanareSPecialaLego();
		
	}

	@Override
	public void vanzareJoc() {
		this.piesa.vanareLego();
		
	};
}
