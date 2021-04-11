package Autosuggetion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggetion_Handling 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);		

	// Enter in Google Text Box
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
				
				
	//Print all text while search...
		Thread.sleep(2000);
		List<WebElement> alloption = driver.findElements(By.xpath("//ol[@class='a-carousel']/li"));
		Thread.sleep(2000);
	      for(WebElement option:alloption)
	    {
			System.out.println(option.getText());
		}
		
		
		
		
		
	}

}
