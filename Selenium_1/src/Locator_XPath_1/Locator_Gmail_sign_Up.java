package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator_Gmail_sign_Up 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		
		// first Name Of sign up Page...
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akash");
		Thread.sleep(1000);
		// Last Name Of sign up Page...
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dhuke");
		Thread.sleep(1000);
		//Username of Sign up page of Gmail
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akashdhuke16");
		Thread.sleep(1000);
		
		//password..
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akash@007");
		Thread.sleep(1000);
		
		// Confirm password..
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("akash@007");
		Thread.sleep(1000);
		
		// Next Button...
		driver.findElement(By.xpath("(//button[contains(@class,'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-')])[2]")).click();
		Thread.sleep(6000);
		
		//Phone No
		driver.findElement(By.xpath("(//input[contains(@class,'whsOnd zHQ')])[1]")).sendKeys("8378061832");
		Thread.sleep(4000);
		
		
		//Next Button
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
		Thread.sleep(9000);
		
		// Otp Text...
		driver.findElement(By.xpath("//input[@name='code']")).sendKeys("");
		Thread.sleep(60000);
		
		// Click On Verify ...
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(4000);
		
			
		// select month Of DOB..
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		    // call to select Class
		  Select m=new Select(month);
		    // to Method
		 m.selectByIndex(11);   // Method 1.....
		 Thread.sleep(3000);
		 
		
		 // select Day Of DOB......
          driver.findElement(By.xpath("//input[@name='day']")).sendKeys("10");
		 Thread.sleep(3000);
		 
		 
		 // select year For  DOB...
		 driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1996");
		 Thread.sleep(3000);
		 
		 
		 //select Gender.....
		 WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		 Select g=new Select(gender);
		 g.selectByVisibleText("Male");
		 
		 
		 // Next Button...
		 driver.findElement(By.xpath("(//button[@jsname='LgbsSe'])[1]")).click();
		 
		 
		 
		 
	}

}
