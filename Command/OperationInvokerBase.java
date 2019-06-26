
public abstract class OperationInvokerBase {
	
	protected CommandBase command;

	public OperationInvokerBase(CommandBase command) {
		super();
		this.command = command;
	}
	
	public abstract void start();
	
	public abstract void cancel();

}
