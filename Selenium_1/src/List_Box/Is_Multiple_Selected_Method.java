package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple_Selected_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/MultipleList.html");
		//driver.manage().window().maximize();
		
		WebElement hr = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select bb=new Select(hr);
		boolean tyy = bb.isMultiple();
		
		System.out.println(tyy);
		Thread.sleep(5000);
	     WebElement ytt = bb.getFirstSelectedOption();
		String jk = ytt.getText();
		System.out.println(jk);
		Thread.sleep(1000);
         

	}

}
