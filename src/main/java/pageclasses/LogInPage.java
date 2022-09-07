package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy(id="login2")
	private WebElement logIn;//declaration
	@FindBy(id="loginusername")
	private WebElement userName;
	@FindBy(id="loginpassword")
	private WebElement passWord;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement logInButton;
	@FindBy(xpath="//a[@class='nav-link' and @id='nameofuser']")
	private WebElement welcomeText;
	//Initilization this private data members through constructor
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Utilization
	public WebElement logIn()
	{
		logIn.click();
		return logIn;
	}
	public void userName() throws InterruptedException
	{
		Thread.sleep(2000);
		userName.sendKeys("group4");
	}
	public void passWord()
	{
		passWord.sendKeys("123456789");
	}
	public void logInButton()
	{
		logInButton.click();
	}
    public String welcomeText() throws InterruptedException
    {
    	Thread.sleep(5000);
    	return welcomeText.getText();
    }

	
}
