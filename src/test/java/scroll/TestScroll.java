package scroll;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestScroll extends BaseTest {

    @Test
    public void testScrollHomeToFooter() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        HomePage homePage = loginPage.clickLoginButton();
        homePage.scrollToFooter();
    }
}
