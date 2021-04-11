import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail_Open_Browser1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");//Take Property Of NAme of browser and PAth Of File
		
		WebDriver driver=new ChromeDriver();   // PerFrom up Casting
		
		

	}

}
