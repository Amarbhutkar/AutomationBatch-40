package source_FB;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Login_FB 
{
	@FindBy(id="email")
	WebElement User_Name;
	@FindBy(id="pass")
	WebElement Password;
	@FindBy(name="login")
	WebElement Login;
	
	public void UN()
	{
		User_Name.sendKeys("pankajprasad@gmail.com");
	}
	public void Pswd()
	{
		Password.sendKeys("Pankaj@123");
	}
	public void Lgn()
	{
		Login.click();
		//Assert.assertTrue("https://www.amazon.in/?ref_=nav_custrec_signin", true);
	}
	
	public Login_FB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
