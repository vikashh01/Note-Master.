package masaiofficeAssi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("singleframe"); 
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("Hello iFrame");
        driver.switchTo().defaultContent(); 

        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click(); 
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame); 

        WebElement innerFrame = driver.findElement(By.xpath("//iframe[contains(@src,'SingleFrame.html')]"));
        driver.switchTo().frame(innerFrame);

        WebElement nestedInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        nestedInputBox.sendKeys("Nested iFrame");

        driver.switchTo().defaultContent(); 

    }
}

