package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTest extends BaseTest{
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @BeforeMethod
    public void pageSetup() {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);

        // Login once before each test
        loginPage.login("standard_user", "secret_sauce");
    }

    private void addItemToCart() {
        inventoryPage.clickOnAddToCartButton();
        inventoryPage.clickOnCartIcon();
    }

    @Test
	public void removeCart()  {
        addItemToCart();
        cartPage.clickOnRemoveButton();


    }
    @Test
    public void backToProduct() {
        addItemToCart();
        cartPage.clickOnContinueShoppingButton();

    }
    @Test
    public void checkoutCart()  {
        addItemToCart();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345").
                clickOnContinueButton().
                clickOnFinishButton();
        String success = checkoutPage.getSuccessMessage();
        Assert.assertTrue(success.contains("Thank you for your order!"),
                "Order completion message not found!");
           checkoutPage.clickOnBackHomeButton();
    }

    @Test
    public void removeSecondCart() {
        addItemToCart();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345").cancel();

    }
    @Test
    public void cancelPurchares()  {
        addItemToCart();
        cartPage.clickOnCheckoutButton();
        checkoutPage.fillInfo("John","Doe","12345")
                .clickOnContinueButton()
                .clickOnCancelButton();

    }
}
