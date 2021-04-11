import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Automate_Pancard_Application_From 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		driver.manage().window().maximize();
         Thread.sleep(3000);
	
		// Application type
         driver.findElement(By.xpath("//span[@id='select2-type-container']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//li[@class='select2-results__option'])[2]")).click();
         Thread.sleep(2000);
         
         //category..
         driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//li[@class='select2-results__option'])[1]")).click();
         Thread.sleep(4000);
         
         // ScreenShot1...
         File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         Thread.sleep(2000);
          // System.out.println(source1);
           File dest1=new File("C:\\Users\\DELL\\PanCard_From.jpg");
           FileHandler.copy(source1, dest1);
           Thread.sleep(4000);

         //Title...
          driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[3]")).click();
          Thread.sleep(2000);
         driver.findElement(By.xpath("(//li[@class='select2-results__option'])[1]")).click();
         Thread.sleep(2000);

         //LastNAme
         
         WebElement lastn = driver.findElement(By.xpath("//input[@name='lastName']"));
         Thread.sleep(1000);
         FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\PanCard (1).xlsx");
         Thread.sleep(1000);
         Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
         Thread.sleep(1000);
         String exceldata = data.getRow(4).getCell(3).getStringCellValue();
         lastn.sendKeys(exceldata);
       Thread.sleep(2000);
        
         //FirstName
        WebElement lastn1 = driver.findElement(By.xpath("//input[@name='firstName']"));
        Thread.sleep(2000);
         String exceldata1 = data.getRow(5).getCell(3).getStringCellValue();
         lastn1.sendKeys(exceldata1);
       Thread.sleep(2000);
     

         //MiddleName...
         WebElement lastn2 = driver.findElement(By.xpath("//input[@name='middleName']"));
         Thread.sleep(2000);
         String exceldata2 = data.getRow(6).getCell(3).getStringCellValue();
         lastn2.sendKeys(exceldata2);
       Thread.sleep(2000);
        

         //DOB
         driver.findElement(By.xpath("(//input[@name='dateOfBirth'])[1]")).click();
         Thread.sleep(1000);
        WebElement year = driver.findElement(By.xpath("(//select[contains(@class,'yearselect form-')])[1]"));
        year.click();
        Thread.sleep(1000);
        Select a=new Select(year);
        Thread.sleep(1000);
        a.selectByVisibleText("1996");
        Thread.sleep(1000);
         WebElement month = driver.findElement(By.xpath("(//select[contains(@class,'monthselect form-')])[1]"));
       month.click();
       Thread.sleep(1000);
       Select s=new Select(month);
       s.selectByIndex(5);
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//td[@class='weekend available'])[2]")).click();
       Thread.sleep(2000);
       
         // Email Id
         WebElement lastn3 = driver.findElement(By.xpath("(//input[@name='emailId'])[1]"));
         lastn3.click();
         Thread.sleep(2000);
         String exceldata3 = data.getRow(8).getCell(3).getStringCellValue();
         lastn3.sendKeys(exceldata3);
       Thread.sleep(3000);
       
         // MObile No..
        WebElement lastn4 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
         Thread.sleep(2000);
        lastn4.click();
        String exceldata4 = data.getRow(9).getCell(3).getStringCellValue();
        lastn4.sendKeys(exceldata4);
        Thread.sleep(2000);
         
       
       // CheckBox
        driver.findElement(By.xpath("//input[@name='consent']")).click();
        Thread.sleep(2000);
       
         // screen Shot 2....
         File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       Thread.sleep(2000);
        // System.out.println(source2);
         File dest2=new File("C:\\Users\\DELL\\PanCard_From2.jpg");
         FileHandler.copy(source2, dest2);
         
         
         
         
	}

}
