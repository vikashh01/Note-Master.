package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Opening browser and navigating to login page");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
    }

    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("User should be navigated to the homepage")
    public void user_should_be_navigated_to_the_homepage() {
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Dashboard")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        driver.quit();
    }
}
