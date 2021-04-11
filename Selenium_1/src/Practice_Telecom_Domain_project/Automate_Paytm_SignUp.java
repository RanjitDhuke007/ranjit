package Practice_Telecom_Domain_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Paytm_SignUp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		// Login Page Of Instagram......
		
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// logo click...
		
		driver.findElement(By.xpath("//i[@class='iconMenu cursor']")).click();
		
		// Sports and football
		
		driver.findElement(By.xpath("//a[contains(@href='https://paytmmall.com/spor')]")).click();

	}

}
