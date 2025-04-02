package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(),'Sofas')]")
    WebElement firstResult;

    @FindBy(xpath = "//button[text()='Apply Filter']")
    WebElement applyFilterButton;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void applyFilter() {
        applyFilterButton.click();
    }

    public String getFirstResultText() {
        return firstResult.getText();
    }
}
