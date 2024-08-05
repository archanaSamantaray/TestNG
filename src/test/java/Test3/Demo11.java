package Test3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo11 {
	public class Parallel {
		
		WebDriver driver;
		
		@BeforeClass
		@Parameters({"browser"})
		public void setup(String br) throws InterruptedException
		{   
			if(br.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			
			}
			
			else
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com");
			Thread.sleep(2000);
		}
		
		@Test()
		public void logoDisplay()
		{
		
			
				boolean status=driver.findElement(By.xpath("(//img[@alt='orangehrm-logo'])[2] /parent:: div")).isDisplayed();
				Assert.assertEquals(status, true);
			
			
		}
		
		@AfterClass
		public void teardown()
		{
			driver.close();
		}


	}
}

