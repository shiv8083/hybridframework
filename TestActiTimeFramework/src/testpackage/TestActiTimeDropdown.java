package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;
public class TestActiTimeDropdown extends BaseTest {
  @Test
  public void printAllOptionsOfTheDropdown() throws IOException, InterruptedException
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  String validUsername = flib.readPropertyFile(PROP_PATH,"username");
	  String validpassword = flib.readPropertyFile(PROP_PATH,"password");
	  lp.actiTimeLogin(validUsername, validpassword);
	  
	  SettingsPage sp = new SettingsPage(driver);
	  sp.clickSettingsLink();
	  
	  WebDriverCommonLib wb = new WebDriverCommonLib();
	  wb.getAllOptions(sp.getTopgroupinglevelDropdown());
	  wb.getAllOptions(sp.getMiddlegroupinglevelDropdown());
	  wb.getAllOptions(sp.getTimeentrylevelDropdown());
	  
  }
}
