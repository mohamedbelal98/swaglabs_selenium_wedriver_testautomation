package dropDownMenu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.*;

public class TestDropDownMenu extends BaseTest {

    @Test
    public void testDropDown() {

        loginPage.setUserNameInput("standard_user");
        loginPage.setPasswordInput("secret_sauce");

        HomePage homePage = loginPage.clickLoginButton();
        assertEquals(homePage.getProductTextName(), "PRODUCTS", "Home Page not exist");

        var selectedOption = homePage.getSelectionOptions();
        System.out.println(selectedOption);

        String option = selectedOption.get(2);
        System.out.println(option);

        homePage.selectFromDropDown(option);
        assertEquals(homePage.getProductNameUsingInFilter(),"Sauce Labs Onesie","Error In DropDown Filter");

    }
}
