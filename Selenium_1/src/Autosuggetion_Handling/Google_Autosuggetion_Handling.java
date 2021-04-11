package Autosuggetion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggetion_Handling
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		Thread.sleep(2000);		

		String exp="selenium webdriver";
		
		// Enter in Google Text Box
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		
		
		//Print all text while search...
		Thread.sleep(2000);
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		
		String act;
		Thread.sleep(2000);
		for(WebElement option:alloption)
		{
			System.out.println(option.getText());
			Thread.sleep(2000);
	 // We want to select"selenium webdriver"
		 act=option.getText();
		 if(exp.equals(act))
		 {
			option.click();
			break;
		  }
		 }

		
		 
		
	}

}
