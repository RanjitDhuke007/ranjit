package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_By_Text1
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		// Xpath By Using'Text' .....
		
		// SynTex==  //tagname[text()='Text value']
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/Example3.html");
		
		// i agree termes and Condition....
		// Test Script For  Using Text .....
		driver.findElement(By.xpath("//lable[text()=' I Agree Termes And Condition']")).click();
		Thread.sleep(2000);
		
		
		//click here to see termes and condition...
		// Test Script for Using Text
		driver.findElement(By.xpath("//a[text()=' Click Here To see Termes And Conditions ']")).click();
		Thread.sleep(2000);
		
		
		//Sign Up
		// Test Script For sign up Button Using Text.....
		driver.findElement(By.xpath("//button[text()=' Sign Up ']")).click();
	
		
		
		
		
		

	}

}
