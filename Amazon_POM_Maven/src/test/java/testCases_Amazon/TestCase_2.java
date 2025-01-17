package testCases_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import source_Amazon.Home_Page_Amazon;
import source_Amazon.Login_Amazon;

public class TestCase_2 extends Launch_Quit
{
	//Login->serach->Sort the products->logout[Sort using 4* ratings,Delivery by Today]	
	@Test
	public void login_to_logout()
	{
		Login_Amazon L1=new Login_Amazon(driver);
		L1.un_txtfld();
		L1.continue_button();
		L1.pswrd_txtfld();
		L1.signin_button();
		
		Home_Page_Amazon H1=new Home_Page_Amazon(driver);
		H1.Search_Shoe();
		H1.Short_By_4Star();
		H1.Short_GetItToday();
		
		WebElement w1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2=new Actions(driver);
		a2.moveToElement(w1).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		/*Logout_Page_Amazon L2=new Logout_Page_Amazon(driver);
		L2.logout_amazon();
		L2.SignOut();*/
		
	}
}
