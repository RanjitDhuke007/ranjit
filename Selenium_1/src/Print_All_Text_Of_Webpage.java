import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Text_Of_Webpage
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// 1...To find All Link present in Webpage....
		List<WebElement> Alllink = driver.findElements(By.xpath("//a"));
		
		System.out.println(Alllink.size());
		
		

		//2..To get Text Of Link Of Webpage...
		List<WebElement> AllTextOfLink = driver.findElements(By.xpath("//a"));
	   for(WebElement text:AllTextOfLink)
	   {
		   System.out.println(text.getText());
	   }
		
		
		
		
		
	}

}
