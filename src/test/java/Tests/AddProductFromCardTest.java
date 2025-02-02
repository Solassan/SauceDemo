package Tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductFromCardTest extends BaseTest {

    @Test(testName = "Проверка добавления товара в корзину из карточки товара")
    @Description("Проверка добавления товара в корзину из карточки товара")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("add from card to cart in saucedemo")
    @Story("Добавление в корзину")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-5")
    public void checkAddProductInCartFromCard() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.openCardBackpack();
        backpackCardPage.addBackpackToCart();
        backpackCardPage.openCart();
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
