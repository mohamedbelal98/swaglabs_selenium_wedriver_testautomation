package logOut;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestLogOut extends BaseTest {

    @Test
    public void testLogOut() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        HomePage homePage = loginPage.clickLoginButton();
        homePage.clickMenuButtonToLogOut();

    }
}
