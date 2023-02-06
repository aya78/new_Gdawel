package purchase_invoice;

import AddProductIntoStore.product_page;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validScenario1 {
    String random_number = RandomStringUtils.random(5, false, true);
    String random_barcode = RandomStringUtils.random(8, false, true);
    public String random_string = RandomStringUtils.random(6, true, false);
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_purchase_page() throws InterruptedException {
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);

        purchaseInvoice_page.clickOnPurchase(driver).click();
        purchaseInvoice_page.clickOnAddInvoice(driver);
        Thread.sleep(2000);
    }
}
