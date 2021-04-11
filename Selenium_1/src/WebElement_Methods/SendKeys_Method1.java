package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Method1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open Browser
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //User name
	    // 1 Approach.....
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@13");
		
		
		// Username...
       //  2 Approach....
       // webelement is Return type Of Find Element Method....
           WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
          user.sendKeys("Abc@123");		
		
		
           
           
           
	}

}
