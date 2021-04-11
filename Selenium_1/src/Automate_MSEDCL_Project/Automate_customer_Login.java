package Automate_MSEDCL_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Automate_customer_Login 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// 1. Open MahaDiscom Website.
		driver.get("https://www.mahadiscom.in/");
		driver.manage().window().maximize();
         Thread.sleep(3000);
		
		//2. Select English Language..
         driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(3000);
		
		
		//3.Click On Customer Poratl..
		driver.findElement(By.xpath("(//img[contains(@class,'alignnone size-full wp')])[1]")).click();
		Thread.sleep(3000);

	
		//4.Click on View And Click Online
		//String parent = driver.getWindowHandle();
		//System.out.println(parent);
		for(String child:driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'View & Pay Bills Online')]")).click();
		Thread.sleep(3000);
		
		//5.Consumer No..
		for(String child:driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}

		WebElement sh = driver.findElement(By.xpath("//input[@id='consumerNo']"));
		Thread.sleep(2000);
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExcelSheet\\Mahadiscom paybill (3).xlsx");
		 Sheet excel1 = WorkbookFactory.create(file).getSheet("Sheet1");
		String Consumerno = excel1.getRow(8).getCell(3).getStringCellValue();
		sh.sendKeys(Consumerno);
		Thread.sleep(2000);

		
		
		//6.Select BU No....
		WebElement Buno = driver.findElement(By.xpath("//input[@id='txtBUFilter']"));
		Thread.sleep(2000);
		String data2 = excel1.getRow(10).getCell(3).getStringCellValue();
          Buno.sendKeys(data2);
          Thread.sleep(1000);
		
		
		
//		//7. Subdivision
//		WebElement list = driver.findElement(By.xpath("//select[@id='billingNo']"));
//		//Thread.sleep(2000);
//		Select s=new Select(list);
//		s.selectByValue("4677");

		// Enter Captcha
		Thread.sleep(15000);
		//8.Click On SubMit Button
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(2000);

		
		
		//Click On View History
		driver.findElement(By.xpath("//span[text()='View History']")).click();
		Thread.sleep(2000);

		
		
		//Verify Consumer No
		String name = driver.findElement(By.xpath("(//td[@class='value'])[3]")).getText();
		 String except=name;
		 Thread.sleep(2000);
		 List<WebElement> data3 = driver.findElements(By.xpath("//table[@class='form_table']/tbody//tr/td"));
		for(WebElement data33:data3)
		{
			String actdata = data33.getText();
			 if(except.equals(actdata))
			 {
				 System.out.println("succesfully Verify Consumer Name As Per Expected");
				 break;
			 }
		}
		
		 
		//Billing Page ScreenShot.
		 Thread.sleep(2000);
		WebElement priclick = driver.findElement(By.xpath("(//a[@target='_blank'])[16]"));
		Actions act=new Actions(driver);
		 Thread.sleep(2000);
		act.moveToElement(priclick).perform();
		
		Thread.sleep(2000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String random = RandomString.make(2);
		File dest=new File("C:\\Users\\DELL\\ranjit"+random+".jpg");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);

		
		
		// Click On View Graph...
		driver.findElement(By.xpath("(//span[text()='View Billing Graph'])[1]")).click();
		Thread.sleep(2000);

		// TakesScreenShot Of ViewGragh
		Thread.sleep(3000);
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source1);
		Thread.sleep(1000);
		String random1 = RandomString.make(2);
		File dest1=new File("C:\\Users\\DELL\\ranjitR"+random1+".jpg");
		FileHandler.copy(source1, dest1);
		Thread.sleep(2000);

	  // Click On Payment history
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Payments History']")).click();
		
	// Take Screen Shot Of Payment History
		Thread.sleep(3000);
		File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source2);
		Thread.sleep(1000);
		String random2 = RandomString.make(2);
		File dest2=new File("C:\\Users\\DELL\\ranjitJ"+random2+".jpg");
		FileHandler.copy(source2, dest2);
		Thread.sleep(2000);

		
	//-----------Project Complete-----------------
		
		
		
		
		

	}

}
