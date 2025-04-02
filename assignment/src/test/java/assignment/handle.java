package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle {
	
	public  static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.example.com");
		
		driver.quit();
		
		}
	
}
