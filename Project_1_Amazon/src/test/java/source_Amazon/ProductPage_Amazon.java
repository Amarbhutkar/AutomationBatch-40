package source_Amazon;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage_Amazon 
{
	@FindBy(linkText=" Product description  ")
	WebElement Product_Description_Text;
	@FindBy (id="add-to-cart-button")
	WebElement Add_to_cart_Button;
	@FindBy(xpath="(//a[@class=\"a-button-text\"])[3]")
	WebElement Go_To_Cart_Button;
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement Product_Delete;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement Proceed_To_Buy_Button;
	@FindBy(xpath="//span[@class='a-size-medium sc-number-of-items']")
	WebElement Item_Count_Fetch;
	@FindBy(xpath="//div[@class='sc-without-multicart']")
	WebElement Count_Fetch;
	
	public void description_text(WebDriver driver)
	{
		Assert.assertTrue(" Product description  ", false);
	}
	public void add_to_cart()
	{
		Add_to_cart_Button.click();
	}
	
	public void go_to_cart()
	{
		Go_To_Cart_Button.click();
	}
	public void product_delete()
	{
		Product_Delete.click();
	}
	public void proceed_to_buy()
	{
		
		Proceed_To_Buy_Button.click();
	}
	public void count_fetch()
	{
		String item_count=Count_Fetch.getText();
		System.out.println(item_count);
	}
	public void item_count()
	{
		String item_count=Item_Count_Fetch.getText();
		//String count=item_count.replaceAll("A-Z a-z", "");
		System.out.println(item_count);
	}

	public ProductPage_Amazon (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
