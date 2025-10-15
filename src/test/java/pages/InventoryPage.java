package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;
    private By pageTitle = By.className("title");
    private By addToCartButton = By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }
    public void clickOnAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickOnCartIcon() {
        driver.findElement(cartIcon).click();
    }

}
