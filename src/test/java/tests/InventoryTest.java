package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryTest extends BaseTest {

    @Test
    public void testAddToCart() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");


        InventoryPage inventoryPage  = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage .getPageTitle(), "Products", "Page title does not match");
        inventoryPage .clickOnAddToCartButton();
        inventoryPage .clickOnCartIcon();
        String curentUrl = driver.getCurrentUrl();
        Assert.assertTrue(curentUrl.contains("cart.html"),
                "Cart page not opened!");

    }
}
