package webTable_HandLing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Total_Column_Size
{

	public static void main(String[] args) 
	{
	

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");
		
     // Print Column size Of Table.....
		int Colsize = driver.findElements(By.xpath("//table[@border='5']/tbody//tr[2]/td")).size();
		
		System.out.println("Total No Of Column In Table is="  +(Colsize));
		

	
	
	
	
	
	}

}
