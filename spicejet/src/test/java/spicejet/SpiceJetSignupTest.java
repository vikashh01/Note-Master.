package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpiceJetSignupTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup Chrome Driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spiceclub.spicejet.com/signup");
    }

    @Test(priority = 1)
    public void fillSignupForm() throws InterruptedException {
        // Select Title
        WebElement titleDropdown = driver.findElement(By.xpath("//select[contains(@id,'DropDownTitle')]"));
        Select selectTitle = new Select(titleDropdown);
        selectTitle.selectByVisibleText("Mr"); // Change as needed

        // Enter First Name
        driver.findElement(By.xpath("//input[contains(@id,'TextBoxFirstName')]")).sendKeys("John");

        // Enter Last Name
        driver.findElement(By.xpath("//input[contains(@id,'TextBoxLastName')]")).sendKeys("Doe");

        // Select Country
        WebElement countryDropdown = driver.findElement(By.xpath("//select[contains(@id,'DropDownCountry')]"));
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText("India");

        // Enter Date of Birth
        WebElement dobField = driver.findElement(By.xpath("//input[contains(@id,'TextBoxBirthDate')]"));
        dobField.click();
        dobField.sendKeys("01/01/1990");  // Format: DD/MM/YYYY

        // Enter Mobile Number
        driver.findElement(By.xpath("//input[contains(@id,'TextBoxMobile')]")).sendKeys("9876543210");

        // Enter Email ID
        driver.findElement(By.xpath("//input[contains(@id,'TextBoxEmail')]")).sendKeys("johndoe@example.com");

        // Assert that the form is filled
        Assert.assertEquals(driver.findElement(By.xpath("//input[contains(@id,'TextBoxFirstName')]")).getAttribute("value"), "John");
        Assert.assertEquals(driver.findElement(By.xpath("//input[contains(@id,'TextBoxLastName')]")).getAttribute("value"), "Doe");

        // Wait for 5 seconds to observe (Optional)
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}
