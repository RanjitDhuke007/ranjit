import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_And_Application1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.amazon.in/");  // Used To Open Any Web Based Application On Chrome...
		
		
		
		
	}

}
