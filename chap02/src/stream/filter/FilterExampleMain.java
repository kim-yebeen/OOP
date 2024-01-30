package stream.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleMain {
	public static void main(String[] args) {
List<Integer> integerList = new ArrayList<>();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);
		
		Integer findNumber = integerList.stream().filter(integer ->{
			System.out.println(integer);
			
			if(integer.equals(40)) {
				return true; //true를 리턴하는 것이 아니고, 필터로 찾던 자료가 맞다는 의미임.
			}
			return false; //false를 리턴하는 것이 아니고, 필터로 찾던 자료가 아니라는 의미임.
		}).findAny().get();
		System.out.println("findNumber="+findNumber);
	}
}

