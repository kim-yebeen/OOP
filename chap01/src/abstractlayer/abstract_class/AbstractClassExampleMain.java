package abstractlayer.abstract_class;

public class AbstractClassExampleMain {
	
	public static void main(String[] args) {
		//추상 클래스의 인스턴스를 직접 생성해주고 싶다면?
		AbstractClass abstractClass = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				// 생성자에서 직접 추상메서드를 구현해주면 상속 없이 생성 가능
				System.out.println("Abstract Class 내부에서 정의한 abstractMethod()");
				
			}
		};
		
		abstractClass.inplementedMethod();
		abstractClass.abstractMethod();
		
		System.out.println("-----------");
		
		AbstractClass extendedClass = new ExtendedClass();
		extendedClass.inplementedMethod();
		extendedClass.abstractMethod();
	}//정의가 안되어있는 메서드
}
