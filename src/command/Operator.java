package command;

import java.util.Stack;

public class Operator {
	
	Stack<AbstractCommand> stivaActiuni=new Stack<>(); //pentru undo

	public void invoca(AbstractCommand comanda) {
		comanda.executa();
		stivaActiuni.push(comanda);
	}
	
	//doar pentru undo
	public void undo(AbstractCommand comanda) {
		if(!this.stivaActiuni.empty()) {
			this.stivaActiuni.pop().unexecute();
		}
	}
	
}
