import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
       // Step 1= open Google webpage....
		driver.get("https://www.google.com/");
	//	Thread.sleep(1000);
		
		//Step2= Maximize That webpage......
		driver.manage().window().maximize();
	//	Thread.sleep(1000);
		
		//Step3 =Get Url And Get Title Of webpage....
		String urlname = driver.getCurrentUrl();
		System.out.println(urlname);
	//	Thread.sleep(500);
		String Title =  driver.getTitle();
		System.out.println(Title);
		//Thread.sleep(1000);
		
		
		//Step4 = Open faceBook Webpage...
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		
		//Step 5= Navigate Back To google Page...
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Step 6 =Verify Google open Or Not..
		
		String expresult ="Google";
		String  actresult=driver.getTitle();
		
		if(expresult.equals(actresult))
		{
			System.out.println("Webpage Sucessfully open");
		}
		else
		{
			System.out.println("Webpage Sucessfully Not open");
		}
		
		// step=7 wait 3 sec and change size of Browser.(200,300)
		Thread.sleep(3000);
		Dimension r=new Dimension(200, 300);
		driver.manage().window().setSize(r);
		
		//Step 8 = wait for 2sec Change position of browser.(100,500) wait for 3 sec
		
		Thread.sleep(2000);
		Point d=new Point(100, 500);
		driver.manage().window().setPosition(d);
		
		
		// Step 9= Maximaize Browser....
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		// Step 10 = Wait for 2 sec And Navigate To Facebook PAge
		Thread.sleep(2000);
		driver.navigate().forward();;
		
		// Step 11= verify Facebook webpage open or not
		String eresult ="Facebook – log in or sign up";
		String acresult =driver.getTitle();
		
		if(eresult.equals(acresult))
		{
			System.out.println("Facebook Webpage succesfully Open");
		}
		else
		{
			System.out.println("Facebook Webpage Not succesfully Open");
		}
		
		// Step 12 = Refresh Current Webpage....
		driver.navigate().refresh();
		
		
		// Step 13 =Wait for 2 Sec and Close Browser,,,
		 Thread.sleep(2000);
		 driver.close();
		
		
		
		
		
		
		
		
		

	}

}
