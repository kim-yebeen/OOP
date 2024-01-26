package exception.unchecked_exception;

public class Client {

	public void throwsUncheckedExceptionMethod() throws UncheckedException{
		throw new UncheckedException();
	}
	
	public void tryCatchcheckedExceptionMethod() {
		//try~catch처리를 사용하는게 강제되진 않지만 사용을 못하는 것도 아님
		try {
			throw new UncheckedException();
		}catch(UncheckedException e) {
			e.printStackTrace();
		}
	}
}
