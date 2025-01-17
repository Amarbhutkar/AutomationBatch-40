package final_exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Amazon 
{
	WebDriver driver;
	@Test (dataProvider="data2")
	public void amazon_searc(String name)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="data2")
	public Object [][] method1()
	{
		return new Object[][] {{"Shoes"},{"Mobile"}};
		
	}

}
