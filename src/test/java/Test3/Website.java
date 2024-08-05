package Test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Website {
	
	
	
   public  WebDriver driver;
   public WebElement element;

 
    
   @BeforeMethod
    public void init()
    {
    	
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    }
    
   @Test
    public void facebook() throws InterruptedException
    {
	  
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Archana");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("archana123");
    	Thread.sleep(3000);
    	
    	
    }
   @AfterMethod
    public void tearDown() throws InterruptedException
    {
	   driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
   	Thread.sleep(3000);   
    }

}
