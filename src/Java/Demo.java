 package Java;

 class Demo {

 	public static void main(String[] args) {
 		
 		Animal a = new Cat();
 		a.message();		
 	    a.Sound();
 		

 	}

 }


 abstract class Animal{
 	
 	public  abstract void message();	
 	
 	public void Sound(){
 		
 		System.out.println("Non-Abstract method");		
 		
 	}
 	
 }

 class Cat  extends Animal{
 	
 	public void message(){
 		
 		System.out.println("child class abstract method");
 	}
 	
 }


 
 
 