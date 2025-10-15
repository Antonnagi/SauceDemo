package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By cancelButton = By.id("cancel");
    private By finishButton = By.id("finish");
    private By successMessage = By.className("complete-header");
    private By backHomeButton = By.id("back-to-products");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void cancel(){
        driver.findElement(cancelButton).click();
    }
    public void fillInfo(String firstName, String lastName, String postalCode){
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);

    }
    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void clickOnFinishButton(){
        driver.findElement(finishButton).click();
    }
    public  void clickOnCancelButton(){
        driver.findElement(cancelButton).click();
    }
    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
    public void clickOnBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }

}
