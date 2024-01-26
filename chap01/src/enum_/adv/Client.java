package enum_.adv;

public class Client {
	
	public int process(CalculateCommand calculateCommand) {
		CalculateType calculateType = calculateCommand.getCalculateType();
		int num1=calculateCommand.getNum1();
		int num2=calculateCommand.getNum2();
		
		//basic쪽과는 달리 adb에서는 client에 상세한 계산 로직이 포함되지 않음.
		//client는 어떤 연산을 수행할지만 알고, 해당 로직의 상세한 내용을 모름
		// == 클라이언트는 해당 로직에 대한 책임이 없음
		// == 수정이 필요할 때 클라이언트측 코드를 볼 필요가 없음.
		int result = calculateType.calculate(num1, num2);
		
		return result;
	}
}
