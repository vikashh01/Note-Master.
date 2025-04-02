package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-automation-practice.netlify.app/calendar");
        driver.manage().window().maximize();

        // Open the calendar by clicking the input field
        WebElement calendarInput = driver.findElement(By.xpath("//input[@id='calendar']"));
        calendarInput.click();

       driver.findElement(By.xpath("//td[@class='day'][normalize-space()='15']")).click();
        driver.quit();
    }
}
