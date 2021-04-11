import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// step1 = ......Open Google webpage......
	driver.get("https://www.google.com/");
	
	
	//Step2=  wait for 2 Sec Webpage...
	Thread.sleep(2000);
	
	//step3= Maximize webpage Screen 
	driver.manage().window().maximize();
	
	//step 4=Change Size Of Browser...
	Dimension r=new Dimension(300, 400);
	driver.manage().window().setSize(r);
	
	//Step 5= Change The Position of Webpage...
	Point e=new Point(200, 300);
	driver.manage().window().setPosition(e);
	
	//step 6 =close Browser...
	 driver.close();
	
	
	
	
	
	
	}

}
