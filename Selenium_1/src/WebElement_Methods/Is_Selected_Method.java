package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_Method
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// Login Page Of Facebook.....
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount"
				+ "?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();

		// 1)  isSelected():
		
		
	    WebElement r = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(r.isSelected())
		{
			System.out.println("is Selected");
		}
		else
		{
			Thread.sleep(2000);
			r.click();
			System.out.println("is  Selected");
		}
		
		
		
		
	}

}
