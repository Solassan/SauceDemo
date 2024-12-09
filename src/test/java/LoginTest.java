import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void LoginTestPositive() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean elementOnPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        softAssert.assertTrue(elementOnPage);
    }

    @Test
    public void LoginTestNegative1() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("login-button")).click();
        String errorMessage = driver.findElement(By.cssSelector(".error-button")).getText();
        softAssert.assertEquals(errorMessage, "Epic sadface: Username is required");
    }

    @Test
    public void LoginTestNegative2() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("login-button")).click();
        String errorMessage = driver.findElement(By.cssSelector(".error-button")).getText();
        softAssert.assertEquals(errorMessage, "Epic sadface: Password is required");
    }

    @Test
    public void LoginTestNegative3() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String errorMessage = driver.findElement(By.cssSelector(".error-button")).getText();
        softAssert.assertEquals(errorMessage, "Epic sadface: Username is required");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        softAssert.assertAll();
    }
}
