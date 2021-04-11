package PopUp_Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		// click On Promt Click box..
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		
		
		// Enter Text...
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		al.sendKeys("Ranjit");
		
		
		// Click On 'OK' Button..
		Thread.sleep(1000);
	      al.accept();
		
		
		
		
	}

}
