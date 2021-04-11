package webTable_HandLing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_first_Cell_Table
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");
		
     // Print 1 coloumn Of Table.....
		List<WebElement> Coloumndata = driver.findElements(By.xpath("//table[@border='5']/tbody//td[1]"));
		System.out.println("Coloumn Data is=");
		for(WebElement cell1:Coloumndata)
		{
			
			String coldata = cell1.getText();
			System.out.println(coldata+ " ");
		}
		

	
	
	
	}

}
