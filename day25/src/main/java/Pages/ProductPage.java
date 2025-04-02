package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[@class='product-title']")
    WebElement productTitle;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }
}

