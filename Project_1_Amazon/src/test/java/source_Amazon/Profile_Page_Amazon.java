package source_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Profile_Page_Amazon 
{
	//@FindBy(css="span[class=\"a-declarative\"]")
	@FindBy(xpath="//span[@class='a-declarative']")
	WebElement Profile_Edit_Button;
	@FindBy(id="editProfileNameInputId")
	WebElement Edit_Profile_Name;
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement Continue_Button;
	//@FindBy(xpath="//div[@class=\"filter-pill selected \"]")
	//WebElement mens;
	@FindBy(xpath="//div[.='Shoes']")
	WebElement Shoe_Size_Preference;
	@FindBy(xpath="//button[.='Add']")
	WebElement Add_Button;
	@FindBy(className="options-list eight-column-grid")
	WebElement Shoe_Size_Select;
	
	public void edit_button()
	{
		Profile_Edit_Button.click();
	}
	public void edit_profile_name()
	{
		Edit_Profile_Name.sendKeys(Keys.CONTROL+"A");
		Edit_Profile_Name.sendKeys("Neha");
	}
	public void continue_button()
	{
		Continue_Button.click();
	}
	
	public void shoe_size_preference()
	{
		Shoe_Size_Preference.click();
	}
	public void add_button()
	{
		Add_Button.click();
	}
	public void Select_Shoe_Size(WebDriver driver)
	{
		Select s1=new Select(Shoe_Size_Select);
		s1.selectByVisibleText("8");
		s1.selectByVisibleText("Standard");
	}
	
	public Profile_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
