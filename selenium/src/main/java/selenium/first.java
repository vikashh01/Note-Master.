package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// Open the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // ---- Edit Box Operations ----
        WebElement editBox = driver.findElement(By.id("autocomplete"));
        
        // 1. Enter a specific value into the edit box
        editBox.sendKeys("Test Value");
        
        // 2. Clear the text from the edit box
        editBox.clear();
        
        // 3. Retrieve and print the value entered in the edit box
        String enteredText = editBox.getAttribute("value");
        System.out.println("Entered Text in Edit Box: " + enteredText);
        
        // 4. Verify if the edit box is enabled before interacting with it
        if (editBox.isEnabled()) {
            System.out.println("The edit box is enabled.");
        } else {
            System.out.println("The edit box is not enabled.");
        }

        // ---- Button Operations ----
        WebElement button = driver.findElement(By.id("alertbtn"));
        
        // 1. Click the button
        button.click();
        
        // 2. Verify if the button is enabled
        if (button.isEnabled()) {
            System.out.println("The button is enabled.");
        } else {
            System.out.println("The button is not enabled.");
        }
        
        // 3. Retrieve and print the text displayed on the button
        String buttonText = button.getText();
        System.out.println("Button Text: " + buttonText);

        // ---- Checkbox Operations ----
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
        
        // 1. Select multiple checkboxes
        checkbox1.click();
        checkbox2.click();
        
        // 2. Verify if each checkbox is selected
        System.out.println("Checkbox 1 selected: " + checkbox1.isSelected());
        System.out.println("Checkbox 2 selected: " + checkbox2.isSelected());
        
        // 3. Print the state (selected or not) for all checkboxes
        if (!checkbox1.isSelected()) {
            checkbox1.click(); // Ensure it's selected
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click(); // Ensure it's selected
        }

        // ---- Radio Button Operations ----
        WebElement radioButton1 = driver.findElement(By.id("radio1"));
        WebElement radioButton2 = driver.findElement(By.id("radio2"));
        
        // 1. Select a specific radio button
        radioButton1.click();
        
        // 2. Verify if the selected radio button is active
        System.out.println("Radio Button 1 selected: " + radioButton1.isSelected());
        System.out.println("Radio Button 2 selected: " + radioButton2.isSelected());
        
        // 3. Print all available radio button options along with their selection state
        System.out.println("Radio Button 1: " + (radioButton1.isSelected() ? "Selected" : "Not Selected"));
        System.out.println("Radio Button 2: " + (radioButton2.isSelected() ? "Selected" : "Not Selected"));

        // Close the browser
        driver.quit();
    }

		
		

}


