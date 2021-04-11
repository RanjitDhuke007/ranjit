package findElements_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Firstrow_Of_Table
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");	
		
		
		// print First Row Of Table (Header)...
		List<WebElement> Row1data = driver.findElements(By.xpath("//table[@border='5']//tr[1]/th"));
		
		for(WebElement row1:Row1data)
		{
			System.out.print(row1.getText()+ " ");
		}
		System.out.println();
		
	}

}
