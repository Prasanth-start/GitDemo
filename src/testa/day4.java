package testa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterTest
	public void last()
	{
		System.out.println("This is last testcase");
	}
	
	@BeforeMethod
	
	public void BMethod()
	{
		System.out.println("I will execute everytime before the tests within the class day4");
	}
	
	@Test
	public void WebHomelogin()
	{
		System.out.println("WebHomelogin");
	}
	
	@AfterMethod
	public void AMethod()
	{
		System.out.println("I will execute everytime after the tests within the class day4");
	}
	
	@Test
	public void MobileHomelogin()
	{
		System.out.println("MobileHomelogin");
	}
	
	@Test (dataProvider ="getData")
	public void APIHomelogin(String username , String password)
	{
		System.out.println("APIHomelogin");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void MobilesPagelogin()
	{
		System.out.println("Login Mobile page");
	}
	
	@Test (groups= {"Smoke"})
	public void MobileCartlogin()
	{
		System.out.println("Login Mobile cart");
		
	}
	
	@DataProvider
	@Test
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
				
		//1st -Passing username and password 		
		//2nd -Passing username and password 
		//3rd -Passing username and password 	
		
		//1st set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
	}
	
}
