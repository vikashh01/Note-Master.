package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registration {
	WebDriver driver;
	
	@Given("The use onn the registration page")
	public void the_use_onn_the_registration_page() {
	   driver = new ChromeDriver();
	   driver.get("https://bookcart.azurewebsites.net/register");
	}
	@Given("User firstName")
	public void user_first_name() {
	    driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c508571215-3']")).sendKeys("vikash");
	}
	@Given("User lastName")
	public void user_last_name() {
	    driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("kumar");

	}
	@Given("User name")
	public void user_name() {
	    driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("vikash Kumar");

	}
	@Given("User password")
	public void user_password() {
	    driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("vikash123");

	}
	@Given("User ComformPassword")
	public void user_comform_password() {
	    driver.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("vikash123");

	}
	
	@Given("gender")
	public void gender() {
	    driver.findElement(By.xpath("//input[@id='mat-radio-0-input']")).click();

	}
	
	@Then("Click on Registration")
	public void click_on_registration() {
	    driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();

	}
}
