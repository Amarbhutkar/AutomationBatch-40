package selenium.program;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spice_Jet {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		/*ChromeOptions options 
		= 
		new 
		ChromeOptions
		(
		)
		;
		options
		.
		addArguments
		(
		"--headless=new"
		)
		;
		WebDriver driver 
		= 
		new 
		ChromeDriver
		(options
		)
		;*/

	}

}
