package encapsulation.constructor;

public class Client {

	public int process(CalculateCommand calculateCommand) {
		int result = calculateCommand.getCalculateResult();
		return result;
	}
}
