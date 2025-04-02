package ebay.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class main {
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test(priority = 1)
	public void RegisterValid() {
		WebElement click =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		click.click();
		WebElement open = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		open.click();
		
		WebElement first = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		first.sendKeys("Vikash");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		Lastname.sendKeys("Kumar Bharti");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
		Email.sendKeys("vikashkumarbharti035@gmail.com");
		
		WebElement Number = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		Number.sendKeys("6201530961");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));
		Password.sendKeys("Vikash123");
		
		WebElement ComformPassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
		ComformPassword.sendKeys("Vikash123");
		
		WebElement checkout = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		checkout.click();
		
		WebElement redio = driver.findElement(By.xpath("//input[@name='agree']"));
		redio.click();
		
		WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
		submit.click();
		
		System.out.println("Register Successful");
		
	}
	@Test(priority = 2)
	public void RegisterInvalid() {
		WebElement click =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		click.click();
		WebElement open = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		open.click();
		
		WebElement first = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		first.sendKeys("Vikvhgfgxdgrfash");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		Lastname.sendKeys("Kumagfchj                      r Bharti");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
		Email.sendKeys("vi6465224e5768809arti035@gmail.com");
		
		WebElement Number = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		Number.sendKeys("62961");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));
		Password.sendKeys("Vikash1#5tt7890-3");
		
		WebElement ComformPassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
		ComformPassword.sendKeys("Vikash123");
		
		WebElement checkout = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		checkout.click();
		
		WebElement redio = driver.findElement(By.xpath("//input[@name='agree']"));
		redio.click();
		
		WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
		submit.click();
		
		System.out.println("Register shoul not Successful");
		
	}
	
	@Test(priority = 3)
	public void Login() {
		WebElement click =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		click.click();
		
		WebElement login = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
		login.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
		Email.sendKeys("vikashkumarbharti035@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys("6201530961");
		
		WebElement log = driver.findElement(By.xpath("//input[@value='Login']"));
		log.click();
		

		
		
	}
	@Test(priority = 4)
	public void LoginInvalid() {
		WebElement click =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
		click.click();
		
		WebElement login = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
		login.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
		Email.sendKeys("vikas035@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys("60961");
		
		WebElement log = driver.findElement(By.xpath("//input[@value='Login']"));
		log.click();
		

		
		
	}
	@Test(priority = 5)
	public void search() {
		
		WebElement se = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		se.click();
		
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		mobile.sendKeys("Mobile");
		
		WebElement sear = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		sear.click();
		
		WebElement check = driver.findElement(By.xpath("//input[@id='description']"));
		check.click();
		
		WebElement search1 = driver.findElement(By.xpath("//input[@id='button-search']"));
		search1.click();
		
		WebElement choose = driver.findElement(By.xpath("//img[@title='HTC Touch HD']"));
		choose.click();

		
		WebElement click1 = driver.findElement(By.xpath("//button[@id='button-cart']"));
		click1.click();
		

	}
	
	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.close();
	}

}
