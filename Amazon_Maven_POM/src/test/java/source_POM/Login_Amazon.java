package source_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Amazon 
{
	
	WebDriver driver;
	
	@FindBy(id="//span[.='Hello, sign in']")
	WebElement Hoverover;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_1;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement signin;
	public void hoverover()
	{
		//WebElement a1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions b1=new Actions(driver);
		//b1.moveToElement(a1).perform();
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	public void un1()
	{
		username.sendKeys("pankajprasad4798@gmail.com");
	}
	public void cont()
	{
		continue_1.click();
	}
	public void pswd()
	{
		password.sendKeys("Automation@123");
	}
	public void signin()
	{
		signin.click();
	}
	
	public Login_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement shoe_1;
	public void shoe()
	{
		shoe_1.click();
	}
	//step:4
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;
	public void wishlist_1()
	{
		wishlist.click();
	}
	@FindBy(linkText="View Your List")
	
	WebElement view_your_list;
	public void view_list_1()
	{
		view_your_list.click();
	}
	
	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement addtocart;
	public void addtocart()
	{
		addtocart.click();
	}
	
	@FindBy(xpath="(//a[@class='a-button-text'])[4]")
	WebElement proceed_to_checkout;
	public void checkout()
	{
		proceed_to_checkout.click();
	}
	*/
	
	
	

}
