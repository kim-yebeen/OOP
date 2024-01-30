package encapsulation.setter;

public class CalculateCommand {

	//연산에 필요한 변수들
	private CalculateType calculateType;
	private int num1;
	private int num2;
	
	public void setCalculateType(CalculateType calculateType) {
		this.calculateType = calculateType;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	//기존 getter는 모두 삭제
	//그러나 연산은 이뤄져야 하므로 전체적 연산 결과만 얻어주는(내부 변수가 뭐가 있는지 하나하나 추론할 수 없음)
	//getter를 하나 만들어줌.
	public int getCalculateResult() {
		CalculateType calculateType = this.calculateType;
		int num1 = this.num1;
		int num2 = this.num2;
		
		//생성자에서 이미 연산
		int result = calculateType.calculate(num1, num2);
		
		return result;
	}

	
}
