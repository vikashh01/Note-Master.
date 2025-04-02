package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class search {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() {
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
	}
	
	@Test(priority = 1, groups = "smoke")	
	public void Loaptop() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
		
	}
	
	@Test(priority = 2, groups = "sanity")	
	public void Mobile() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
		
	}
	@Test(priority = 3, groups = "smoke")
	public void book() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("book");
		driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
	
}
	@Test(priority = 4, groups = "sanity")	
	public void charger() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("charger");
		driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	
	public void down() {
		driver.close();
	}

}
