package webTable_HandLing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_Data_TAble
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:/Users/DELL/Downloads/Table.html");
				
     // Print All Data of Table.....
		
		// 1. find row size Of table
		int Rowsize = driver.findElements(By.xpath("//table[@border='5']/tbody//tr")).size();
		
		for(int i=1; i<=Rowsize; i++)
		{
			int colsize=0;
			if(i==1)
			{
				colsize=driver.findElements(By.xpath("//table[@border='5']/tbody//tr[" + i + "]/th")).size();
			}
			else
			{
				colsize=driver.findElements(By.xpath("//table[@border='5']/tbody//tr[" + i + "]/td")).size();
			}
			
			for(int j=1; j<=colsize; j++)
			{
				String text="";
				if(i==1)
				{
					text=driver.findElement(By.xpath("//table[@border='5']/tbody//tr[" + i + "]/th[" + j + "]")).getText();
				}
				else
				{
					text=driver.findElement(By.xpath("//table[@border='5']/tbody//tr[" + i + "]/td[" + j + "]")).getText();

				}
				System.out.print(text+  "  ");
			}System.out.println();
		}

		
		
		
		
		
		
		

	}

}
