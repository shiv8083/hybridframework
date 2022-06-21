package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant{

	protected static WebDriver driver;
	//method to open the browsers
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		//read the data from property file (browser)12334
		String browserValue = flib.readPropertyFile(PROP_PATH,"browser");
		//read the data from property file (url)
		String url = flib.readPropertyFile(PROP_PATH, "url");
		//use the value of browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		}

		else
		{
			System.out.println("enter the correct choice");
		}
	}
	public void failed(String methodName)
	
	{
	try
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(SCREENSHOT_PATH+methodName+".png");
	Files.copy(src, dest);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	}

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
