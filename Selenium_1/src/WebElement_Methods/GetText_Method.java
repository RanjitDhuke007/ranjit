package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		// Login Page Of Instagram......
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		// using getText method....
		String jj = driver.findElement(By.xpath("//a[contains(text(),'Forgo')]")).getText();
		Thread.sleep(3000);
		System.out.println(jj);     // o/p=Forgot password?
		

	}

}
