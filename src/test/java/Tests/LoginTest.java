package Tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(testName = "Проверка авторизации")
    @Description("Проверка авторизации")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("Login in saucedemo")
    @Story("Авторизация")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-7")
    public void checkLoginPositive() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        softAssert.assertEquals(productsPage.getTitle(),
                "Products",
                "Логин не выполнен");
    }

    @Test(testName = "Проверка авторизации без заполнения всех полей")
    @Description("Проверка авторизации без заполнения всех полей")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("Login in saucedemo")
    @Story("Авторизация")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-8")
    public void checkLoginWithEmptyFields() {
        loginPage.open();
        loginPage.login("", "");
        softAssert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение об ошибке не появилось");
    }

    @Test(testName = "Проверка авторизации без заполнения пароля")
    @Description("Проверка авторизации без заполнения пароля")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("Login in saucedemo")
    @Story("Авторизация")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-9")
    public void checkLoginWithEmptyPassword() {
        loginPage.open();
        loginPage.login("standard_user", "");
        softAssert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Password is required",
                "Сообщение об ошибке не появилось");
    }

    @Test(testName = "Проверка авторизации без заполнения имени")
    @Description("Проверка авторизации без заполнения имени")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Saucedemo-1.0")
    @Feature("Login in saucedemo")
    @Story("Авторизация")
    @TmsLink("www.jira.com/ITM-3")
    @Issue("www.jira.com/ITM-10")
    public void checkLoginWithEmptyUserName() {
        loginPage.open();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(
                loginPage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение об ошибке не появилось");
    }
}
