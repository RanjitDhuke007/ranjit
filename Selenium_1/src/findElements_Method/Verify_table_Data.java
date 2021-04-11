package findElements_Method;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_table_Data 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");	
			
		
		Scanner data1=new Scanner(System.in);
		String verifyexp = data1.next();
		
		
		// For Print body Of Table....
		 int TotalRow = driver.findElements(By.xpath("//table[@border='5']/tbody/tr")).size();
			for(int i=2; i<=TotalRow; i++)
			{
		  List<WebElement> celldata = driver.findElements(By.xpath("//table[@border='5']//tr[" + i + "]/td"));
			  int totalcell = celldata.size();
			  for(int j=1; j<=totalcell; j++)
					{
						
	     String data = driver.findElement(By.xpath("//table[@border='5']//tr[" + i + "]/td[" + j + "]")).getText();		
		           if(verifyexp.equals(data))
		           {
		        	  System.out.println("data Present at= "+i+" , "+j); 
		           }
	     
					}
			  
			}
	
		

	}

}
