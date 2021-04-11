import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method7_window_Get_Size {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.google.com/");  // Used To Open Any Web Based Application On Chrome...
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// Get Size Of Window Browser.total size
		// Print size in The Format of Height And Width...s
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
		
		
		
		

	}

}
