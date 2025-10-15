package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    private By pageTitle = By.className("title");
    private By addToCartButton = By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        super(driver);

    }

    public String getPageTitle() {

        return getText(pageTitle);
    }
    public InventoryPage clickOnAddToCartButton() {
        click(addToCartButton);
        return this;
    }

    public InventoryPage clickOnCartIcon() {

        click(cartIcon);
        return this;

}
}