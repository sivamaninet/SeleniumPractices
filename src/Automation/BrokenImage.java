package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
					
			driver.get("http://the-internet.herokuapp.com/broken_images");

		//maximize			
			driver.manage().window().maximize();
			
			
			List<WebElement> list= driver.findElements(By.tagName("img"));
			int size = list.size();
			System.out.println("No of Images available on the page:"+ size);
			
			for(WebElement img : list){
				
				try {
					URL u = new URL(img.getAttribute("src"));			
					
					HttpURLConnection conn= (HttpURLConnection)u.openConnection();					
					conn.setRequestMethod("GET");
					int responsecode = conn.getResponseCode();
					if(responsecode !=200){
						
						System.out.println("Broken Image-------->"+img.getAttribute("src"));
					}
					
					else{
						System.out.println("Fine Image-------->"+img.getAttribute("src"));
					}
					
				}
						
				 catch(Exception e) {					
					e.printStackTrace();
				} 		
				
			}
			
			driver.quit();
			
			
	}

}
