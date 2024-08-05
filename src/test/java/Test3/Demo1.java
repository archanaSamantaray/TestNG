package Test3;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test(groups= {"Smoke"})
	public void method1()
	{
		System.out.println("Hello");
	}

}
