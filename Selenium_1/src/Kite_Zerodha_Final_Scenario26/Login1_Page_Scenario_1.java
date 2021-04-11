package Kite_Zerodha_Final_Scenario26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1_Page_Scenario_1 
{
// Declaration Of Global Varibles
@FindBy(xpath="") private WebElement USER;
@FindBy(xpath="") private WebElement PASS;
@FindBy(xpath="")private WebElement LOGIN;


// Initialise Value Of G.V
public Login1_Page_Scenario_1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

// Utilise method In G. V
// For Username...
public void setLogin1_Page_Scenario_1user(String User1) 
{
	USER.sendKeys(User1);
}

// for Passward..
public void setLogin1_Page_Scenario_1Pass(String Pass1) 
{
     PASS.sendKeys(Pass1);
}

//for login..
public void ClickLogin1_Page_Scenario_1Login() 
{
	LOGIN.click();
}	
	
	
	
	
	
	
	
	
	
}
