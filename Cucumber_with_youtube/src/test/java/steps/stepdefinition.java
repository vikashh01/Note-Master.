package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefinition{
	WebDriver driver;
	
	@Given("user on the login page")
	public void user_on_the_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
	    
	}
	@Given("the user enter Username")
	public void the_user_enter_username() {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	    
	}
	@Given("the user enter password")
	public void the_user_enter_password() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}
	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}
	
}