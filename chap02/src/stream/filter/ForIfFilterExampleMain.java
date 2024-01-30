package stream.filter;

import java.util.List;
import java.util.ArrayList;

public class ForIfFilterExampleMain {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);

		Integer findNumber = null;
		
		for(int i=0;i<integerList.size();i++) {
			System.out.println(integerList.get(i));
			
			if(integerList.get(i).equals(40)) {
				findNumber = integerList.get(i);
				break;
			}
		}
		System.out.println("findNumber ="+findNumber);
		
	}
}
