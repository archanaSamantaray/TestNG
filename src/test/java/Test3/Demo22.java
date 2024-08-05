package Test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo22 {

	WebDriver driver;
	@Parameters({"browsername"})
	@BeforeTest
	public void setUp(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
	
	@Parameters({"url"})
	@Test
	public void login(String url)
	{
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
