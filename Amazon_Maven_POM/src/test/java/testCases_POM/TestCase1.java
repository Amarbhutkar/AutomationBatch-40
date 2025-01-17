package testCases_POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import source_POM.Login_Amazon;

public class TestCase1 
{
	@Test
	public void amazon_login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Hoverover
		/*(WebElement a1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions b1=new Actions(driver);
		b1.moveToElement(a1).perform();
		driver.findElement(By.linkText("Sign in")).click();
		
		Login_Amazon l2=new Login_Amazon(driver);
		l2.un1();	
		l2.cont();
		l2.pswd();
		l2.signin();
		l2.search_shoe();
		l2.shoe();
		Thread.sleep(1000);
		l2.wishlist_1();
		/*l2.view_list_1();
		l2.addtocart();
		Thread.sleep(2000);
		l2.checkout();*/
		
		
		//step-2 search the product
		
		Set<String> browser_id=driver.getWindowHandles();
		Iterator<String> p1=browser_id.iterator();
		String Parent=p1.next();
		String prnt_chld=p1.next();
		System.out.println(Parent);
		System.out.println(prnt_chld);
		driver.switchTo().window(prnt_chld);
		
	}
		

}
