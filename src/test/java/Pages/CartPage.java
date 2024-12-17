package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By cart = By.xpath("//*[@id='header_container']/div[2]/span");
    By item = By.cssSelector("[data-test=inventory-item-name]");
    By removeButton = By.id("[data-test=remove-sauce-labs-backpack]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(cart).getText();
    }

    public String getItem() {
        return driver.findElement(item).getText();
    }

    public void remove() {
        driver.findElement(removeButton).click();
    }
}
