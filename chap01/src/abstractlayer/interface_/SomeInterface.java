package abstractlayer.interface_;

public interface SomeInterface {

	void someMethod();
	
	default void defaultMethod() {
		//default 키워드르를 메서드에 붙이면 인터페이스 내부에서도 구현된 메서드를 가질 수 있습니다.
		this.someMethod();
	}
}
