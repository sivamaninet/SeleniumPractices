package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			Thread.sleep(2000);			
			driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	 		Thread.sleep(2000);
			driver.manage().window().maximize();
			
		
			String parentwindow= driver.getWindowHandle();
			System.out.println("Session id for parent window------->"+ parentwindow);
			System.out.println("Page title------->" + driver.getTitle());
			
			Set<String> s1= driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();
			
			while(i1.hasNext()){
				
				String chidwindow = i1.next();
				
				if(!parentwindow.equalsIgnoreCase(chidwindow)){
					
					driver.switchTo().window(chidwindow);
					Thread.sleep(1000);					
					System.out.println("Page title----->" + driver.getTitle());
					driver.close();
					
				}
			}
			
			
			
			driver.switchTo().window(parentwindow);
			System.out.println("Page title------->" + driver.getTitle());
			
			
		
			driver.quit();

	}

}
