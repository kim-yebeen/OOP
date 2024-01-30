package encapsulation.setter;

public class SetterCodeExampleMain {

	public static void main(String[] args) {
		//빈 객체를 기본 생성자로 생성하기
		CalculateCommand calculateCommand = new CalculateCommand();
		
		//아래 구문 중 하나를 까먹고 대입해주지 않는다면?
		//그래도 오류를 딱히 띄우지 않을수도 있는 것이 setter를 활용한 변수 초기화(setter 주입)의 단점 중 하나.
		calculateCommand.setCalculateType(CalculateType.ADD);
		calculateCommand.setNum1(100); //주석처리시 num1은 자동으로 0이 됨
		calculateCommand.setNum2(3); //num2도 마찬가지
		
		Client client = new Client();
		int result = client.process(calculateCommand);
		System.out.println(result);
	}
}
