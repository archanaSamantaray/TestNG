package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
	
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="dp")
	public void loginTest(String email,String pwd) throws InterruptedException 
	
	
	{

		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	String[][] logindata()
	{
		String[][] data= {{"archana.samanataray18@gmail.com","Linuu@1212"},
		                  {"abc@gmail.com","any2121!"},
		                  {"xwn@yahoo.com","awer@21"}
		                   
		};
		
		return data;
	}

}
