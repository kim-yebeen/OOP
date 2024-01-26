package exception.unchecked_exception;

public class UncheckedExceptionExampleMain {
	
	public static void main(String[] args) {
		Client client = new Client();
		
		//throws로 던져진 예외이지만 try~catch를 강요받지는 않음
		//사용 불가도 아니기 때문에 try~catch를 안 써도 돌아감
		try {
		client.throwsUncheckedExceptionMethod();
		}catch(UncheckedException e) {
			e.printStackTrace();
		}
		client.tryCatchcheckedExceptionMethod();
	}
}
