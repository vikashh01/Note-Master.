package masaiofficeAssignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAddtoCartTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
				
	
		driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")).click();
		
	
		String Success = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		
		System.out.println(Success);
		
		Thread.sleep(20000);
		driver.close();
		
	}

}
