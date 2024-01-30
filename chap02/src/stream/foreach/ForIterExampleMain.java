package stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForIterExampleMain {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);
		
		//integerList에서 40을 탐색하고, 찾으면 즉시 종료시키는 반복문
		for(int i=0; i<integerList.size();i++) {
			System.out.println(integerList.get(i));
			if(integerList.get(i)==40) {
				System.out.println("40 찾았음!");
				break;
			}
		}
	}
}
