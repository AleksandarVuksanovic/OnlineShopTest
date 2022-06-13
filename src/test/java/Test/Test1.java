package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

    @BeforeMethod
    public void pageSetUp () {
        driver.manage().window().maximize();
        driver.navigate().to(homepageURL);

    }

    @Test
    public void happyNinja () throws InterruptedException {
       homepagePage.enterTextIntoSearchBox("happy ninja");
        homepagePage.clickOnSearchButton();
        searchResultsPage.clickOnHappyNinja();
        happyNinja.clickOnIncreaseQuantity();
        happyNinja.clickOnAddToCart();
        happyNinja.clickOnViewCartButton();
        cartPage.clickOnQuantity();
        cartPage.enterQuantity("1");
        cartPage.clickOnUpdateCartButton();

        Thread.sleep(2000);
        Assert.assertTrue(cartPage.getHappyNinja().isDisplayed());

        cartPage.clickOnProceedToCheckoutButton();

        Assert.assertEquals(checkout.getProductQuantity().getText(), "× 1");
        Assert.assertEquals(checkout.getTotalAmount().getText(), "$35.00");

    }


    @AfterMethod
    public void deleteAllCookies () {
        driver.manage().deleteAllCookies();
    }
}
