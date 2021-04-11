package findElements_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_All_CheckBox
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\HTML Program\\Checkbox11.html");
		
		
		// select Check Box Use findelements method
		List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement Allselectbox:checkbox1)
		{
			Allselectbox.click();
			Thread.sleep(500);
		}

		// For UnClick from Last to first.....
		for(int i=checkbox1.size()-1; i>=0 ;i--)
		{
			checkbox1.get(i).click();
			Thread.sleep(500);
		}
	}

}
