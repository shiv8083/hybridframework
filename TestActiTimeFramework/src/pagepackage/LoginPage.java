package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInChechbox;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(xpath = "//span[contains(text(),'invalid')]") private WebElement errorMsg;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUsn()
	{
		return usn;
	}
	public WebElement getpass()
	{
		return pass;
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	public WebElement getkeepMeLoggedInChechbox()
	{
		return keepMeLoggedInChechbox;
	}
	public WebElement getLicenseLink()
	{
		return licenseLink;
	}
	public WebElement getErrorMsg()
	{
		return errorMsg;
	}
	
	//Generic Reusable Method
	public void actiTimeLogin(String validUsername,String validPassword) throws InterruptedException
	{
		Thread.sleep(4000);
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
		pass.clear();
		Thread.sleep(2000);
	}
	
}
