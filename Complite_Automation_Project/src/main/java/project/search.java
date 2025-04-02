package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("redmi Note 5 pro cover");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("#container > div > div.nt6sNV.JxFEK3._48O0EI > div.DOjaWF.YJG4Cf > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div > a.VJA3rP > div:nth-child(1) > div > div > img")).click();
		
		driver.get("https://www.flipkart.com/helix-back-cover-mi-redmi-note-5-pro/p/itmfef6sxgsbxpwz?pid=ACCFEF34AWG69WZZ&lid=LSTACCFEF34AWG69WZZHYFJQR&marketplace=FLIPKART");
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
	}

}
