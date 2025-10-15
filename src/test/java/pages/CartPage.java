package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");
    private By removeButton = By.cssSelector("button[data-test='remove-sauce-labs-backpack']");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
    public void clickOnContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }
    public void clickOnRemoveButton() {
        driver.findElement(removeButton).click();
    }
}
