package final_exam;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("mouse");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//form[@class='_2rslOn header-form-search OpXDaO']/ul/li)[2]")).click();
		
		List<WebElement> Autosuggestion=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int Count_Auto=Autosuggestion.size();
		Autosuggestion.get(Count_Auto-6).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='wjcEIp'])[2]")).click();
		
		Set<String> browser_id=driver.getWindowHandles();
		Iterator<String> i1=browser_id.iterator();
		String parent_id=i1.next();
		String child_id=i1.next();
		
		System.out.println(parent_id);
		System.out.println(child_id);
		driver.switchTo().window(child_id);
		
		
		//driver.close();
		
		TakesScreenshot t1=     (TakesScreenshot) driver;
		File Source=t1.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\Pankaj Prasad\\Desktop\\Selenium Screenshot\\grotechminds.png");
		FileHandler.copy(Source, Destination);
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
