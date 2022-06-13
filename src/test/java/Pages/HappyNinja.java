package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HappyNinja {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement addToCart;

    WebElement increaseQuantity;

    WebElement viewCartButton;

    public HappyNinja(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getIncreaseQuantity() {
        return driver.findElement(By.cssSelector(".quantity-button.quantity-up"));
    }

    public WebElement getAddToCart() {
        return driver.findElement(By.name("add-to-cart"));
    }

    public WebElement getViewCartButton() {
        return driver.findElement(By.cssSelector(".button.wc-forward"));
    }

    //---------------------------

    public void clickOnIncreaseQuantity () {
        getIncreaseQuantity().click();
    }

    public void clickOnAddToCart () {
        getAddToCart().click();
    }

    public void clickOnViewCartButton () {
        getViewCartButton().click();
    }


}
