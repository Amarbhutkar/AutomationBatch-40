package source.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	//Step-1, locate each element by @FindBy annotation
	@FindBy(xpath="//span[.='Hello, sign in']")
	WebElement hoverover;
	
	@FindBy(name="email")
	WebElement un_textfield;
	
	@FindBy(id="continue")
	WebElement cont_btn;
	
	@FindBy(id="ap_password")
	WebElement pswd_textfield;
	
	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement signin_button;
	
    //Step : 2
	public void hoverover()
	{
		
		Actions b1=new Actions(driver);
		b1.moveToElement(hoverover).perform();
		driver.findElement(By.linkText("Sign in")).click();
	}
	public void un()
	{
		un_textfield.sendKeys("pankajprasad4798@gmail.com");
	}
	public void cont()
	{
		cont_btn.click();
	}
	public void pswd()
	{
		pswd_textfield.sendKeys("Automation@123");
	}
	public void signin()
	{
		signin_button.click();
	}
	
	//Step : 3
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this); // remember this
	}
	
	
	

}
