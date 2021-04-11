package Locator_XPath_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath_Contains_By_Text
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		// Xpath By Using Contains 'Text' .....
		
				// SynTex==  //tagname[text(),'Text value']
				
				System.setProperty("webdriver.chrome.driver",
						"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/Example3.html");
				
				// i agree termes and Condition....
				// Test Script For  Using Contians Text .....
			/*	driver.findElement(By.xpath("//lable[contains(text(),' I Agree Termes A')]")).click();
				Thread.sleep(2000);
				
			
				//click here to see termes and condition...
				// Test Script for Using Contains Text
				driver.findElement(By.xpath("//a[contains(text(),' Click Here To see Ter')]")).click();
				Thread.sleep(2000);
				
					*/
				//Sign Up
				// Test Script For sign up Button Using Contains Text.....
				driver.findElement(By.xpath("//button[contains(text(),' Sig')]")).click();
			
				
				

		
		
		
		

	}

}
