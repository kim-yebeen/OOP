package exception.checked_exception;

public class Client {
	//throws를 우측에 붙인 메서드는 해당 메서드 내부가 아닌 해당 메서드를 호출하는 지여겡서
	//try~catch로 예외처리를 떠넘깁니다.
	public void throwsCheckedExceptionMethod() throws CheckedException{
		throw new CheckedException();
	}
	public void tryCatchCheckedExceptionMethod() {
		//checked exception의 경우 발생 구문이 호출되면 무조건 예외처리가 동반되어야 합니다.
		try {
			throw new CheckedException();
		}catch(CheckedException e) {
			//예외처리 코드
			e.printStackTrace();
		}
	}
}
