package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{

    private By checkoutButton = By.id("checkout");
    private By continueShoppingButton = By.id("continue-shopping");
    private By removeButton = By.cssSelector("button[data-test='remove-sauce-labs-backpack']");
    private final By cartItems = By.className("cart_item");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public CheckoutPage clickOnCheckoutButton() {
        click(checkoutButton);
        return new CheckoutPage(driver);
    }

    public InventoryPage clickOnContinueShoppingButton() {
        click(continueShoppingButton);
        return new InventoryPage(driver);
    }

    public CartPage clickOnRemoveButton() {
        click(removeButton);
        return this;
    }

    public boolean isCartEmpty() {
        return driver.findElements(cartItems).isEmpty();
    }
}


