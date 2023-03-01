package cart;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartDetails;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class TestDeleteItemFromCart extends BaseTest {

    @Test
    public void testDeleteItem() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");
        HomePage homePage = loginPage.clickLoginButton();
        CartDetails cartDetails = homePage.clickAddToCartButton().clickInCartIcon();
        cartDetails.clickRemoveButton();
        assertEquals(cartDetails.getContinueShoppingText(), "Continue Shopping", "Error in CartDetails Page");

    }

}
