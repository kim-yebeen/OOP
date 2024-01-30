package stream.foreach;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ForEachIterExampleMain {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);
		
									//람다식을 내부에서 받는 반복문
		integerList.stream().forEach(integer ->{ //integer 변수에 매번 10,20,30 ... 순차대입
			System.out.println(integer);//순차대입된 값을 콘솔창에 찍어보기
			
			if(integer ==40) {
				System.out.println("40찾았음");
				throw new RuntimeException("이러면멈춘다.");
			}
		});
		
		
		
	}
}
