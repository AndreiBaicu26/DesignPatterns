package builder;

public class ProgMain {

	public static void main(String[] args) {
		ContBuilder builder = new ContBuilder();
		Cont c = builder.setAreCardAtasat(true).setAreInternetBanking(true).build();
		
		System.out.println(c.toString());
		Cont a = builder.build();
		System.out.println(a.toString());
	}
	
}
