package PopUp_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_PopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// To Handle hidden Division PopUp Not Need To Use switch..........
		// Email 
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc123");
		Thread.sleep(2000);

		// pAssward
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@123");
		Thread.sleep(2000);
		
		
		// Login
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	

		
		
		
		
		
		

	}

}
