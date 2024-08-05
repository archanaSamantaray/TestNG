package Test3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Provider {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	@Test(dataProvider="dp")
	public void login(String email,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		}
	
	@DataProvider(name="dp")
	String[][]logindata()
	{
		String data[][]= {   {"archana","arch123"} ,{"anitapradhan12@gmail.com","anita@12"}  ,{"arun","meshtyr"}       ,{"abc@gmail.com","aryan234"}                
		};
		
		return data;
	}

}
