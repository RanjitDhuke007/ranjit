package Dropdown_handling_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);			
		
		// Calcal Login page...
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// step1 ...Identify element....
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Thread.sleep(2000);
		
		// Step2... Create objrct Of Action Class..
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		// Step3---- Used action Class Method...
		act.moveToElement(more).perform();
	//	Thread.sleep(2000);
		
		// Right Click
		act.contextClick().perform();
		//act.contextClick(more).perform();
	    	Thread.sleep(2000);
		
		// left click.
		act.click().perform();
    //    act.click(more).perform();
        
        
        // all on one..
     //   act.moveToElement(more).contextClick(more).build().perform();
	}

}
