package Customized_List_Box;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Custom_List_Bx_Ex
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.grapecity.com/wijmo/demos/Input/ListBox/Customization");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		
		
		//  JavaScript Handle Customised List box....
		
		// Swith to Iframe....
		Thread.sleep(22000);
		
		WebElement element = driver.findElement(By.xpath("//iframe[@class='gc-view-frame']"));
		driver.switchTo().frame(element);
		
		
	// Identify List Box...
		Thread.sleep(5000);
		WebElement list = driver.findElement(By.xpath("//div[@class='wj-listbox-item wj-state-selected']"));
		
		
	//	Call Action Class....
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
	// Click On Any option In List Box....
		Thread.sleep(2000);
		act.click(list).perform();
		
	// select Option by Arrow_up
		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		
		for(int i=1; i<=18; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		
		
		// Take scren Shot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
	
		
		
		
		
		
	}

}
