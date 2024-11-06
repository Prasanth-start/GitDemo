package testa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@AfterClass
	public void WebCarlogin()
	{
		System.out.println("WebCarlogin");
	}
	
	@Test (groups= {"Smoke"})
	public void MobileCarlogin()
	{
		System.out.println("MobileCarlogin");
	}
	
	@BeforeClass
	public void APICarlogin()
	{
		System.out.println("APICarlogin");
	}
	
	@Test 
	public void Ipadlogin()
	{
		System.out.println("Ipadlogin");
		Assert.assertTrue(false);
	}
	
	
	@BeforeTest
	public void dummylogin()
	{
		System.out.println("This is prerequisite");
	}
	
	@BeforeSuite
	public void before()
	{
		System.out.println("I will execute at top of the results");
	}
	
	@Parameters({"URL" , "APIKEY/username"})
	@Test 
	public void WebTestA(String urlnm ,String key)
	{
		System.out.println("This gives TestA on Web");
		System.out.println(urlnm);
		System.out.println(key);
	}
	
	@Test (dependsOnMethods= {"WebTestA"})
	public void MobileTestA()
	{
		System.out.println("This gives TestA on Mobile");
	}
}
