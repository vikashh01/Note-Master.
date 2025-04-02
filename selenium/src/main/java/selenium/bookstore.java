package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookstore {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://books.toscrape.com/catalogue/category/books/nonfiction_13/index.html");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//strong[normalize-space()='Nonfiction']")).click();

	}

}
