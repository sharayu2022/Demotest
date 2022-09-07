package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.LogInPage;

public class BaseClass 
{
	static WebDriver driver;
	public LogInPage lp;
	
	@BeforeSuite
	public void launchURL()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("---start-maximized");
		options.addArguments("--disable-notifications");		
		driver=new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");

	}
	@BeforeClass
	public void objectCreations()
	{
		lp=new LogInPage(driver);
	}

 
}
