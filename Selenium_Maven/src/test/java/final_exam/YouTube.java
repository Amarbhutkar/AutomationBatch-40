package final_exam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_YouTube.class)
public class YouTube extends Listener_YouTube
{
	@Test
	public void youtube() throws InterruptedException 
	{

		driver= new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		WebElement search=driver.findElement(By.xpath("(//input[@id='search'])[1]"));
		Thread.sleep(2000);
		search.sendKeys("Narendra Modi");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[7]")).click();
		WebElement UserName=driver.findElement(By.id("identifierId"));
		UserName.sendKeys("pankajprasad4798@gmail.com"+ Keys.ENTER);
		/*WebElement Password=driver.findElement(By.name("Passwd"));
		Password.sendKeys("Automation_@4798"+Keys.ENTER);*/
		
		
	}

}