package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test(groups = {"smoke", "regression"}, priority = 1)
    public void validateHomePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Practice Page");
    }

    @Test(groups = {"smoke"}, priority = 2)
    public void validateRadioButton() {
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
    }

    @Test(groups = {"regression"}, priority = 3, dependsOnMethods = {"validateHomePageTitle"})
    public void validateSuggestionBox() {
        driver.findElement(By.id("autocomplete")).sendKeys("India");
        String text = driver.findElement(By.id("autocomplete")).getAttribute("value");
        Assert.assertEquals(text, "India");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
