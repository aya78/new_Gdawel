package purchase_and_return_invoice;

import AddProductIntoStore.InValidTest1;
import Pages.product_page;
import Pages.purchaseInvoice_page;
import com.github.javafaker.Faker;
import Pages.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static AddProductIntoStore.validTest1.s;

public class partial_purchase_invoice {
    String random_number = RandomStringUtils.random(2, false, true);
    String random_barcode = RandomStringUtils.random(8, false, true);
    public String random_string = RandomStringUtils.random(6, true, false);
    InValidTest1 a = new InValidTest1();
    public String currentUrl;
    public static WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //        driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://gdawel.app/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_purchase_page() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        purchaseInvoice_page.clickOnPurchases(driver).click();

    }
    @Test(priority = 2)
    public void add_purchase_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        product_page object =new product_page();
        Faker fakeData=new Faker();
        object.setBarcode(fakeData.number().digits(3));
        purchaseInvoice_page.clickOnAddInvoice(driver).click();
//      Thread.sleep(2000);
        purchaseInvoice_page.clickOnSupplierDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.select_supplier(driver);
        Thread.sleep(1000);
        purchaseInvoice_page.clickOnStoreDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.select_store(driver);
//        Thread.sleep(1000);
//        purchaseInvoice_page.click_span(driver).click();
        purchaseInvoice_page.upload_file(driver).sendKeys("/home/hash-pc-8/Downloads/20230109-030024.csv");
//        purchaseInvoice_page.scan_barcode(driver).sendKeys("1");
        Thread.sleep(1000);

        purchaseInvoice_page.selectProduct(driver).sendKeys(s);
        purchaseInvoice_page.open_invoice_status(driver).click();
        purchaseInvoice_page.select_invoice_status(driver).click();
        purchaseInvoice_page.enter_tax(driver).sendKeys(object.getProduct_cost());
//        purchaseInvoice_page.enter_product_cost(driver).sendKeys(""+random_number);
        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        //scroll up a page
//        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(1000);
        purchaseInvoice_page.clickAddInvoice(driver).click();
        Thread.sleep(3000);
        currentUrl =driver.getCurrentUrl();
    }
}
