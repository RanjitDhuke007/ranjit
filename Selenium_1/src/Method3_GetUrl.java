import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method3_GetUrl 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// Get Current URL Whose Run All Method...
		//Using getCurrentUrl() Function.....
		
		String url= driver.getCurrentUrl();  // Declaration Of Method...
		
		System.out.println(url);   // Print Statement of Url....
		Thread.sleep(2000);
        driver.close();
	}

}
