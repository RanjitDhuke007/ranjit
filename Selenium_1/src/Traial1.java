import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traial1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();  // upcasting....
		
		driver.get("https://www.amazon.in/");  // select Driver or web base Application....
		
		
		
		
	}

}
