package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class TestLogin extends BaseTest {

    @Test
    public void testLogin() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        HomePage homePage = loginPage.clickLoginButton();
        assertEquals(homePage.getProductTextName(), "Products", "Home Page not exist");

    }

}
