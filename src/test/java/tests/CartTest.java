package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTest extends BaseTest{

    CheckoutPage checkoutPage = new CheckoutPage(driver);
    @Test
	public void removeCart() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
        cartPage.clickOnRemoveButton();
        Thread.sleep(2000);

    }
    @Test
    public void backToProduct() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
        cartPage.clickOnContinueShoppingButton();
        Thread.sleep(2000);

    }
    @Test
    public void CheckoutCart() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345");
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnFinishButton();
        String success = checkoutPage.getSuccessMessage();
        Assert.assertTrue(success.contains("Thank you for your order!"),
                "Order completion message not found!");
           checkoutPage.clickOnBackHomeButton();
        Thread.sleep(2000);
    }

    @Test
    public void removeSecondCart() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345");
        checkoutPage.cancel();
        Thread.sleep(2000);
    }
    @Test
    public void cancelPurchares() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345");
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnCancelButton();
        Thread.sleep(2000);
    }
}
