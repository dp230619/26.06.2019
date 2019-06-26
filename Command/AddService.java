
public class AddService extends CommandBase {

	public AddService(IMachine machine) {
		super(machine);
	}

	@Override
	public void execute() {
		machine.addService();
	}

	@Override
	public void cancel() {
		machine.removeService();
	}

}
