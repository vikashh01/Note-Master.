package TodayAssi;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept(); 

        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirmation Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss(); 

        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        promptAlert.sendKeys("Selenium Java Test"); 
        promptAlert.accept(); 

        Thread.sleep(2000);
        driver.quit();
    }
}
