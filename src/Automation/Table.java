package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
			
			//launch Browser
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
			
			//maximize
			
			driver.manage().window().maximize();
			//get header of the table
			
		//*[@id="post-1877"]/div/div[1]/table/tbody/tr[1]/th[1]
			//*[@id="post-1877"]/div/div[1]/table/tbody/tr[1]
//Print all the headers			
			
//		List<WebElement> header=driver.findElements(By.xpath("//*[@id='post-1877']/div/div[1]/table/tbody/tr[1]/descendant::th"));
//		
//	    int colsize= header.size();
//		
//		System.out.println("Headers of table are listed below");
//		
//		for (WebElement ele : header) {
//			
//			System.out.println(ele.getText());
//		}
			
//print no of rows in a webtable
			//*[@id="post-1877"]/div/div[1]/table/tbody

//			List <WebElement> list=driver.findElements(By.xpath("//*[@id='post-1877']/div/div[1]/table/tbody/descendant::tr"));
//			int rowscount = list.size()-1;
//			System.out.println("No of rows available in the webtable:"+rowscount);
//			
			
//No.of columns			
			
//			List <WebElement> list=driver.findElements(By.xpath("//*[@id='post-1877']/div/div[1]/table/tbody/descendant::tr"));
//			int rowscount = list.size();
//			System.out.println("No of rows available in the webtable:"+rowscount);
//			
//			for (int i=2;i<=rowscount;i++){
//				
//				String beforexpath ="//*[@id='post-1877']/div/div[1]/table/tbody/tr[";
//				String afterxpath =	"]/descendant::td";				
//			List <WebElement> colval =	driver.findElements(By.xpath(beforexpath+i+afterxpath));
//			int noofcolumns= colval.size();			
//			System.out.println((i-1)+"row has "+ noofcolumns+ "columns" );
//		}
			
//name of book author- mukesh		
			
			List <WebElement> list=driver.findElements(By.xpath("//*[@id='post-1877']/div/div[1]/table/tbody/descendant::tr"));
			int rowscount = list.size();
			System.out.println("No of rows available in the webtable:"+rowscount);
			for(int i=2;i<=rowscount;i++){
			String beforexpath ="//*[@id='post-1877']/div/div[1]/table/tbody/tr[";
			String afterxpath =	"]/td[2]";
			WebElement ele =driver.findElement(By.xpath(beforexpath+i+afterxpath));
			//System.out.println((i-1) + "row Author column value is"+ ele.getText());
			if(ele.getText().equals("Mukesh")){
				
				String beforexpath1 ="//*[@id='post-1877']/div/div[1]/table/tbody/tr[";
				String afterxpath1 = "]/td[1]";				
				List<WebElement> listbook=driver.findElements(By.xpath(beforexpath1+i+afterxpath1));
				for (WebElement book : listbook) {
					System.out.println("Book written by Mukesh:"+book.getText());
				}
				
			}
			}
				
				
			
			
			
			
			
			
			
			
			
			driver.quit();
			
		}	

	

}
