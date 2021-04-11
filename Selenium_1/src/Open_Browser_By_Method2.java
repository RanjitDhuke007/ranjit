import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_By_Method2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		// Method 1= Open Browser Using amazon application...
		driver.get("https://www.amazon.in/");  // Used To Open Any Web Based Application On Chrome...
	
		//Method 2= Hold O/p for Some Time...
		Thread.sleep(3000);
		 
		//method 3 = close Current Application /Tab 
	//	driver.close();
		
		//Method 4 = Close All Tab / Application Open In browser...
	//	driver.quit();
		
		//Method 5 = Get Title Of Any Browser..
		String expresult ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";    // String Declaration
		
		String actresult=driver.getTitle();  // using GetTitle Method...
		
		if(expresult.equals(actresult))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		
		System.out.println(actresult);
		
		
		
		
		
	}

}
