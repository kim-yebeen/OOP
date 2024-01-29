package object.equals;

import java.util.Objects;

public class SomeObject {

	private int intField;
	private String stringField;
	
	public SomeObject(int intField, String stringField) {
		this.intField = intField;
		this.stringField = stringField;
	}
	
	public int getIntField() {
		return intField;
	}
	
	public String getStringField() {
		return stringField;
	}
	
	@Override
	public boolean equals(Object o) {
		//참조 주소가 같으면 int와 string이 같은지 비교할 필요 없ㅇ ㅣ 바로 참으로 인식
		if(this == o) return true;
		
		//유효하지 않은 Object o를 집어넣었다면 이 역시 비교대상이 될 수 없으므로 바로 거짓으로 인식
		if( o==null||getClass()!= o.getClass()) return false;
		
		//파라미터로 받은 Object는 다형성 원리에 의해서 부모클래스 위치에 SomeObject라는 자식객체를
		//받았을 것이므로 먼저 다시 SomeObject로 자료형을 캐스팅해준다음
		SomeObject that=(SomeObject) o;
		
		//캐스팅되어 SomeObject로 돌아온 객체와 현재 비교하려는 객체의 intField와 stringField를 비교해
		//모두 일치하는 경우에 true를 리턴하도록 구성
		return intField ==that.intField&&Objects.equals(stringField, that.stringField);
	
	}
}
