package selenium.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibibo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		WebElement w1=driver.findElement(By.xpath("(//p[@class='sc-12foipm-6 erPfRs'])[1]"));
		
		//WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Enter city or airport")));
		w1.sendKeys("Bengaluru");

	}

}