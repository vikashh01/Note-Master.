package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {
    public static void main(String[] args) {
        String browser = "chrome"; 
        WebDriver driver;

        switch (browser.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.get("https://www.google.com");
        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
