package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;
import source_Amazon.Profile_Page_Amazon;

public class TestCase_4 extends Launch_Quit
{
	// Check if a user can successfully edit their profile information
	@Test
	public void Profile_Edit() throws InterruptedException
	{
		Login_Amazon h1=new Login_Amazon(driver);
		h1.hoverover(driver);
		h1.signin_button();
		h1.username();
		h1.continue_button();
		h1.password();
		h1.signin_button_1();
		h1.hoverover(driver);
		
		Home_Amazon h2=new Home_Amazon(driver);
		Thread.sleep(1000);
		h2.manage_profile();
		Thread.sleep(2000);
		h2.view_button();
		
		Profile_Page_Amazon p1=new Profile_Page_Amazon(driver);
		Thread.sleep(1000);
		p1.edit_button();
		p1.edit_profile_name();
		Thread.sleep(1000);
		p1.continue_button();
		Thread.sleep(2000);
		//p1.Mens();
		Thread.sleep(2000);
		p1.shoe_size_preference();
		Thread.sleep(2000);
		p1.add_button();
		Thread.sleep(2000);
		p1.Select_Shoe_Size(driver);
		
		
		
		
	}
	

}
