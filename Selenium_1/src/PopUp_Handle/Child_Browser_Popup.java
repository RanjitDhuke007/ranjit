package PopUp_Handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Click On Main page New Tab....
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		Thread.sleep(7000);
		
		// For We need Change Focus selenium to Popup window..
		// we use function whose Get All id Of Main Page And Child Browser
		Set<String> idd = driver.getWindowHandles();
		
		// We Want get By Indx Thats why Trasfer in AraayList....
		ArrayList<String> al=new ArrayList<String>(idd);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		driver.switchTo().window(al.get(1));
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		 //Switch To main Page....
		driver.switchTo().window(al.get(0));

	}

}
