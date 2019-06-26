
public class TurnOnMachine extends CommandBase {

	public TurnOnMachine(IMachine machine) {
		super(machine);
	}

	@Override
	public void execute() {
		machine.turnOn();
	}

	@Override
	public void cancel() {
		machine.turnOff();
	}

}
