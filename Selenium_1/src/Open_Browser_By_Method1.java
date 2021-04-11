import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_By_Method1 {

	public static void main(String[] args) throws InterruptedException
	{
	String Expresult="Google";
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   // Up-Casting
		
		driver.get("https://www.google.com/");  // Used To Open Any Web Based Application On Chrome...
		
       Thread.sleep(6000);    // Want Hold Application For 3 Sec Then Use It...
		
	 //   driver.close();  // Current Tab/ Application Run And Then Open Completely Then It Is Close Immediate..
		
		
     //  driver.quit();  // Close All Tab / Application Running On Chrome Browser...
       
       // ...want to verify Actual result is Equal to Expected Result.....
       
	   String actresult =driver.getTitle(); 
	   System.out.println(actresult);
	   
	   if(actresult.equals(Expresult))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
	}

}
