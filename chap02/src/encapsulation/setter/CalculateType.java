package encapsulation.setter;

import java.util.function.BiFunction;

public enum CalculateType {
//basic과는 다르게, 연산 종류와, 연산 메커니즘을 함께 정의함
	//관련된 자료들이 잘 모여있음(응집도가 높아졌음!)
	ADD((num1, num2)->num1+num2), //화살표 안쪽 : 받는 파라미터들, 화살표 오른쪽 : 리턴자료
	MINUS((num1, num2)->num1-num2),
	MULTIPLY((num1, num2)->num1*num2),
	DIVIDE((num1, num2)->num1/num2);
	
	//위에 붙인 익명함수들은 BiFunction이라는 타입으로 멤버변수를 정의해야 사용 가능
	//따라서, 생성자에서 BiFuntion을 주입받도록 처리
	CalculateType(BiFunction<Integer, Integer, Integer> expression){
		this.expression = expression;
	}
	private BiFunction<Integer, Integer, Integer> expression;
	
	public int calculate(int num1, int num2) {
		return this.expression.apply(num1, num2);
	}
}
