package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_Contains_Attribute 
{

	public static void main(String[] args) throws InterruptedException
	{
	     // Xpath By Contains Attribute.....
		
		//syntex==//tagname[contains(@attribute name,'attribute value')]
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		// Username....
		// Test Script For Username Using Text .....
	    	driver.findElement(By.xpath("//input[contains(@class,'inputtext _55')]")).sendKeys("abc@123");
			Thread.sleep(2000);
				
				
		//Passward...
		// Test Script for Passward Using Text
			driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pa')]")).sendKeys("abc@134");
			Thread.sleep(2000);
				
				
		//Login
    	// Test Script For Login Button Using Text.....
	    	driver.findElement(By.xpath("//button[contains(@class,'y6 _4jy1 selected _51sy')]")).click();
	
		
		
		

	}

}
