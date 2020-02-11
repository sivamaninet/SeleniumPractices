package Automation;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDexcel {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumbersetup\\chromedriver_win32\\chromedriver.exe");
		
		//launch Browser			
			WebDriver driver = new ChromeDriver();			
			Thread.sleep(2000);			
			driver.get("http://the-internet.herokuapp.com/dropdown");

		//maximize			
			driver.manage().window().maximize();

Select dd = new Select(driver.findElement(By.id("dropdown")));
List<WebElement> list = dd.getOptions();
int size= list.size();

System.out.println(size);

File f = new File("E:\\Test.xlsx");
FileInputStream fis = new FileInputStream(f);	

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);
//Get the current count of rows in excel file

//int rowCount = sheet.getLastRowNum();



for(int i=0;i<=size-1;i++){ 

	try {		
		sheet.createRow(i).createCell(0).setCellValue(list.get(i).getText());		
	} 
	catch (Exception e) {
		
		e.printStackTrace();
	}

}

fis.close();


FileOutputStream fout=new FileOutputStream(f);

wb.write(fout);

fout.close();

wb.close();

 


driver.quit();
			
 
 
	}

}
