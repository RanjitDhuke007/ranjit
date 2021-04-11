package TakeScreenShot_InterFace;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot3 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		  Thread.sleep(3000);
		// Step 1)...
		File first = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(first);
	  // File last=new File("C:\\Users\\DELL\\pqr.jpg");
        
	   // step  2)....\
	 
	  
	
	   String random = RandomString.make(3);
	   File last=new File("C:\\Users\\DELL\\pqr"+random+".jpg");
	   FileHandler.copy(first, last);
	}

}
