package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class SwitchWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        String mainWindow = driver.getWindowHandle();  
        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

     
    }
}
