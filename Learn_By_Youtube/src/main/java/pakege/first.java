package pakege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-automation-practice.netlify.app/calendar");
       
        driver.manage().window().maximize();
    }