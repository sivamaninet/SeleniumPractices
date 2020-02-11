package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Authentication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			String message= driver.findElement(By.cssSelector("p")).getText();
			System.out.println(message);
			
			if(message.equals("HomePage"))
			{
				System.out.println("Congratulations! You must have the proper credentials.");
			}
			
			else{
				
				System.out.println("fail");
			}
			
			driver.quit();
	}

}
