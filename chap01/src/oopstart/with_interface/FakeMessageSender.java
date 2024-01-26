package oopstart.with_interface;

public class FakeMessageSender implements MessageSender{

	@Override
	public void send() {
		System.out.println("FakeMessageSender : 고객에게 메세지가 가진 않습니다.");
	}

}
