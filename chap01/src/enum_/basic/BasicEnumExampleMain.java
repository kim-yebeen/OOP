package enum_.basic;

public class BasicEnumExampleMain {

	public static void main(String[] args) {
	CalculateCommand calculateCommand = new CalculateCommand(
			CalculateType.ADD, //이늄 타입은 ADD
			100, //num1에 100대입
			3 //num2에 3 대입
			);// 클라이언트가 요청할 때 calculateCommand 객체가 제공한 데이터를 사용
	Client client = new Client();
	int result=client.process(calculateCommand);
	
	System.out.println(result);
	}
}
