package singleton;

public class ProgMain {

	public static void main(String[] args) {
	
//		AgentieEager agentie = AgentieEager.getInstance();
//		AgentieEager agentie2 = AgentieEager.getInstance();
//		agentie2.setNumarAngajati(500);
//		System.out.println(agentie.toString());
//		System.out.println(agentie2.toString());
		
//		AgentieLazy agentieL = AgentieLazy.getInstance();	
//		AgentieLazy agentieL2 = AgentieLazy.getInstance();
//		agentieL2.setNumarAngajati(300);
//		System.out.println(agentieL2.toString());
//		System.out.println(agentieL.toString());
//		
//		AgentieStaticBlock agentieS = AgentieStaticBlock.getInstance();	
//		AgentieStaticBlock agentieS2 = AgentieStaticBlock.getInstance();	
//		agentieS.setNumarAngajati(400);
//		System.out.println(agentieS.toString());
//		System.out.println(agentieS2.toString());
	
//		AgentieInnerHelper agentieInner = AgentieInnerHelper.getInstance();	
//		AgentieInnerHelper agentieInner2 = AgentieInnerHelper.getInstance();	
//		agentieInner.setNumarAngajati(400);
//		System.out.println(agentieInner.toString());
//		System.out.println(agentieInner2.toString());
		
		AgentieEnum agentieEnum = AgentieEnum.instanta;
		AgentieEnum agentieEnum2 = AgentieEnum.instanta;
		agentieEnum.setNumarAngajati(400);
		System.out.println(agentieEnum.toString());
		System.out.println(agentieEnum2.toString());
		
	}

}
