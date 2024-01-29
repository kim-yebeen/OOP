package lessif.early_return;

public class Client {

	public int someMethod(CalculateCommand calculateCommand) {
		CalculateType calculateType = calculateCommand.getCalculateType();
		int num1=calculateCommand.getNum1();
		int num2=calculateCommand.getNum2();
		
		int result=0;
		
		//early return은 핵심 로직 수행 전에 아예 리턴구문과 함께 앞쪽에 검사 로직을 배치하는 것이다.
		//return 이 실행되는 순간 메서드가 종료되기 때문에 핵심 로직을 불완전한 상태로 수행하지 않는다.
		
		//if문을 되도록 쓰지 말자는 것이지 if문을 불가피한 상황에서도 쓰지 말자는 의미는 아니다.
		if(calculateType ==null) {//null인 경우는 바로 return해서 추가로직 실행 방지
			return result;
		}
		
		//num2가 0이 아닌지 여부만 확인하면, 더하기 빼기 곱하기 등 0이어도 상관없는 연산까지 막으므로
		//조건식은 DIVIDE면서 동시에 num2가 0인 경우만 처리
		if(calculateType.equals(calculateType.DIVIDE)&&num2==0) {
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
		
		if(calculateType.equals(calculateType.ADD)) {
			result=num1+num2;
		}else if(calculateType.equals(calculateType.MINUS)) {
			result=num1-num2;
		}else if(calculateType.equals(calculateType.MULTIPLY)) {
			result=num1*num2;
		}else if(calculateType.equals(calculateType.DIVIDE)) {
			result=num1/num2;
		}
		return result;
	}
}
