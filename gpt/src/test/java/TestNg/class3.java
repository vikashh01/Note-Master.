package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class class3 {
	public static WebDriver driver;
		
	@BeforeTest
	public void start() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
		
	}
	
	@Test(priority = 1)
	public void Search() {
		  WebElement search = driver.findElement(By.xpath("//input[@role='combobox']"));
		  search.sendKeys("new seng" + Keys.ENTER);
		}
	
	@Test(priority = 2)
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)"); 
	}
	
	@Test(priority = 3)
	public void play() {
	WebElement song = driver.findElement(By.cssSelector("#thumbnail > yt-image > img"));
	song.click();
	}
	
	@Test(priority = 4)
	public void skip() {
		
	}
	
	

	
}
