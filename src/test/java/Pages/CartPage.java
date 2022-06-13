package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement quantity;
    WebElement applyCuppon;
    WebElement updateCart;
    WebElement proceedToCheckOut;
    WebElement happyNinja;

    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getQuantity () {
        return driver.findElement(By.name("cart[02e74f10e0327ad868d138f2b4fdd6f0][qty]"));
    }

    public WebElement getUpdateCart() {
        return driver.findElement(By.name("update_cart"));
    }

    public WebElement getHappyNinja() {
        return driver.findElement(By.linkText("Happy Ninja"));
    }

    public WebElement getProceedToCheckOut() {
        return driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward"));
    }



    //-----------------------------

    public void clickOnQuantity () {
        getQuantity().click();

    }

    public void enterQuantity (String x) {
        getQuantity().clear();
        getQuantity().sendKeys(x);
    }

    public void clickOnUpdateCartButton () {
        getUpdateCart().click();
    }

    public void clickOnProceedToCheckoutButton () {
        getProceedToCheckOut().click();
    }


}
