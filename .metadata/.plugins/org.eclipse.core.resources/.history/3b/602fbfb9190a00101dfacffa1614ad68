package test;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class QafoxTest extends BaseTest {

    @Test(priority = 1)
    public void testHomePage() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#top-links > ul > li.dropdown > a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a"))).click();
    }

    @Test(priority = 2)
    public void testRegister() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("vikash");
        driver.findElement(By.id("input-lastname")).sendKeys("kumar");
        driver.findElement(By.id("input-email")).sendKeys("vikashkumarbharti@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("8767501671");
        driver.findElement(By.id("input-password")).sendKeys("vikash");
        driver.findElement(By.id("input-confirm")).sendKeys("vikash");
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    @Test(priority = 3, dependsOnMethods = {"testRegister"})
    public void testLogin() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("Vikashkumarbharti@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("vikash");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }

    @Test(priority = 4)
    public void testForgotPassword() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.linkText("Forgotten Password")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).clear();
        driver.findElement(By.id("input-email")).sendKeys("rashmininawe1@gmail.com");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }

    @Test(priority = 5)
    public void testSearch() {
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("Mobile");
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
    }

    @Test(priority = 6)
    public void testCategoryNavigation() {
        driver.get("https://tutorialsninja.com/demo/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Desktops"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Mac (1)"))).click();
    }
}