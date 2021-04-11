package Practice_Telecom_Domain_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_instagram_
{

	public static void main(String[] args) throws InterruptedException
	
	
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		// Login Page Of Instagram......
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);

		// user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9988776655");
		Thread.sleep(1000);
		
		
		//passward
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		Thread.sleep(1000);
		
		
		//login page
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(4000);
		
		
		
		

	}

}
