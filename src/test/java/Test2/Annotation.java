package Test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.edgedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	
	@Test(dataProvider="dp")
	public void m1(String email,String pwd) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
		//String exp_title="nopCommerce demo store. Login";
		//String act_title=driver.getTitle();
		
		//Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	String[][] loginTest()
	{
	String[][] data= {{"ammm","arch12"},
			          {"styo","1234g"}
	                 ,{"archana.samantaray18@gmail.com","Murali111"}};
	
	return data;

}
}
