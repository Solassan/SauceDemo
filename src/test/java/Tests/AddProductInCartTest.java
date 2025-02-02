package Tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductInCartTest extends BaseTest {

    @Test(testName = "Проверка добавления товара в корзину с главной страницы")
    @Description("Проверка добавления товара в корзину с главной страницы")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("add to cart in saucedemo")
    @Story("Добавление в корзину")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-4")
    public void checkAddProductInCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addBackpack();
        productsPage.openCart();
        Assert.assertEquals(
                cartPage.getTitle(),
                "Your Cart",
                "Не удалось перейти в корзину");
        Assert.assertEquals(
                cartPage.getItemBackPack(),
                "Sauce Labs Backpack",
                "Не удалось добавить рюкзак в корзину");
    }
}
