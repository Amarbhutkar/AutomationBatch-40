package source_SpiceJet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Boooking_Page 
{
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[1]")
	WebElement Title_Selection_dd;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement Title_Selection;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement First_Name;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement Last_Name;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement Mobile_No;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement Email_Add;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar'])[2]")
	WebElement County_Selection;
	@FindBy(xpath="(//div[@class='css-1dbjc4n'])[13]")
	WebElement County_Selection_dd;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement Town_Name;
	@FindBy(xpath="(//*[name()='rect'])[3]")
	WebElement Passenger_info_checkbox;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement Coutinue_button_booking_page;
	@FindBy(xpath="(//div[@class='r-1awozwy r-1hv0noj r-z2wwpe r-1loqt21 r-18u37iz r-1ugchlj r-1wtj0ep r-1joea0r r-6dt33c r-nsbfu8 r-1qfoi16 r-1otgn73 r-1i6wzkk r-lrvibr r-b8lwoo css-1dbjc4n'])[1]")
	WebElement First_Add_Button;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'])[1]")
	WebElement Seat_Selection;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement Meal_Selection_Option;
	
	
	
	public void title_selection_dd()
	{
		Title_Selection_dd.click();
	}
	public void title_selection()
	{
		Title_Selection.click();
	}
	public void FIRST_NAME()
	{
		First_Name.sendKeys("PANKAJ");
		First_Name.sendKeys(Keys.TAB);
		
	}
	public void LAST_NAME()
	{
		Last_Name.sendKeys("PRASAD");
	}
	public void Email()
	{
		Email_Add.sendKeys("pankajprasad30@gmail.com");
		Email_Add.sendKeys(Keys.TAB);
		
	}
	public void county_selection()
	{
		County_Selection.click();
		
	}
	public void county_selection_dd(WebDriver driver)
	{
		Select s1=new Select(County_Selection_dd);
		s1.selectByVisibleText("India");
	}
	public void town_name()
	{
		Town_Name.sendKeys("Bangalore");
	}
	public void Mobile_No()
	{
		Mobile_No.sendKeys("9930034615");
	}
	public void passenger_info_checkbox()
	{
		Passenger_info_checkbox.click();
	}
	public void payment_page_continue_button()
	{
		Coutinue_button_booking_page.click();
	}
	public void seat_selection()
	{
		Coutinue_button_booking_page.click();
	}
	public void first_add_button()
	{
		Seat_Selection.click();
	}
	public void select_meals_option()
	{
		Seat_Selection.click();
	}
	
	
	public Boooking_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
