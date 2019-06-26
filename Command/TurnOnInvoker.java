
public class TurnOnInvoker extends OperationInvokerBase {

	public TurnOnInvoker(CommandBase command) {
		super(command);
	}

	@Override
	public void start() {
		// check if can turn on .....
		command.execute();
		
	}

	@Override
	public void cancel() {
		// check if can turn off .....
		command.cancel();
	}

}
