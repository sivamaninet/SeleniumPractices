package Java;

//import java.util.Collections;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet numbers = new HashSet();
		
		
		numbers.add(100);
		numbers.add(1000);
		numbers.add(10000);
		numbers.add(10);
		numbers.add(10);
		
		System.out.println(numbers);
		
		
		HashSet numbers1 = new HashSet();
		
		numbers1.add(20);
		numbers1.add(20000);
		numbers1.add(200);
		System.out.println(numbers1);
		
		HashSet numbers2= new HashSet(numbers);	
		numbers2.addAll(numbers);
		numbers2.addAll(numbers1);
		
		System.out.println(numbers2);
		
		

	}

}
