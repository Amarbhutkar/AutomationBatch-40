package source_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Amazon 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_shoe;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement short_by_4star;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-checkbox']")
	WebElement short_by_getittoday;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement First_Shoe;
	
	
	public void Search_Shoe()
	{
		search_shoe.sendKeys("Shoes");
		search_shoe.sendKeys(Keys.ENTER);
	}
	public void Short_By_4Star()
	{
		short_by_4star.click();
	}
	public void Short_GetItToday()
	{
		short_by_getittoday.click();
	}
	public void first_shoe() throws InterruptedException
	{
		Thread.sleep(1000);
		First_Shoe.click();//perfect code

		/*Set<String> Brwsr_ID=driver.getWindowHandles();
		Iterator<String> s1=Brwsr_ID.iterator();
		String Parent_Browser_ID=s1.next();
		String Child_Browser_ID=s1.next();
		//System.out.println(Parent_Browser_ID);
		//System.out.println(Child_Browser_ID);
		driver.switchTo().window(Child_Browser_ID);*/
	}
	
	public Home_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
