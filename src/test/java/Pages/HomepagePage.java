package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement search;

    WebElement searchButton;

    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSearch() {
        return driver.findElement(By.className("search-field"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.className("ellie-icon-search"));
    }

    //-------------------------

    public void enterTextIntoSearchBox (String text) {
        getSearch().sendKeys(text);

    }

    public void clickOnSearchButton () {
        getSearchButton().click();
    }


}
