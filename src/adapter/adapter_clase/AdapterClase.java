package adapter.adapter_clase;

import adapter.framework_achizitionat.Lego;
import adapter.framework_existent.VanzareJoc;

public class AdapterClase extends Lego implements VanzareJoc{

	public AdapterClase(String numeLego, int pretLego) {
		super(numeLego, pretLego);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scanareJoc() {
		super.scanareSPecialaLego();
		
	}

	@Override
	public void vanzareJoc() {
		super.vanareLego();
		
	}

}
