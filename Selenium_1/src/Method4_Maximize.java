import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method4_Maximize 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.google.com/");  // Used To Open Any Web Based Application On Chrome...
		
		//Maximize Method==
		// to Maximize Screen Of Browser...
		
		driver.manage().window().maximize();  // used To Maximize screen Of Browser...
	

	}

}
