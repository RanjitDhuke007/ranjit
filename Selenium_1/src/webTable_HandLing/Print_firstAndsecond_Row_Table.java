package webTable_HandLing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_firstAndsecond_Row_Table
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");
		
     // Print First Row  Of Table.....
		 List<WebElement> Rowdata1 = driver.findElements(By.xpath("//table[@border='5']/tbody//tr[1]"));
		for(WebElement Row1:Rowdata1)
		{
		   System.out.println("Row 1 Data Is ="+ Row1.getText()+ " " );
		}

		
	// Print Second Row  Of Table.....
		 List<WebElement> Rowdata2 = driver.findElements(By.xpath("//table[@border='5']/tbody//tr[2]"));
		for(WebElement Row2:Rowdata2)
		{
		   System.out.println("Row 2 Data Is ="+ Row2.getText()+  "  " );
		}
 	
		
		
		
		

	}

}
