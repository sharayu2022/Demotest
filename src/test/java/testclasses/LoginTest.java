package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass
{
	@Test
	public void verifyLogInTab() throws InterruptedException
	{
		lp.logIn();
		lp.userName();
		lp.passWord();
		lp.logInButton();
		Assert.assertEquals(lp.welcomeText(), "Welcome group4");
	}
	

		
	

}
