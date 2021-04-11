package Practice_Telecom_Domain_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telecom_Project1
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Open Guru99 Home website.....
		
	/*	driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// open Telecom Projrct..
		// using Text      //tagname[text()='text']
		
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
			Thread.sleep(1000);
		
		// Add Customer from
		// using Text      //tagname[text()='text']
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
			Thread.sleep(1000);
		*/
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().window().maximize();
		// bakground Check
		// Usingn attribute Value
		driver.findElement(By.xpath("//label[@for='done']")).click();
		Thread.sleep(1000);
	   //Firstname
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ranjit");
		Thread.sleep(1000);
		
		//Lastname
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Shinde");
		Thread.sleep(1000);
		
		// Email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ranjitshinde@gmail.com");
		Thread.sleep(1000);
		
		// Address
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("KuteMala Nahr eKatrajpune ");
		Thread.sleep(1000);
		
		// MobNo 
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9988776655");
		Thread.sleep(1000);
		
		// Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		
	     // Copy Customer Id
		String s=driver.findElement(By.xpath("//h3[contains(text(),'')]")).getText();
		
		System.out.println(s);
		Thread.sleep(1000);
		// Click On Home
		driver.findElement(By.xpath("//a[@class='button']")).click();
		
		// Open add Tarrif Plan Of Customer
		driver.get("http://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		Thread.sleep(1000);
		
		//Add Customer Id
		driver.findElement(By.xpath("//input[@name='customer_id']")).sendKeys(s);
		Thread.sleep(1000);
		
		// Submit Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		// Select
		driver.findElement(By.xpath("//td[@align='center']")).click();
		Thread.sleep(1000);
		
		//Add Tarrif Plan To Customer...
		driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']")).click();
		Thread.sleep(1000);
		
		// Go To Home page
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
		
		
		

	}

}
