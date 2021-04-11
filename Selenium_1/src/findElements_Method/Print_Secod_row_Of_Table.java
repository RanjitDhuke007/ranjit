package findElements_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Secod_row_Of_Table 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");
		
		
		// Print Second Row Of Table.....
List<WebElement> Row2data = driver.findElements(By.xpath("//table[@border='5']//tr[2]/td"));
		
		for(WebElement row2:Row2data)
		{
			System.out.print(row2.getText()+ " ");
		}
		System.out.println();
	
		
		
		

	}

}
