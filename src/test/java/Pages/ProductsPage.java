package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    By title = By.cssSelector("[data-test=title]");
    By backpackButton = By.cssSelector("[data-test=add-to-cart-sauce-labs-backpack]");
    By bikeButton = By.cssSelector("[data-test=add-to-cart-sauce-labs-bike-light]");
    By tShirtButton = By.cssSelector("[data-test=add-to-cart-sauce-labs-bolt-t-shirt]");
    By fleeceJacketButton = By.cssSelector("[data-test=add-to-cart-sauce-labs-fleece-jacket]");
    By cartButton = By.cssSelector("[data-test=shopping-cart-badge]");
    By backpackCard = By.cssSelector("[data-test=inventory-item-name]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void addBackpack() {
        driver.findElement(backpackButton).click();
    }

    public void addBike() {
        driver.findElement(bikeButton).click();
    }

    public void addTShirt() {
        driver.findElement(tShirtButton).click();
    }

    public void addFleeceJacket() {
        driver.findElement(fleeceJacketButton).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public void openCardBackpack() {
        driver.findElement(backpackCard).click();
    }
}
