package Dynaic_Xpath;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_x_Path_FlipKart
{

	public static void main(String[] args) throws InterruptedException
	{
				System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		
		// To Cancal Login PAge....
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// Enter in Text Box...
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi Note 9(Scarlet Red,64GB)");
		
		
		// For Click On Search Box...
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
/*		// Click on get ratings
		Thread.sleep(15000);
		String ratings = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[2]//span/span[1]")).getText();

	//	String ratings = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[2]/span[1]/span[1]")).getText();
	     System.out.println("Ratings Of Mobile Is =" +(ratings));
	
	
	  // Click on get Review
	     Thread.sleep(15000);
	 	String review =  driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[2]//span[3]")).getText();
		//String review = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[2]//span[2]/span[1]/span[3]")).getText();
	   System.out.println("Review Of Mobile Is =" +(review));
	*/
	// Click On Mobile Name...
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	   
	   //
	
	  Thread.sleep(15000);
	  Set<String> child = driver.getWindowHandles();
	  ArrayList<String> ar=new ArrayList<String>(child);
	  driver.switchTo().window(ar.get(1));
	   Thread.sleep(20000);
	   String rat = driver.findElement(By.xpath("//div[@class='aMaAEs']//div[1]/div[1]//span[2]//span[1]/span[1]")).getText();
	  System.out.println(rat);
	   
	   // Click On rating....
	   Thread.sleep(20000);
	   driver.findElement(By.xpath("(//span[@class=\"_2_R_DZ\"])[1]//span[2]")).click();
	   
	   //get Text...
	   Thread.sleep(20000);
	   String text = driver.findElement(By.xpath("//span[text()='17,319 Ratings &']")).getText();
	System.out.println(text);
	    System.out.println(text.substring(0,5));
	
	}

}
