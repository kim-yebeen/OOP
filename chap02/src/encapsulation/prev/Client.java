package encapsulation.prev;

public class Client {
	public int process(CalculateCommand calculateCommand) {
		//연산 요청에 필요한 모든 정보를 얻어옴.
		// 이 과정에서 Client가 불필요하게 ClientCommand 내부구조를 짐작할 수 있음.
		
		//calculateCommand가 3줄 호출되고 있음 -> 결합도가 높음
		CalculateType calculateType = calculateCommand.getCalculateType();
		int num1 = calculateCommand.getNum1();
		int num2 = calculateCommand.getNum2();
		
		//그래도 호출은 복잡한 로직을 직접 기술하지 않고 정리된 메서드로 할 수 있음
		int result = calculateType.calculate(num1, num2);
		
		return result;
	}
}
