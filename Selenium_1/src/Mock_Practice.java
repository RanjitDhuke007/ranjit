import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// 1. Open The Browser.....
	       driver.get("https://www.google.com/");
	      
		// 2. Hold Screen
	       Thread.sleep(1000);
	      
	     //3. Close The Current Browser...
	      // driver.close();
	      
	      //4. Close All tab
	      // driver.quit();
	      
	      
		  //5. Get Title...
	       String expr ="Google";
	       String actr=driver.getTitle();
	      if(expr.equals(actr))
	      {
	    	  System.out.println("Sucessfully open");
	      }
	      else
	      {
	    	  System.out.println("Sucessfully Not open");
	      }
		
		
	      // 6. Currnt Url...
	      String url = driver.getCurrentUrl();
	      System.out.println(url);
	      
	      //7.maximize....
	      driver.manage().window().maximize();
	      
	      
	      //8.  navigate...
	      
	            //1. open Url
	            driver.navigate().to("https://www.facebook.com/");
	      
	           //2. back..
	            driver.navigate().back();
	            
	           //3. Forward.... 
	            driver.navigate().forward();
	            Thread.sleep(2000);
	           // 4. Refresh....
	            driver.navigate().refresh();
	      
	      
	      // 9. Get size.....
	           System.out.println(driver.manage().window().getSize());
	            
	       // Set Size..
	           Dimension d=new Dimension(200, 300);
	           driver.manage().window().setSize(d);
	           
	           
	      // Set position.....
	           Point f=new Point(300, 200);
	           driver.manage().window().setPosition(f);

          /// get Position...
	           System.out.println(driver.manage().window().getPosition());
	           
	}

}
