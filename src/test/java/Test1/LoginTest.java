package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void login()
	{
		lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin");
		lp.clickButton();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
