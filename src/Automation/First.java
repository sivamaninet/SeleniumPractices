package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();	
			//Thread.sleep(2000);
			driver.get("guru99.com/software-testing.html");
			//Thread.sleep(2000);
//			
//			driver.manage().window().maximize();
//			
//	List<WebElement> links = driver.findElements(By.tagName("a"));
//	int Alllinks = links.size();
//	System.out.println(Alllinks);
//	
//	for (WebElement ele : links) {
//		
//		System.out.println(ele.getAttribute("href"));
//		
//	}	
//		
//	driver.close();
	}

}
