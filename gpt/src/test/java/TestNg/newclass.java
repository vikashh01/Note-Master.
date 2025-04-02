package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newclass {
	
	
	@BeforeMethod
	public void userregistration() {
		System.out.println("user is getting registered");
		
	}
	@Test
	public void login() {
		System.out.println("user is able to login");
		
	}
	
	@Test
	public void search() {
		System.out.println("user is able to search");
		
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("user is able to logout");
		
	}

}
