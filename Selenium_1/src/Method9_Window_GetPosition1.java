import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method9_Window_GetPosition1 {

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.amazon.in/");  // Used To Open Any Web Based Application On Chrome...

		Thread.sleep(2000);
		
		// show The Position Of Browser On window In the 'X' And 'y' format..
		
		System.out.println(driver.manage().window().getPosition());

	}

}
