package inheritance.extend;

public class Child extends Parent{
	public void anoterMethod() {
		System.out.println("Childe anotherMethod");
		
		this.parentPublicInt=0;
		this.parentProtectedInt=0;
		//private 변수는 상속이 되지 않습니다.
		//this.parentPrivateInt=0;
	}
}
