package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			Thread.sleep(2000);			
			driver.get("http://the-internet.herokuapp.com/upload");

		//maximize			
			driver.manage().window().maximize();
			WebElement upload=driver.findElement(By.id("file-upload"));
			upload.sendKeys("C:\\Users\\Sivamani\\Downloads\\newplot.png");
			driver.findElement(By.id("file-submit")).click();
			Thread.sleep(1000);
			 String text= driver.findElement(By.cssSelector("h3")).getText();
			if(text.equals("File Uploaded!")){
				System.out.println("File uploaded successfully");
			}
			else
			{
				System.out.println("Fail to upload");
			}

driver.quit();			

	}

}
