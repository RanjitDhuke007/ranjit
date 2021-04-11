package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Selected_option_Method
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/DELL/Desktop/HTML%20Program/MultipleList.html");
		//driver.manage().window().maximize();
		
		WebElement hr = driver.findElement(By.xpath("//select[@name='cars']"));
		Thread.sleep(5000);
		
		Select bb=new Select(hr);
	/*	
		List<WebElement> yyu = bb.getAllSelectedOptions();
		Thread.sleep(5000);
	 for(WebElement ufj:yyu)
	 {
		 System.out.println(ufj.getText());
		 System.out.println();
	 }
		
	*/	
		System.out.println("Deselect All Mehod");

		//bb.deselectAll();
		Thread.sleep(3000);
		bb.deselectByIndex(0);
		Thread.sleep(3000);
		
		bb.deselectByValue("saab");
		Thread.sleep(3000);
		bb.deselectByVisibleText("Audi");
		bb.deselectByValue("opel");
		
		
		

	}

}
