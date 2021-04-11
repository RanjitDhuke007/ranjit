package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath_1
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/Example3.html");
		
		//Username....
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@123");
		
		Thread.sleep(3000);
		//Passward....
		driver.findElement(By.xpath("//input[@type='passward']")).sendKeys("ranjit@123");
		
		
		
		
		
		

	}

}
