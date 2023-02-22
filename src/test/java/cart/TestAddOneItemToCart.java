package cart;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class TestAddOneItemToCart extends BaseTest {

    @Test
    public void testAddToCart() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");
        HomePage homePage = loginPage.clickLoginButton();
        homePage.clickAddToCartButton();
        assertEquals(homePage.getNumberOfItemInCart(), "1", "Error");

    }
}
