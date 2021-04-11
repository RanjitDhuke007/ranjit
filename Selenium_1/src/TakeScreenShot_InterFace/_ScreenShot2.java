package TakeScreenShot_InterFace;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class _ScreenShot2 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// Step 1...
   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		/*// step 2)...
		File dest =new File("C:\\Users\\DELL\\abc.jpg");
		FileHandler.copy(source, dest);
		*/		
		//or
		String random = RandomString.make(3);
		File dest =new File("C:\\Users\\DELL\\abc"+random+".jpg");
		FileHandler.copy(source, dest);
		
		
	}

}
