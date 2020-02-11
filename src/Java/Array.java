package Java;

import java.util.Arrays;
import java.util.Collections;

public class Array {
	
	

	public static void main(String[] args) {
		//Merge two Arrays
		
		
		int[] arr1 = { 12,50,77,84,131};
		int[] arr2=  {32,44,9,89,21};
		int[] arr3 = new int[arr1.length+arr2.length];
		int c= 0;		
			
	for(int i=0;i<arr1.length;i++){
				
		arr3[i] = arr1[i];			
		c++;
			
		}
		
		
		
	
	System.out.println(Arrays.toString(arr3));
	
	
	for(int j=0;j<arr2.length;j++){
		
		arr3[c++] = arr2[j] ;
		
	}
	
	System.out.println(Arrays.toString(arr3));
		
	for(int k=0;k<arr3.length;k++){
		
				
		System.out.print (arr3[k]+" ");		
		
		
			}	
	

	  
Arrays.sort(arr3);
 System.out.print(Arrays.toString(arr3));
	
	}

	}
