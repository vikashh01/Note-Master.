package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		
		WebElement fname =  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Vikash Kumar");
		
		WebElement lname =  driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("Bharti");
		
		WebElement address =  driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		address.sendKeys("Patna (Bihar)");
		
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("vikashkumarbharti035@gmail.com");
		
		WebElement num = driver.findElement(By.xpath("//input[@type='tel']"));
		num.sendKeys("6201530961");
		
		WebElement gen = driver.findElement(By.xpath("//input[@value='Male']"));
		gen.click();
		
		WebElement hob = driver.findElement(By.id("checkbox1"));
		hob.click();
		

		WebElement languageDropdown = driver.findElement(By.id("msdd"));
        languageDropdown.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement english = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
        WebElement hindi = driver.findElement(By.xpath("//a[contains(text(),'Hindi')]"));

        js.executeScript("arguments[0].click();", english);
        js.executeScript("arguments[0].click();", hindi);
        
      
		
		WebElement down = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(down);
		select.selectByValue("Android");   
		Thread.sleep(2000);
		
	
		
		
		WebElement down1 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select select1 = new Select(down1);
		select1.selectByValue("2005");   
		
		WebElement down2 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select2 = new Select(down2);
		select2.selectByValue("April");
		
		WebElement down3 = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select select3 = new Select(down3);
		select3.selectByValue("12");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("156465321351");
		
		WebElement cmp = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cmp.sendKeys("156465321351");
		
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\AKASH KUMAR BHARTI\\Downloads\\VikashKumarBharti Resume.pdf");
        
        Thread.sleep(2000);
		
		
		
		WebElement sub = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		sub.click();
		System.out.println("Form submitted successfully!");
		
		
		

		
		
	}

	
    
}