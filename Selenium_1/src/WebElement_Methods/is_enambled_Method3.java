package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enambled_Method3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open Browser
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    
	    // Username
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc123");
	    Thread.sleep(1000);
	    
	    // Passward
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@13");
	    Thread.sleep(4000);
	    
	    // Login....
	    // By using isenabled
	      WebElement login = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]"));
	     Thread.sleep(1000);
	     
	    if(login.isEnabled())
	    {
	    	System.out.println("Ëlement is Enabled");
	    }
	    else
	    {
	    	System.out.println("Element is Disabled");
	    }
	    
	   
		
		
		
	}

}
