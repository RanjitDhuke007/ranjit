import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method6_window_Set_size
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.amazon.in/");  // Used To Open Any Web Based Application On Chrome...
		
		//  set size of Window Of Browser....
		// Using set size function..........
		
		Dimension d =new Dimension(300, 600);
		
		driver.manage().window().setSize(d);
		

	}

}
