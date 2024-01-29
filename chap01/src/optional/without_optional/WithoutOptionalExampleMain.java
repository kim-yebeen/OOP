package optional.without_optional;

public class WithoutOptionalExampleMain {

	public static void main(String[] args) {
		MapRepository mapRepository = new MapRepository();
		
		String string = mapRepository.getValue("NOT_EXIST_KEY");
		
		System.out.println("string= "+string);
		
		//대문자로 바꿔서 출력이나, 여기서 exception 발생
		//System.out.println(string.toUpperCase());
	
		if(string!=null) {
			//조건문으로 null 검사 후에
			System.out.println(string.toUpperCase());
		}
	}
}
