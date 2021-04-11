package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Method {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		// Login Page Of Instagram......
		
		driver.get("https://www.instagram.com/");
		
		// to check instagram logo present or not
		// Approach1
		/*
		boolean logo = driver.findElement(By.xpath("//h1[text()='Instagram']")).isDisplayed();
		
		System.out.println(logo);    // return type is Boolean...
        */
		
		
		// approach......
		WebElement f = driver.findElement(By.xpath("//h1[text()='Instagram']"));
		
		boolean oh = f.isDisplayed();
		System.out.println(oh);
		
		
		
		
		
		
		
	}

}
