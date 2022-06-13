package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public ExcelReader excelReader;
    public String homepageURL;
    public HomepagePage homepagePage;
    public SearchResultsPage searchResultsPage;
    public HappyNinja happyNinja;
    public CartPage cartPage;
    public Checkout checkout;


    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\aleksandar.vuksanovi\\OneDrive - Smart kolektiv\\Documents\\Aleksandar\\Aleksandar\\IT Bootcamp\\Kurs\\Selenium\\Test Data.xlsx");
        homepageURL = excelReader.getStringData("URLs", 3, 0);
        homepagePage = new HomepagePage(driver, wdwait);
        searchResultsPage = new SearchResultsPage(driver, wdwait);
        happyNinja = new HappyNinja(driver, wdwait);
        cartPage = new CartPage(driver, wdwait);
        checkout = new Checkout(driver, wdwait);

    }

    public void scrollIntoView (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void visibilityWait (WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    @AfterClass
    public void tearDown () {
        //driver.close();
        //driver.quit();
    }



}
