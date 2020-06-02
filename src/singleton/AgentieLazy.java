package singleton;

public class AgentieLazy {
	
		private String nume;
		private int numarAngajati;
		private static AgentieLazy instanta = null; //final pentru a nu o modifica
		
		
		private AgentieLazy() {
			super();
			this.nume = "AgeTur";
			this.numarAngajati = 200;
		}


		public String getNume() {
			return nume;
		}


		public int getNumarAngajati() {
			return numarAngajati;
		}


		public void setNume(String nume) {
			this.nume = nume;
		}


		public void setNumarAngajati(int numarAngajati) {
			this.numarAngajati = numarAngajati;
		}

		//pentru thread safe punem synchronized
		//putem pune parametrii aici
		public static synchronized AgentieLazy getInstance() {
			if(instanta == null) {
				instanta = new AgentieLazy();
			}
			return instanta;
		}


		@Override
		public String toString() {
			return "AgentieLazy [nume=" + nume + ", numarAngajati=" + numarAngajati + "]" + this.hashCode();
		}
		
		



}
