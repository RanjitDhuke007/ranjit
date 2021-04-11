package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_All_Method
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/MultipleList.html");
		
		Thread.sleep(2000);
		// Identity the element........
		WebElement sel = driver.findElement(By.xpath("//select[@name='cars']"));
		
		// Call select Class
		Select se=new Select(sel);
		Thread.sleep(2000);
		
		// Call The Select By Index Method....
		se.selectByIndex(0);
		Thread.sleep(2000);
		
		// Call the select By VAlue.....
		se.selectByValue("saab");
		Thread.sleep(2000);
		
		// CAll the select By VisibleText....
		se.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		// getfirstSelectedoption....
		WebElement see = se.getFirstSelectedOption();
		see.getText();
		
		
		//GetAllSelectedOptions...
		List<WebElement> option = se.getAllSelectedOptions();
		for(WebElement opt:option)
		{
			//System.out.println(opt.getSize());
			System.out.println(opt.getText());
		}
		System.out.println();
	
		// Deselect by Index Method.........
		se.deselectByIndex(0);
		Thread.sleep(2000);
		
		// Deselect by value...
		se.deselectByValue("saab");
		Thread.sleep(2000);
		
		// Deselect By VisibleText.....
		se.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		//Getoption Method...
		List<WebElement> get = se.getOptions();
		for(WebElement ger:get)
		{
	    	System.out.println(ger.getText());
		}
		
		//
		
		
		
		
		
		
		
		
		
	}

}
