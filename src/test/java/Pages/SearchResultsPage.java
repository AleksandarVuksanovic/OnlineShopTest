package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement happyNinja;

    public SearchResultsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHappyNinja() {
        return driver.findElement(By.xpath("//*[@id=\"post-27\"]/header/h2/a"));
    }

    //---------------------

    public void clickOnHappyNinja () {
        getHappyNinja().click();
    }
}
