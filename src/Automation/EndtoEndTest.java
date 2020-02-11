package Automation;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			Thread.sleep(1000);			
			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
		String spath =System.getProperty("user.dir")+ File.separator +"XrayConfig.properties";
		
		System.out.println(spath);
//	WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
//	String s =  btn.getText();
//	System.out.println(s);	
//	btn.click();
//	Thread.sleep(1000);		
//	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("headset");
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
//	 
//	 	
//	 
//	 
//	List<WebElement> li =  driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/descendant::div"));
//	int l=li.size();
	
//	String text ="";
	
	
//	for (int i=0;i<l;i++){
//		
//	   li.get(i).findElement(By.xpath("//a[@class='_2cLu-l']")).click();
//	
	//if(text.equals("Realme Buds 2 Wired Headset with Mic")){
		
    //text
    
    
	//}
		
	//}
	
	
	
	//Thread.sleep(4000);
	
//	System.out.println("done");
//driver.quit();	
		
	}

}
