package object.tostring_;

public class ToStringExampleMain {

	public static void main(String[] args) {
		SomeObject someObject1 = new SomeObject(1,"pppp");
		SomeObject someObject2 = new SomeObject(2,"qqqq");
		
		//toString()에서 리턴하는 문자열이 콘솔에 찍힘
		//재정의하지 않았다면 레퍼런스 주소만 찍힘
		System.out.println(someObject1);
		System.out.println(someObject2);
		
		
	}
}
