package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class youtubeTest {
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is beforesuite");
		
	}
	
	@BeforeTest
    public void beforetest() {
		System.out.println("This is beforetest");

		
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is beforeclass");

	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is beforemethod");

	}
	
	@Test
	public void test() {
		System.out.println("This is test");

		
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is aftermethod");

		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is afterclass");

	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is aftertest");

	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is aftersuite");

		
	}
 
}
