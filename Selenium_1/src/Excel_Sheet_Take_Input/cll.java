package Excel_Sheet_Take_Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cll
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyacco"
				+ "unt.google.com%2F%3Futm_source%3DOGB%26tab%3Dkk%26utm_medium%3Dapp&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
         Thread.sleep(3000);

		
		//  Create Account...
         driver.findElement(By.xpath("//span[text()='Create account']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[text()='For myself']")).click();
		Thread.sleep(2000);
		

	}

}
