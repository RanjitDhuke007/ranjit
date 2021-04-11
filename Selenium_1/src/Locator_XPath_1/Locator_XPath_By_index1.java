package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath_By_index1 
{
       
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/Example3.html");
		
		
		// Username----
		//  (//taganme[@Attribute Proprty='Att. value'])[index]
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc@123");
		Thread.sleep(1000);
		
		
		// passward....
		driver.findElement(By.xpath("//input[@type='passward']")).sendKeys("abc@123");
		Thread.sleep(1000);
		
		
		//Email Id
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc123@gamil.com");
		Thread.sleep(1000);
		
		
		//Contact No.....
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9988776655");
		Thread.sleep(1000);
		
		
		// Radio button
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(1000);
		
		
		//Agree termes and  Termes
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		
		
		//Sign Up
		driver.findElement(By.xpath("//button[text()=' Sign Up ']")).click();
		Thread.sleep(1000);
		
		

	}

}
