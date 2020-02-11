package Java;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
//		String a = "Sowmiyadevi";	
		
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a= a1.nextLine();
		char[] arr = a.toLowerCase().toCharArray();
		
		//int[] arr ={1,2,4,1,3,2,5};
		int s = arr.length;
		char temp;
		System.out.println(s);
		
		for(int i=0;i<s;i++){
			
			for(int j=i+1;j<s;j++){
				
				if(arr[i]>arr[j])				
									{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;					
				}			
				
				
			}
		
			
	    }

		
		for (char c : arr) {
			
			System.out.print(c +" "); 
			
		}	
		
		 
	    

	}

}
