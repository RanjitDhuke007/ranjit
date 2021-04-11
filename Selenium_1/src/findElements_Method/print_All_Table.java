package findElements_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_All_Table 
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
			System.out.print(row1.getText()+  "  ");
		}
		System.out.println();	
		
		
		// For Print body Of Table....
	 int TotalRow = driver.findElements(By.xpath("//table[@border='5']/tbody/tr")).size();
		for(int i=2; i<=TotalRow; i++)
		{
			  List<WebElement> celldata = driver.findElements(By.xpath("//table[@border='5']//tr[" + i + "]/td"));
		     int totalcell = celldata.size();
		     for(int j=1; j<=totalcell; j++)
				{
					
			  String data = driver.findElement(By.xpath("//table[@border='5']//tr[" + i + "]/td[" + j + "]")).getText();		
					System.out.print(data+  "   ");
				}
		     System.out.println( );
		}
		

	}

}
