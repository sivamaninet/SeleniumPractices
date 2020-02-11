package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstampdd {
	
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
	
	//launch Browser
	
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
	
	//maximize
	
	driver.manage().window().maximize();
	
	WebElement dd= driver.findElement(By.xpath("//ul//li//button[@class='dropdown dropdown-toggle']"));
	dd.click();
	
	List<WebElement> list= dd.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//a"));
	int size = list.size();
	System.out.println(size);
	
	for (int i=0;i<size;i++){
		
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("PHP")){
			list.get(i).click();
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	Thread.sleep(4000);
	
	driver.quit();

}

}