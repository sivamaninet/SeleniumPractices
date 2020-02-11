
package Java;



public class Static
{
	
	
	static int value(int a,int b){			
	
	int c=a+b;
	System.out.println("Values are->"+c);
	return c;
	
	
	}


void display(){
	
	System.out.println("This is non- static block");
	
}
	
	public static void main(String[] args){
		
//Calling Static method
		
		Static.value(5,10);
		
//Calling non-static method
		Static s= new Static();
        s.display();		
		
		
		
	}

}


  