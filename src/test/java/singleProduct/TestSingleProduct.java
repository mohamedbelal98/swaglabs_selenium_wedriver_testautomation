package singleProduct;

import base.BaseTest;
import org.testng.annotations.Test;

import pages.SingleProduct;

import static org.testng.Assert.assertEquals;

public class TestSingleProduct extends BaseTest {

    @Test
    public void testSingleProduct() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        SingleProduct singleProduct = loginPage.clickLoginButton().clickAtLink();

        System.out.println(singleProduct.getBackYoProductsText());
        assertEquals(singleProduct.getBackYoProductsText(), "Sauce Labs Backpack", "Error in Single product page");

    }

}
