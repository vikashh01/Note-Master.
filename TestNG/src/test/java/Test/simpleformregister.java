package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class simpleformregister {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
	}
	
	@Test(priority = 1, groups = "smoke")
	public void register() {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vikash");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vikash@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8674825048");
		driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Register should be successful");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

	}
	
	@Test(priority = 2, groups = "smoke")
	public void invalid() {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vik^^ash");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kum&&ar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vikash...........il.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("865048");
		driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Register should be not successful");
		driver.findElement(By.xpath("//input[@value='submit']")).click();

	}
	
	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.close();
	}
}
