package source_SpiceJet;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_SpiceJet 
{
	@FindBy(linkText="Signup")
	WebElement SignUp_Button;
	@FindBy(xpath="//div[.='Login']")
	WebElement Login;
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement Mobile_No;
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement Login_Button;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement Source_City;
	@FindBy(xpath="//div[.='Kempegowda International Airport']")
	WebElement Source_Name;
	@FindBy (xpath="(//*[name()='circle'])[3]")
	WebElement Round_Trip_Radio_Button;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement Destination_City;
	@FindBy(xpath="//div[.='Lal Bahadur Shastri International Airport']")
	WebElement Destination_Name;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement Date_Dropdown;
	@FindBy(xpath="(//div[.='28'])[7]")
	WebElement Date_select;
	@FindBy(xpath="(//div[.='30'])[8]")
	WebElement Return_Date;
	@FindBy(xpath="(//*[name()='circle'])[6]")
	WebElement Senior_Citi_Radio_Button;	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement Search_Flight_Button;
	@FindBy(xpath="(//*[name()='rect'])[2]")
	WebElement Senior_Discount_popup;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement Continue_Button;
	
	public void signup(WebDriver driver)
	{
		SignUp_Button.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> Browser_ID=s1.iterator();
		String Parent_Browser_ID=Browser_ID.next();
		String Child_Browser_ID=Browser_ID.next();
		driver.switchTo().window(Child_Browser_ID);	
	}
	public void login()
	{
		Login.click();
	}
	public void mobile_no()
	{
		Mobile_No.sendKeys("9930034615");
	}
	public void password()
	{
		Password.sendKeys("Automation@123");
	}
	public void invalid_password()
	{
		Password.sendKeys("Automation@12jhkjhjk67857965976E3");
	}
	public void login_button()
	{
		Login_Button.click();
	}
	public void source_city()
	{
		Source_City.click();
		
	}
	public void source_name()
	{
		Source_Name.click();
		
	}
	public void destination_city()
	{
		Destination_City.click();
	}
	public void destination_name()
	{
		Destination_Name.click();
	}
	public void date_dropdown()
	{
		Date_Dropdown.click();
	}
	public void date_select()
	{
		Date_select.click();
	}
	public void flight_search_button()
	{
		Search_Flight_Button.click();
	}
	public void round_trip_radio_button()
	{
		Round_Trip_Radio_Button.click();
	}
	public void return_date()
	{
		Return_Date.click();
	}
	public void senior_citizen_radio_button()
	{
		Senior_Citi_Radio_Button.click();
	}
	public void senior_discount_popup()
	{
		Senior_Discount_popup.click();
	}
	public void continue_button()
	{
		Continue_Button.click();
	}
	
	
	
	
	
	public Homepage_SpiceJet(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
