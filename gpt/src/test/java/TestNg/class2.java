package TestNg;

import org.testng.annotations.Test;

public class class2 {
	
	//if we want test code is check line by line so we have to  set priority
	
	@Test(priority = 1)
	public void userregistration() {
		System.out.println("user is getting registered");
		
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("user is able to login");
		
	}
	
	@Test(priority = 3 )
	public void homepage() {
		System.out.println("user is able to go to home page");
		
	}
	
	@Test(priority = 4)
	public void search() {
		System.out.println("user is able to search");
		
	}
	
	@Test(priority = 5)
	public void validating() {
		System.out.println("user is able to validating");
		
	}
	
	@Test(priority = 6)
	public void logout() {
		System.out.println("user is able to logout");
		
	}

}
