package Automation;

//import java.io.File;
//import java.io.FileInputStream;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.poi.
//
//public class Logintest {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
//		
//		//launch Browser
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://the-internet.herokuapp.com/dropdown");
//		
//		
//		
//		FileInputStream fis= new FileInputStream("C:/test.xlsx");
//		
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		
//		XSSFsheet sheet = workbook.getSheet(0);
//		
//		for(int i=0;i<4;i++){
//			
//			WebElement name = driver.findElement(By.name("username")).sendKeys(getSheet.getrow(i).getCell(i));
//			
//			WebElement pwd = driver.findElement(By.name("username")).sendKeys(getSheet.getrow(i).getCell(i+1));
//			
//			WebElement submit = driver.findElement(By.name("submit")).click();
//			
//			String message= driver.findElement(By.xpath("xpath")).getText();
//			
//			if(message.equals("Login Successsful")){
//				
//				System.out.println("Success");
//			
//		}
//		
//			else {
//				
//				System.out.println("Login failed");
//			}
//		
//		
//		}	
//		
//
//	}
//
//}
