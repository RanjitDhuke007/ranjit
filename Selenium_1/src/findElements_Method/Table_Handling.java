package findElements_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handling 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/Table.html");
		
		
		// To get Row size Of Table
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@border='5']/tbody/tr"));
		System.out.println("No Of Row in Table is: " +(rowsize.size()));
		System.out.println();
		
		
		// To Get Coloumn Size Of Table
		List<WebElement> Collsize1 = driver.findElements(By.xpath("//table[@border='5']/tbody/tr[1]/th"));
		System.out.println("No of Coloumn In 1 Row :"+(Collsize1.size()));
		System.out.println();
		
		
		// To Get No Of Column in 2 row...
		List<WebElement> Collsize2 = driver.findElements(By.xpath("//table[@border='5']//tr[2]/td"));
		System.out.println("No of Coloumn In 2 Row :"+(Collsize2.size()));
	}

}
