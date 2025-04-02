package project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        
        WebElement profileDropdown = driver.findElement(By.className("oxd-userdropdown-name"));
        profileDropdown.click();
        Thread.sleep(2000); 

        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
        logoutButton.click();
        Thread.sleep(2000);
	}

}
