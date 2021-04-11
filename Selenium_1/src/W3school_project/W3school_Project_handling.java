package W3school_project;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3school_Project_handling 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);		

	//  Click on tutoRials...
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
		
	//Verify display Or Not...
		Thread.sleep(2000);
		boolean data = driver.findElement(By.xpath("(//a[text()='Learn SQL'])[2]")).isDisplayed();
		
		System.out.println("Data is Matched=" +(data));
		
	// Click On Learn SQL....
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='Learn SQL'])[2]")).click();
		
     // Click On Try yourself tab....
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();

	// Clear Command window....
   Thread.sleep(3000);
   Set<String> child1 = driver.getWindowHandles();
	ArrayList<String> list=new ArrayList<String>(child1);
	Thread.sleep(2000);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	Thread.sleep(1000);
	driver.switchTo().window(list.get(1));
	Thread.sleep(3000);
	
	
	//driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");
  Thread.sleep(6000);
	WebElement eledata = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
    eledata.click();
 // Clear Text...
    
   Actions act=new Actions(driver);
   act.click(eledata).perform();
   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
  /* for(int i=1; i<=38; i++)
   {
	   act.sendKeys(Keys.BACK_SPACE).perform();
	  // Thread.sleep(500);
   }
*/
  // Get Excel data And Enter query..
     FileInputStream file1=new FileInputStream("D:\\Class Java Notes Of Manual testing\\Sprint_Backlog_W3School_Project.xlsx");

   Sheet data11 = WorkbookFactory.create(file1).getSheet("Sheet1");
  String value = data11.getRow(7).getCell(6).getStringCellValue();
	System.out.println(data11);


    // Enter in text boxx....
	Thread.sleep(3000);
   act.sendKeys(value).perform();

   
   // Click on Run..
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
   
   
	// Handle Alert Popup....
   Thread.sleep(4000);
   Alert pop = driver.switchTo().alert();
   Thread.sleep(3000);
	 pop.accept();
	 
   
   // Then Clear Text...
	 eledata.click();
	 Thread.sleep(1000);
	 for(int i=1; i<=30; i++)
	   {
		   act.sendKeys(Keys.BACK_SPACE).perform();
	   }

   // Enter Correct Data from Excel sheet
	 Thread.sleep(3000);
	  String value2 = data11.getRow(9).getCell(6).getStringCellValue();
   act.sendKeys(value2).perform();
   
  // Click on Run..
   Thread.sleep(1000);
   driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
   

   //Verify shipper Name...
   String exp="Speedy Express";
   String exp1="United Package";
   String exp2="Federal Shipping";
   
  /* int TotalRow = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody//tr")).size();
	//System.out.println(TotalRow); 
	
   for(int i=1; i<=TotalRow; i++)
	{
	List<WebElement> cell = driver.findElements(By.xpath("//table[@class=\"w3-table-all notranslate\"]//td[2]"));
	
	for(WebElement cell1:cell)
	{
		//System.out.println(cell1.getText());
	
    if(exp.equals(cell1.getText()))
    {
    	System.out.println("present");
    	
    }
    
	}
   
	}
	
	*/
   // Scroll Down..
   Thread.sleep(2000);
   WebElement scroll = driver.findElement(By.xpath("//span[@id='buttonshowdesc']"));
   act.moveToElement(scroll).perform();
   
   // take screenShot..
   Thread.sleep(2000);
   File shot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   System.out.println(shot1);
   
   
   // Go To the previous Page..
   Thread.sleep(10000);
	driver.switchTo().window(list.get(0));
	
	
//	driver.get("https://www.w3schools.com/sql/sql_distinct.asp");
	String title1="SQL Tutorial";
	   Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
   if(title1.equals(title))
   {
	   System.out.println("Sucessfully Main Page Open");
   }
   
   //Click On SQL select Distint ..
    Thread.sleep(8000);
    driver.findElement(By.xpath("//div[@class='w3-light-grey']/a[5]")).click();
    Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
   
	//Change Focus.
	 Thread.sleep(4000);
	   Set<String> child2 = driver.getWindowHandles();
		ArrayList<String> list2=new ArrayList<String>(child2);
		Thread.sleep(2000);
	//	System.out.println(list2.get(0));
	//	System.out.println(list2.get(1));
		Thread.sleep(1000);
		driver.switchTo().window(list2.get(2));
		Thread.sleep(3000);
		
	//Click On Text..
		Thread.sleep(4000);
		WebElement textbox = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
		textbox.click();
		
		for(int i=1; i<=60; i++)
		   {
			   act.sendKeys(Keys.BACK_SPACE).perform();
		   }	
		   
       // enter text....
		Thread.sleep(4000);
		 String value3 = data11.getRow(17).getCell(6).getStringCellValue();
		   act.sendKeys(value3).perform();
   
         // Click On Run..
		   Thread.sleep(2000);
          driver.findElement(By.xpath("//button[text()='Run SQL »']")).click();
   
   
           //print All Table...
          Thread.sleep(2000);
         List<WebElement> celldata = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']//tr"));
         for(WebElement cellda:celldata)
         {
        	 System.out.println(cellda.getText());
        	 Thread.sleep(500);
         }
   
	
	  
	  
			
			}
	

	}


