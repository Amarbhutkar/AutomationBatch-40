package cross_KT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		WebElement w1=driver.findElement(By.id("121"));
		boolean b1=w1.isEnabled();
		if (b1==true)
		{
			System.out.println("Componet is Enabaled");
		}
		else
		{
			System.out.println("Componet is disabled");
			
		}

	}

}
