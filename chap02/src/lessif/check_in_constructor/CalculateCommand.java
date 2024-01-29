package lessif.check_in_constructor;

public class CalculateCommand {

	private CalculateType calculateType;
	private int num1;
	private int num2;
	
	public CalculateCommand(CalculateType calculateType, int num1, int num2) {
		//생성자 내부에서 1.calculateType이 null인지 여부를
		//2. DIVIDE 연산인 경우 num2가 0인지 여부를 확인합니다.
		if(calculateType==null) {
			throw new RuntimeException("CalculateType은 필수 값입니다.");
		}
		if(calculateType ==CalculateType.DIVIDE && num2==0) {
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
		
		this.calculateType = calculateType;
		this.num1 = num1;
		this.num2 =num2;
	}
	
	public CalculateType getCalculateType() {
		return calculateType;
	}

	public int getNum1() {
		return num1;
	}

	
	public int getNum2() {
		return num2;
	}

	
}
