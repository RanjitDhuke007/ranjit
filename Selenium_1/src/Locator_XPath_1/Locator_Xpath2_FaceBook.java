package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath2_FaceBook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Test script1 For.....
		// For UserName...
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ranjit@123");
		  Thread.sleep(2000);
		  
		//Test Script 2 For......
		  // for Password...
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		  Thread.sleep(2000);
		  
        // Test script 3...
		// for Log In ....
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
