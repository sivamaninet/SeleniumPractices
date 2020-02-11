package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
			
//launch Browser			
	WebDriver driver = new ChromeDriver();			
	Thread.sleep(2000);			
	driver.get("http://the-internet.herokuapp.com/dropdown");

//maximize			
	driver.manage().window().maximize();

//dd		 
	WebElement ele = driver.findElement(By.id("dropdown"));		   
	System.out.println(ele.getText());
   
//Get first selected option
	Select selectopt = new Select(driver.findElement(By.id("dropdown")));
	String s= selectopt.getFirstSelectedOption().getText();
	System.out.println(s);
   
//select by index,value,visible text
	selectopt.selectByIndex(1);
	Thread.sleep(1000);
	selectopt.selectByValue("2");
	Thread.sleep(1000);
	selectopt.selectByVisibleText("Option 1");
	Thread.sleep(1000);		   
			
driver.quit();

	}
}
