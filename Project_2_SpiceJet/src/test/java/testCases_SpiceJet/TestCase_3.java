package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class TestCase_3 extends Launch_Quit
{
	//login with invalid credentials.
	@Test
	public void Login() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.login();
		h1.mobile_no();
		h1.invalid_password();
		Thread.sleep(2000);
		h1.login_button();
	}

}
