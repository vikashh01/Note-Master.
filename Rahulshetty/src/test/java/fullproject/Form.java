package fullproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Form {
    
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 0)
    public void form() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")));      
        nameField.sendKeys("Vikash");

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("xdfghjo@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Demhgfdso@12345");
        driver.findElement(By.id("exampleCheck1")).click();

       
        WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(genderDropdown);
        select.selectByVisibleText("Male");

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("11/03/2000");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
    
    @Test(priority = 2)
    public void AddTOCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.cssSelector("a[href='/angularpractice/shop']")).click();

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-info'])[2]")));
        addToCartButton.click();

        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

        driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
        
        WebElement countryInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
        countryInput.sendKeys("India");
        driver.findElement(By.xpath("//a[normalize-space()='India']")).click();
        
        Thread.sleep(10000);

        WebElement checkBox = driver.findElement(By.xpath("//label[@for='checkbox2']"));
        checkBox.click();

      
        WebElement purchaseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='btn btn-success btn-lg']")));
        purchaseButton.click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit(); 
    }
}