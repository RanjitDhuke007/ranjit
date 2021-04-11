package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_method2 {

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
       WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
       un.sendKeys("abc123");
       Thread.sleep(2000);
       
       // Using Clear Username we Use Clear Function
       un.clear();
       Thread.sleep(2000);
       un.sendKeys("xyz");
       
       //passward
       WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
       pass.sendKeys("äbc@123");
       Thread.sleep(2000);
       pass.clear();
       Thread.sleep(2000);
       pass.sendKeys("pqr");
       
       
       // Login
       driver.findElement(By.xpath("//button[@name='login']")).click();
       
       
       
		
		
		
		
		
		

	}

}
