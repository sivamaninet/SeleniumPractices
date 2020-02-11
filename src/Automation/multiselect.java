package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
//launch Browser			
	WebDriver driver = new ChromeDriver();			
	Thread.sleep(2000);			
	driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");

//maximize			
	driver.manage().window().maximize();



	WebElement ele = driver.findElement(By.className("custom-select"));
	System.out.println(ele.getText());
	
	Select mul= new Select(driver.findElement(By.className("custom-select")));
	mul.deselectByIndex(0);
	mul.selectByIndex(1);
	mul.selectByIndex(2);
	Thread.sleep(1000);
	
//	List<WebElement> list= mul.getOptions();
//
//
//for(WebElement ele1 : list){
//	System.out.println(ele1.getText());	
//	
//}	

System.out.println("success");
//	
	driver.close();
	//Thread.sleep(1000);

		

	}

}
