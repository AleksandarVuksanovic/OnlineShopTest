package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Checkout {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement productQuantity;
    WebElement totalAmount;

    public Checkout(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getProductQuantity() {
        return driver.findElement(By.className("product-quantity"));
    }

    public WebElement getTotalAmount() {
        return driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/article/div/div/form[2]/div[2]/table/tbody/tr/td[2]/span"));
    }


    //-----------------------



}
