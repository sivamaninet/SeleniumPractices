package Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * @author Sivamani
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
	
	//launch Browser
	
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.get("https://google.com");
	
	//maximize
	
	driver.manage().window().maximize();
	
	//Search
	
	 driver.findElement(By.name("q")).sendKeys("Testing");

	 WebElement var = driver.findElement(By.xpath("//ul[@role='listbox']"));
	
	 List <WebElement> listbox=  var.findElements(By.tagName("li"));
	for (WebElement li : listbox) {
		System.out.println(li.getText());
	}
	 
//	List <WebElement> listbox1=  driver.findElements(By.xpath("//ul[@role='listbox']//li//div//div//div//span"));
//	
//	int list = listbox1.size();
//	System.out.println(list);
//	
//	
//	for(int i=0;i<list;i++){
//		System.out.println(listbox1.get(i).getText());
//	}
	
	
		
	}

}
