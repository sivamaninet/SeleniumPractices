package Automation;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.naming.MalformedLinkException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
	
	//launch Browser			
		WebDriver driver = new ChromeDriver();			
		Thread.sleep(2000);			
		driver.get("http://www.newtours.demoaut.com/");
		
		
		
		
		
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		int size= list.size();
		System.out.println("No of links Available:"+size);
		
		for(WebElement ele : list){			
						
			try {
				URL u = new URL(ele.getAttribute("href"));
				HttpURLConnection conn = (HttpURLConnection)u.openConnection();
				conn.setRequestMethod("GET");
				int responsecode = conn.getResponseCode();
				if(responsecode!=200){
					
					System.out.println("Broken Links-------->"+ ele.getAttribute("href"));
		
				}
				
				else{
					
					System.out.println("Fine Links-------->"+ ele.getAttribute("href"));
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
driver.quit();
	
}


}
