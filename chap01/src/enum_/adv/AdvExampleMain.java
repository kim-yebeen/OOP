package enum_.adv;

public class AdvExampleMain {
	public static void main(String[] args) {
		CalculateCommand calculateCommand = new CalculateCommand(
				CalculateType.ADD,//이늄타입은 ADD 
				100, //num1에 100대입 
				0);//num2에 3 대입
		Client client = new Client();
		int result = client.process(calculateCommand);
		
		System.out.println(result);
	
	}
}
