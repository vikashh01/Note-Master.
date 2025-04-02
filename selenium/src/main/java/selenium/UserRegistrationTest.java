package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://example.com/register");

        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String phone = faker.phoneNumber().cellPhone();

        driver.findElement(By.name("full_name")).sendKeys(fullName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("phone")).sendKeys(phone);

        Select countryDropdown = new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByVisibleText("India");

        WebElement genderMale = driver.findElement(By.id("gender_male"));
        genderMale.click();

        WebElement termsCheckbox = driver.findElement(By.name("terms"));
        termsCheckbox.click();

        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement successMessage = driver.findElement(By.id("success_message"));
        if (successMessage.isDisplayed() && successMessage.getText().contains("Registration Successful")) {
            System.out.println("Test Passed: Registration Successful");
        } else {
            System.out.println("Test Failed: Registration was not successful");
        }

        driver.quit();
    }
}
