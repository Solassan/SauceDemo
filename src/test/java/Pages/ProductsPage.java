package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    By title = By.cssSelector("[data-test=title]");
    By backpackButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.cssSelector("[data-test=shopping-cart-badge]");
    By backpackCard = By.id("item_4_title_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void addBackpack() {
        driver.findElement(backpackButton).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public void openCardBackpack() {
        driver.findElement(backpackCard).click();
    }
}
