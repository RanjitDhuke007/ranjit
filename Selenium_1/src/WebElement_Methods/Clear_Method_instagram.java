package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method_instagram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		// Login Page Of Instagram......
		
		driver.get("https://www.instagram.com/");
		
		//maximize the Screen.....
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Phone No...
		WebElement ph = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
		Thread.sleep(1000);
		ph.sendKeys("abc123");
		ph.clear();
		/*Thread.sleep(3000);
		ph.sendKeys("933333");
		//Thread.sleep(3000);
		*/
		/*//password
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abc@123");
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(4000);
		
		*/
		
		

	}

}
