package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_Index_listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open Browser
		driver.get("https://www.facebook.com/");
	   // driver.manage().window().maximize();
	    Thread.sleep(4000);
		
		
		
		//create New Accout
	   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	   
		Thread.sleep(4000);
		
		// select Month in Dropdown By
		// using  SelectbyIndex()=
		// Step=1
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Thread.sleep(4000);
		// step =2
		// Make Object Of Select Class

		Select m=new Select(month);
		Thread.sleep(3000);
		// step 3
		// Call To Method By  using  SelectbyIndex()= 
		
		//m.selectByIndex(3);
		m.selectByValue("7");
	  //	m.selectByVisibleText("Apr");
	
		
		
		
		
		

	}

}
