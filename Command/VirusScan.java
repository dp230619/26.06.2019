
public class VirusScan extends CommandBase {

	public VirusScan(IMachine machine) {
		super(machine);
	}

	@Override
	public void execute() {
		System.out.println("Starting virus scan....");
		machine.startVirusScan();
	}

	@Override
	public void cancel() {
		System.out.println("Cancelling virus scan....");
		machine.cancelVirusScan();
	}

}
