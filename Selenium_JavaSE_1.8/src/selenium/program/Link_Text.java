package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.yahoo.com");
	    driver.findElement(By.linkText("Sign in")).click();
	}

}
