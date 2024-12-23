package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By cart = By.xpath("//span[text()='Your Cart']");
    By itemBackPack = By.xpath("//div[text()='Sauce Labs Backpack']");
    By removeBackPack = By.cssSelector("[data-test=remove-sauce-labs-backpack]");
    By itemTShirt = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    By removeTShirt = By.cssSelector("[data-test=remove-sauce-labs-bolt-t-shirt]");
    By itemBike = By.xpath("//div[text()='Sauce Labs Bike Light']");
    By itemFleeceJacket = By.xpath("//div[text()='Sauce Labs Fleece Jacket']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(cart).getText();
    }

    public String getItemBackPack() {
        return driver.findElement(itemBackPack).getText();
    }

    public void getRemoveBackBack() {
        driver.findElement(removeBackPack).click();
    }

    public String getItemTShirt() {
        return driver.findElement(itemTShirt).getText();
    }

    public void getRemoveTShirt() {
        driver.findElement(removeTShirt).click();
    }

    public String getItemBike() {
        return driver.findElement(itemBike).getText();
    }

    public String getItemFleeceJacket() {
        return driver.findElement(itemFleeceJacket).getText();
    }
}
