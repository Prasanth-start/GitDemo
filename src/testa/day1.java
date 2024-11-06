package testa;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	
	@Test (groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@AfterSuite
	public void after()
	{
		System.out.println("I will execute at bottom of the results");
	}
	
	@Parameters({"URL"})
	@Test
	public void abc(String urlname)
	{
		System.out.println("print the abc value");
		System.out.println(urlname);
		
	}
}




