package Test3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeSuite
	public void first()
	{
		System.out.println("first excution");
	}
	@AfterSuite
	public void last()
	{
		System.out.println("last execution");
	}
	
	@Test(groups= {"Smoke"})
	public void loan()
	{
		System.out.println("good");
	}
	@Test
	public void earning()
	{
		System.out.println("2nd earning");
	}
	
	@BeforeMethod
	public void premethod()
	{
		System.out.println("it wll excecute before each test method");
	}
	@AfterMethod
	public void postmethod()
	{
		System.out.println("it will excute fter each test method");
	}
	@BeforeClass
	 public void preclass()
	 {
		 System.out.println("it will execute before class");
	 }
	@AfterClass
	public void postclass()
	{
		System.out.println("it will execute after class");
	}

}
