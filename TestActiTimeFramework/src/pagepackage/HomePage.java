package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath ="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath ="//a[.='Create new tasks']" ) private WebElement createNewTask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(xpath = "//td[.='Enter Time-Track']") private WebElement enterTimeTrack;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeBtn;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);;
	}

	//Utilization
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
	public WebElement getCreateNewTask()
	{
		return createNewTask;
	}
	public WebElement getSetting()
	{
		return settings;
	}
	public WebElement getEnterTimeTrack()
	{
		return enterTimeTrack;
	}
	public WebElement getSaveLeaveTime()
	{
		return saveLeaveTimeBtn;
	}
	
	//Operational Methods
	public void clickLogout()
	{
		logoutLink.click();
	}
	public void clickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}
}
