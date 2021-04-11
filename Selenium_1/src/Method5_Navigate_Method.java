import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method5_Navigate_Method {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		//driver.get("https://www.google.com/");  // Used To Open Any Web Based Application On Chrome...
		
		// There is anathor option Two open Browser,,,
		
		// Using Navigate function We Open,Back,Forward,And refresh The browser...
		
		driver.navigate().to("https://www.google.com/"); // Open first browser using Navigate..
		
		Thread.sleep(2000);  // Hold For 2 Sec....
		
		driver.navigate().to("https://www.amazon.in/");  // Open second browser using Navigate..
		
		Thread.sleep(2000); 
		driver.navigate().back();  // Open back browser...
		Thread.sleep(2000); 
		driver.navigate().forward(); 
		Thread.sleep(2000); 
		driver.navigate().refresh();
		
		
		
		
		
		
		
	}

}
