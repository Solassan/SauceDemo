package Tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveProductsTest extends BaseTest {

    @Test(testName = "Проверка удаления товара из корзины")
    @Description("Проверка удаления товара из корзины")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("add to cart in saucedemo")
    @Story("Удаление из корзины")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-6")
    public void addRemoveProducts() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addBackpack();
        productsPage.addBike();
        productsPage.addTShirt();
        productsPage.addFleeceJacket();
        productsPage.openCart();
        Assert.assertEquals(
                cartPage.getTitle(),
                "Your Cart",
                "Не удалось перейти в корзину");
        Assert.assertEquals(
                cartPage.getItemBackPack(),
                "Sauce Labs Backpack",
                "Не удалось добавить рюкзак в корзину");
        Assert.assertEquals(
                cartPage.getItemBike(),
                "Sauce Labs Bike Light",
                "Не удалось добавить велосипед в корзину");
        Assert.assertEquals(
                cartPage.getItemTShirt(),
                "Sauce Labs Bolt T-Shirt",
                "Не удалось добавить футболку в корзину");
        Assert.assertEquals(
                cartPage.getItemFleeceJacket(),
                "Sauce Labs Fleece Jacket",
                "Не удалось добавить флисовый свитер в корзину");
        cartPage.getRemoveBackBack();
        cartPage.getRemoveTShirt();
    }
}
