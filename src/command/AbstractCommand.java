package command;

public interface AbstractCommand {

	void executa();
	void unexecute();//pentru undo
}
