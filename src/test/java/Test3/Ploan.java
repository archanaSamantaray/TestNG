package Test3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ploan {
	
	@AfterTest
	public void Lastexecution()
	{
		System.out.println("i will execute last");
	}
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("ploan");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println(" i will execute first");
	}

}
