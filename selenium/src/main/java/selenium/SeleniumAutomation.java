package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumAutomation {

    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
            
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
    }
    }
    