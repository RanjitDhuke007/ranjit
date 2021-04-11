package Practice_Paytm_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Paytm_Electricity 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Electricity  ....
		driver.findElement(By.xpath("//span[text()='Electricity']")).click();
		Thread.sleep(3000);
		
		
//		//Electricity board....
//		driver.findElement(By.xpath("(//i[@class='_3DxO'])[1]")).click();
//		Thread.sleep(3000);
		
		// select Text....
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(2000);
		
		// select Maharashtra/..
		driver.findElement(By.xpath("//span[text()='Maharashtra']")).click();
		Thread.sleep(1000);
		
		
		// Select Board...
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		Thread.sleep(2000);

		
		//Select MSEDCL
		driver.findElement(By.xpath("//span[contains(text(),'Mahavitaran-Maha')]")).click();
		Thread.sleep(3000);

		
		//subDivisional
		driver.findElement(By.xpath("//input[@name='Sub Division/ERO/BU']")).click();
		Thread.sleep(3000);


		//Select Pune
		driver.findElement(By.xpath("//span[text()='4677  WADGAON SUB-DN.']")).click();
		Thread.sleep(4000);

		
		//consumer No...
		driver.findElement(By.xpath("//input[@name='Consumer Number']")).sendKeys("170658871911");
		Thread.sleep(2000);

		// proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);


//		//LOg out Akash
//		driver.findElement(By.xpath("//li[text()='AKASH RAMCHA...']")).click();
//		Thread.sleep(1000);
//
//		
//		//
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
