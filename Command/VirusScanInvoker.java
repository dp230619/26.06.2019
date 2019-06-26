
public class VirusScanInvoker extends OperationInvokerBase{

	public VirusScanInvoker(CommandBase command) {
		super(command);
	}

	@Override
	public void start() {

		// check virus license
		// test every 30 second the scan has started...
		command.execute();
		
	}

	@Override
	public void cancel() {

		// check if scan is running
		command.cancel();
	}

}
