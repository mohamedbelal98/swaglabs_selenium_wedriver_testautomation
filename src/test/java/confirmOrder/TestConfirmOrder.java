package confirmOrder;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class TestConfirmOrder extends BaseTest {

    @Test
    public void testConfirmOrder() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");
        HomePage homePage = loginPage.clickLoginButton();
        CartDetails cartDetails = homePage.clickAddToCartButton().clickInCartIcon();
        InformationPage informationPage = cartDetails.clickCheckOutButton();
        informationPage.setFirstNameInput("First Name");
        informationPage.setLastNameInput("Last Name");
        informationPage.setPostalCodeInput("12345678");
        OverViewPage overViewPage = informationPage.clickContinueButton();
        assertEquals(overViewPage.getOverViewText(), "CHECKOUT: OVERVIEW", "Error in overView page");
        CompletePage completePage = overViewPage.clickFinishButton();
        assertEquals(completePage.getThankYouText(), "THANK YOU FOR YOUR ORDER", "Error in complete page");

    }
}
