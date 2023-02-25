package about;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestAbout extends BaseTest {

    @Test
    public void testNavigateToAnotherPage(){

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        HomePage homePage = loginPage.clickLoginButton();
        homePage.clickAboutNavigateToAnotherPage();


    }
}
