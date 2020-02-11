package Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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

public class DDfile {

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

//System.out.println(size);

File f = new File("E:\\Test.xlsx");
FileInputStream fis = new FileInputStream(f);	

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);
//Get the current count of rows in excel file
int rowCount = sheet.getLastRowNum();
System.out.println(rowCount);

List<String> l = new ArrayList<String>();

for(int i=0;i<=rowCount;i++){
	
	System.out.println(i);	
	String s =sheet.getRow(i).getCell(0).getStringCellValue();	
	
	l.add(s);
	


}


//for (String s: l) {
//	
//	System.out.println(s);
//	
//	
//}

//for(int j=0;j<size;j++){

//String value = list.get(j).getText();

//System.out.println(value);
//if(l.indexOf(value)==j){
//System.out.println("Match found ");	
//}
//
//else{
//	System.out.println("Match not found ");		
//}
	
//}

String sfi= "Option 2";
int index=-1 ;

for(int k=0;k<size;k++){
	
	String value = list.get(k).getText();
	//System.out.println(value);
	
	if(value.equals(sfi)){
		
		index= k;
		System.out.println(index);
		
		
	}
	 
	
}

if(l.indexOf(sfi)==index){
	System.out.println("Match found ");	
	}
	
	else{
		System.out.println("Match not found ");		
	}
wb.close();
fis.close();
driver.quit();

	}

}
