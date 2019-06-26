
public abstract class CommandBase {
	
	protected IMachine machine;
	
	public abstract void execute();
	
	public abstract void cancel();

	public CommandBase(IMachine machine) {
		super();
		this.machine = machine;
	}

	public IMachine getMachine() {
		return machine;
	}

	
}
