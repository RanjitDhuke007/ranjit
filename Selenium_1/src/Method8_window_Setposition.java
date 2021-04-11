import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method8_window_Setposition {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.amazon.in/");  // Used To Open Any Web Based Application On Chrome...
		
		// Set Dimension Of Browser..
		Dimension r=new Dimension(300, 600);
		
		driver.manage().window().setSize(r);
		
		Thread.sleep(2000);
		// To set The Position of browser  on screen....
		
		Point q=new Point(300, 400);
		driver.manage().window().setPosition(q);
		
		

	}

}
