package testa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS1 {
	
	@AfterTest
	public void runlast()
	{
		System.out.println("Run last");
	}
	
	@BeforeTest
	public void runfirst()
	{
		System.out.println("Run First");
	}

}
