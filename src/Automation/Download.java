package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			Thread.sleep(2000);			
			driver.get("http://the-internet.herokuapp.com/download");

		//maximize			
			driver.manage().window().maximize();
			
			List<WebElement> list= driver.findElements(By.xpath("//div[@class='example']/descendant::a"));
			int size = list.size();
			System.out.println("No of file available on the webpage--->"+size);
			
			for (int i=0;i<size;i++){
				
				list.get(i).click();
				
			}			

	}

}
