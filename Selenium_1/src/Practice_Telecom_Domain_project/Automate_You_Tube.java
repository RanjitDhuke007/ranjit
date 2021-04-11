package Practice_Telecom_Domain_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_You_Tube
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Open You Tube...
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
         Thread.sleep(3000);
         
         // click On searchBox....
         WebElement data = driver.findElement(By.xpath("//input[@id='search']"));
         data.sendKeys("Vijayi Bhava - (Sound Check) - Dj Sagar Barshi 2K19 ");
         Thread.sleep(5000);
		
		// Search 
         driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
         Thread.sleep(10000);
         
         // play Song
         WebElement song = driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Vijayi Bhava   -  (Sound Check) - Dj')])[2]"));
         song.click();		
		
		

	}

}
