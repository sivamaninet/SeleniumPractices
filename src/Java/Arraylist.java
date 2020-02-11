package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);		
		System.out.println(numbers);

		numbers.add(3,1000);
		System.out.println(numbers);
		
		numbers.remove(3);
		System.out.println(numbers);
		
//		List<String> names = new ArrayList<>();
//		
//		names.add("Sowmiya");
//		names.add("Siva");
//	    names.add("");
//	    names.add("Siva");
//	    names.add("mani");    
//		
//		System.out.println(names);
//		
//		names.add(1,"Devi");
//		System.out.println(names);
//		
//		names.remove(3);
//		System.out.println(names);
//		
//		names.remove("mani");
//		System.out.println(names);
//		
//		names.removeAll(names);
//		System.out.println(names);
		
		
		

	}

}
