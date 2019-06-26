
public class TurnOffMachine extends CommandBase {

	public TurnOffMachine(IMachine machine) {
		super(machine);
	}

	@Override
	public void execute() {
		machine.turnOff();
	}

	@Override
	public void cancel() {
		machine.turnOn();
	}

}
