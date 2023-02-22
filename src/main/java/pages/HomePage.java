package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    private final WebDriver driver;
    private final By productNameText = By.xpath("//div[@class='header_secondary_container']/child::span");
    private final By product = By.id("item_4_img_link");
    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By addSecondItemToCAart = By.id("add-to-cart-sauce-labs-bike-light");
    private final By cartIcon = By.id("shopping_cart_container");
    private final By numberOfItemInCart = By.xpath("//a[@class='shopping_cart_link']/child::span");
    private final By dropDownMenu = By.className("product_sort_container");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By footerToScroll = By.className("footer_copy");
    private final By productNameTextUsingInFilter = By.xpath("//a[@id='item_2_title_link']/child::div");
    private final By logOutButton = By.xpath("//a[@id='logout_sidebar_link']");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public String getProductTextName() {

        return driver.findElement(productNameText).getText();
    }

    public SingleProduct clickAtLink() {

        driver.findElement(product).click();
        return new SingleProduct(driver);
    }

    public HomePage clickAddToCartButton() {

        driver.findElement(addToCartButton).click();
        return new HomePage(driver);
    }

    public HomePage clickSecondAddToCartButton() {

        driver.findElement(addSecondItemToCAart).click();
        return new HomePage(driver);
    }

    public String getNumberOfItemInCart() {

        return driver.findElement(numberOfItemInCart).getText();
    }

    public CartDetails clickInCartIcon() {

        driver.findElement(cartIcon).click();
        return new CartDetails(driver);
    }

//    public void clickDropDown(){
//
//        driver.findElement(dropDownMenu).click();
//    }

    private Select findDropDownElement() {

        return new Select(driver.findElement(dropDownMenu));
    }

    public List<String> getSelectionOptions() {

        List<WebElement> selectElements = findDropDownElement().getOptions();
        return selectElements.stream().map(WebElement::getText).toList();

    }

    public void selectFromDropDown(String option) {

        findDropDownElement().selectByVisibleText(option);
    }

    public void clickMenuButtonToLogOut() {

//        driver.findElement(menuButton).click();
//        Thread.sleep(250);
//        WebElement logOut = driver.findElement(logOutButton);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(logOut).click().perform();

        driver.findElement(menuButton).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']")));
        driver.findElement(logOutButton).click();
    }

    public void scrollToFooter() {

        WebElement footer = driver.findElement(footerToScroll);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script, footer);
    }

    public String getProductNameUsingInFilter() {

        return driver.findElement(productNameTextUsingInFilter).getText();
    }

}
