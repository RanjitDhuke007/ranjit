package Kite_Zerodha_Final_Scenario26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BASE_CLass_For_Scenario 
{
public static void BroserOPen()
{
System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
	
WebDriver driver=new ChromeDriver(option);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
	
}
	
	
	
	
	
	
	
	
	
	
}
