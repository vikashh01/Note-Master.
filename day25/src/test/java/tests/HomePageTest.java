package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.SearchResultsPage;

public class HomePageTest {
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.urbanladder.com");

        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void testSearchFunctionality() {
        homePage.searchProduct("fan");
        String resultText = searchResultsPage.getFirstResultText();
        Assert.assertTrue(resultText.contains("fan"), "Search result does not match!");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
