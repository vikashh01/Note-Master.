package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkout {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement check1 = driver.findElement(By.xpath("(//input[@value='radio3'])[1]"));
		check1.click();
		WebElement check = driver.findElement(By.xpath("(//input[@id='checkBoxOption2'])[1]"));
		check.click();
		WebElement down = driver.findElement(By.name("dropdown-class-example"));
		Select select = new Select(down);
		select.selectByValue("option2");   
		Thread.sleep(2000);
		WebElement Radio = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		Radio.sendKeys("India");
		

		
	}

}
