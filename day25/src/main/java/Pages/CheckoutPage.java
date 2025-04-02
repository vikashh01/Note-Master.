package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "name")
    WebElement nameField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "phone")
    WebElement phoneField;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(String name, String address, String phone) {
        nameField.sendKeys(name);
        addressField.sendKeys(address);
        phoneField.sendKeys(phone);
    }

    public void placeOrder() {
        placeOrderButton.click();
    }
}
