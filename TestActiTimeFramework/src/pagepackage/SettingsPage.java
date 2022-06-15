package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	@FindBy(linkText = "Setting") private WebElement settingsLink;
	@FindBy(name = "firstHierarchyLevelCode")WebElement TopgroupinglevelDropdown;
	@FindBy(name = "secondHierarchyLevelCode")WebElement MiddlegroupinglevelDropdown;
	@FindBy(name = "thirdHierarchyLevelCode")WebElement TimeentrylevelDropdown;
	
	//Declaration
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Initialization
	public WebElement getSettingsLink()
	{
		return settingsLink;
	}
	public WebElement getTopgroupinglevelDropdown()
	{
		return TopgroupinglevelDropdown;
	}
	public WebElement getMiddlegroupinglevelDropdown()
	{
		return MiddlegroupinglevelDropdown;
	}
	public WebElement getTimeentrylevelDropdown()
	{
		return TimeentrylevelDropdown;
	}
	
	//Utilization
	public void clickSettingsLink()
	{
		settingsLink.click();
	}

}
