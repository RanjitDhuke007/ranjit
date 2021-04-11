package PopUp_Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Click me
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		Thread.sleep(2000);
		// We Need to Change Scope Of selenium Manin to popUP Window
		
		Alert al = driver.switchTo().alert();
		
		//1. For 'Ok' Use accept Function....
		//al.accept();
		
		//2. For Text print Use 'GetText' Function..
		String title = al.getText();
		System.out.println(title);
		
		//3. For Calcal Use 'dismiss' function....
		//al.dismiss();
	
		
		
		
		
		
		
	}
	
	
}
