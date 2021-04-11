package Practice_Insurance_Project;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_Insurance_project1 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedr"+ "iver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// select Title
		WebElement dd = driver.findElement(By.xpath("//select[@name='title']"));
		Select op=new Select(dd);
		op.selectByValue("Mr");
		Thread.sleep(2000);
		List<WebElement> tti = op.getOptions();
		System.out.println("Size Of select Tile Is: "+(tti.size()));
		TreeSet set=new TreeSet();
		System.out.println("========Regular order========");
		for(WebElement bfj:tti)
		{
			//bfj.getText();
		
			String xyz = bfj.getText();
			System.out.println(xyz);
			set.add(xyz);
			
		}
		System.out.println();
		System.out.println("=======Desending Order=======");
		System.out.println();
		Iterator rrr = set.descendingIterator();
		while(rrr.hasNext())
		{
			System.out.println(rrr.next());
		}
		System.out.println();
		System.out.println("======Assending Order========");
		System.out.println();
		for(Object pq:set)
		{
			System.out.println(pq);
		}
	
		
		Thread.sleep(2000);
		
		/*
		// FirstName...
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("RJ");
		Thread.sleep(2000);	
		
		// SirName....
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhuke");
		Thread.sleep(2000);	
		
		
		//Phone No...
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7620075755");
		Thread.sleep(2000);
		
		//DOB Year...
		WebElement or = driver.findElement(By.xpath("//select[@name='year']"));
		Select gg=new Select(or);
		gg.selectByValue("1995");
		Thread.sleep(2000);
		
		//DOB Month
		WebElement rre = driver.findElement(By.xpath("//select[@name='month']"));
		Select dyd=new Select(rre);
		dyd.selectByValue("11");
		Thread.sleep(2000);
		
		
		// DOB Of Day
		WebElement ff = driver.findElement(By.xpath("//select[@name='date']"));
		Select jd=new Select(ff);
		jd.selectByValue("10");
		Thread.sleep(2000);
		
		
		// Licence Period....
		WebElement mk = driver.findElement(By.xpath("//select[@name='licenceperiod']"));
		Select fh=new Select(mk);
		fh.selectByValue("10");
		Thread.sleep(2000);
		
		//Accupation...
		WebElement mky = driver.findElement(By.xpath("//select[@name='occupation']"));
		Select fyh=new Select(mky);
		fyh.selectByVisibleText("Engineer");
		Thread.sleep(1000);
		
		//Address
		driver.findElement(By.xpath("//input[@name='street']")).sendKeys("kuteMala Katraj Pune");
		Thread.sleep(1000);
		
		
		// City
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		Thread.sleep(1000);
		
		
		//country...
		driver.findElement(By.xpath("//input[@name='county']")).sendKeys("India");
		Thread.sleep(2000);
		
		// PostCode
		driver.findElement(By.xpath("//input[@name='post_code']")).sendKeys("413103");
		Thread.sleep(1000);
		
		//Email..
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ranjitdd@gmail.com");
		Thread.sleep(1000);
		
		//Passward
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		Thread.sleep(1000);
		
		// Confirm Passward
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("1234");
		Thread.sleep(1000);
		
		// Create..
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		*/
	}

}
