package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepefinitrion{
	WebDriver driver;
	@Given("user on the login page")
	public void user_on_the_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://bookcart.azurewebsites.net/login");
	}
	@Given("user enter the username")
	public void user_enter_the_username() {
	    driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("Vikash");
	}
	@Given("user enter the password")
	public void user_enter_the_password() {
	    driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Vikash123");

	}
	@Then("user click on login")
	public void user_click_on_login() {
		driver.findElement(By.className("mdc-button__label")).click();
	    
	}
}