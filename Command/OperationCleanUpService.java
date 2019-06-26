import java.util.List;

public class OperationCleanUpService {

	List<OperationInvokerBase> cleanUpInvokers;

	public List<OperationInvokerBase> getCleanUpInvokers() {
		return cleanUpInvokers;
	}

	public void setCleanUpInvokers(List<OperationInvokerBase> cleanUpInvokers) {
		this.cleanUpInvokers = cleanUpInvokers;
	}
	
	public OperationCleanUpService(List<OperationInvokerBase> cleanUpInvokers) {
		super();
		this.cleanUpInvokers = cleanUpInvokers;
	}

	public void batchExecute()
	{
		for(OperationInvokerBase oper : cleanUpInvokers)
		{
			oper.start();	
		}
	}
	
	public void shutDown()
	{
		for(OperationInvokerBase oper : cleanUpInvokers)
		{
			oper.cancel();	
		}
	}
	
}
