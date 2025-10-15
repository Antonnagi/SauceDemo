package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By cancelButton = By.id("cancel");
    private By finishButton = By.id("finish");
    private By successMessage = By.className("complete-header");
    private By backHomeButton = By.id("back-to-products");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public CheckoutPage cancel(){
        click(cancelButton);
        return this;
    }
    public CheckoutPage fillInfo(String firstName, String lastName, String postalCode){
     type( firstNameField,firstName);
     type( lastNameField,lastName);
     type(postalCodeField,postalCode);
        return  this;
    }

    public CheckoutPage clickOnContinueButton(){
        click(continueButton);
        return this;
    }
    public CheckoutPage clickOnFinishButton(){

        click(finishButton);
        return  this;
    }
    public  CheckoutPage clickOnCancelButton(){
        click(cancelButton);
        return  this;
    }
    public String getSuccessMessage(){
        return getText(successMessage);
    }
    public CheckoutPage clickOnBackHomeButton(){
        click(backHomeButton);
        return   this;
    }

}
