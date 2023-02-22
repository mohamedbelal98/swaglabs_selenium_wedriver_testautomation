package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleProduct {

    private final WebDriver driver;
    private final By backTpProductsText = By.xpath("//div[@class='inventory_details_desc_container']/child::div[1]");
    private final By ProductTextName = By.xpath("//a[@id='item_4_title_link']/child::div");

    public SingleProduct(WebDriver driver) {
        this.driver = driver;
    }

    public String getBackYoProductsText() {

        return driver.findElement(backTpProductsText).getText();
    }

    public String getProductTextName() {

        return driver.findElement(ProductTextName).getText();
    }

}
