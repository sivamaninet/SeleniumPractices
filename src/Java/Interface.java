package Java;

public class Interface {

	public static void main(String[] args) {
		
		Samsung sg = new Samsung();
		
		sg.message();
		sg.pixels();
	
		
	}

}

interface Mobile{
	
	String s= "Tested";
	
	void message();
}

interface Camera{
	
	void pixels();
}
class Samsung implements Mobile,Camera{
	
	public void message(){
		
		System.out.println("Samsung mobile is "+ ""+ s);
		
	}
		
	public void pixels(){
		
		System.out.println("Camera has 1080 pixels");
	}
	
	}
