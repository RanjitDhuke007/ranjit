package Customized_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class List_Box2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// Click on Create Accout
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(10000);
		
		//Identify list Box
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		//Thread.sleep(2000);
		
		// Create Object Of Actios Class...
		Actions act=new Actions(driver);
		//Thread.sleep(2000);
		
		// Click On That Box
		act.click(ele).perform();	
		Thread.sleep(2000);
		
		// move Top Of List Box..
		for(int i=1; i<=12;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		// then we want select Any Month
		for(int i=1; i<=7; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		
		/// Select Month...
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}

}
