package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_gmail 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/user-account/");
		driver.findElement(By.className("nsl-button-label-container")).click();
		
		Set<String> browser_id=driver.getWindowHandles();// to move control from parent to child
		Iterator<String> b1=browser_id.iterator();
		String parent_ID=b1.next();
		String child_ID_1=b1.next();
		
		System.out.println("Parent browser ID : "+parent_ID);
		System.out.println("Child browser ID 1 : "+child_ID_1);
		

		
	}
	
}
