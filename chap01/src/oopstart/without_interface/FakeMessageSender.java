package oopstart.without_interface;

public class FakeMessageSender {

	//메세지를 실제로 발송하지는 않고 모의로 발송하는 척만 합니다. 
	public void send() {
		System.out.println("FakeMessageSender : 고객에게 메세지가 가진 않습니다.");
	}
}
