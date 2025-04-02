package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_and_select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("flipkart");
		WebElement fil = driver.findElement(By.cssSelector("div[id='jZ2SBf'] div:nth-child(1) span:nth-child(1)"));
		fil.click();
		driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(1) > div:nth-child(18) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > h3:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("redmi Note 5 pro cover");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Helix Back Cover for Mi Redmi Note 5 Pro']")).click();
		
		driver.get("https://www.flipkart.com/helix-back-cover-mi-redmi-note-5-pro/p/itmfef6sxgsbxpwz?pid=ACCFEF34AWG69WZZ&lid=LSTACCFEF34AWG69WZZHYFJQR&marketplace=FLIPKART");
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();

		
		
	}

}
