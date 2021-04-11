package iFreame_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// Click On Learn JavaScrippt....
		// We Use Switchto() Function 
		// For chane focus of selenium to iframe 
		// iframe method
		driver.switchTo().frame("iframeResult");  // Using "Name"
				
		driver.findElement(By.xpath("//button[contains(text(),'Click m')]")).click();
		
		Thread.sleep(1000);
		
		// For click on home Of Main Page 
		// We need Cjhange Focus of selenium iframe to Main Page
		// For That Call Function defaultsContenta...
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}

}
