package Dropdown_handling_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2_Class 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);			
		
		
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
	// Call Action Class....
	Actions act=new Actions(driver);
	Thread.sleep(2000);			
	act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
	
      //  act.dragAndDrop(source, dest).release().perform();
       
	}

}
