import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		TurnOnInvoker tunrOnInvoker = new TurnOnInvoker(new TurnOnMachine(new WindowsMachine()));
		List<OperationInvokerBase> invokers = new ArrayList<>();
		invokers.add(tunrOnInvoker);
		OperationCleanUpService cleanUp = new OperationCleanUpService(invokers);
		cleanUp.batchExecute();
		
		
	}

}
