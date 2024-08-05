package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	public WebDriver driver;
	@Test(groups= {"Smoke"})
	public void googleTest() 
	{
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
	}
	@Test()
	public void rediffmail() throws InterruptedException
	{
		
		
		driver.findElement(By.id("login1")).sendKeys("Archana");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test()
	public void m1()
	{
		Assert.assertEquals("Archana", "Archana");//fail
		
	}

}
