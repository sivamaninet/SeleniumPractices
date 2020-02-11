package Java;
public class Missingnumber {

	public static void main(String[] args) {
		
		
		int arr[] = {2,7,10};
		
		int arr1= arr.length;
		
		 int n = arr1+1;
		
	     int	sum = n*(n+1)/2;
	     
	     System.out.println(sum);
	     
	     int result = 0;
	     
	     for(int i=0;i<arr1;i++){
	    	 
	    	 result = result+arr[i];
	    	 
	     }
	     
	int missingnumber = sum-result;
	System.out.println(missingnumber);
	
		

	}

}
