package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='cart-items']")
    WebElement cartItems;

    @FindBy(xpath = "//button[text()='Proceed to Checkout']")
    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean validateCartItems() {
        return cartItems.isDisplayed();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}
