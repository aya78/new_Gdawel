package purchase_invoice;

import AddProductIntoStore.product_page;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class validScenario1 {
//    /**
//     * wait until expected element is visible
//     *
//     * @param   expectedElement     element to be expected
//     * @param   timeout             Maximum timeout time
//     */
//
//    public  void waitForElement(By expectedElement, long timeout) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, timeout);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(expectedElement));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            //System.out.println("print ur message here");
//        }
//    }
    String random_number = RandomStringUtils.random(2, false, true);
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
//        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_purchase_page() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        purchaseInvoice_page.clickOnPurchase(driver).click();

    }
    @Test(priority = 2)
    public void add_purchase_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnAddInvoice(driver).click();
//      Thread.sleep(2000);
        purchaseInvoice_page.clickOnSupplierDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.selectValueFromDropdown1(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.clickOnStoreDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.selectValueFromDropdown2(driver).click();
        Thread.sleep(1000);
//        purchaseInvoice_page.click_span(driver).click();
//        purchaseInvoice_page.upload_file(driver).sendKeys("/home/hash-pc-8/Downloads/chanel.png");
        purchaseInvoice_page.scan_barcode(driver).sendKeys("1");
        Thread.sleep(1000);
        purchaseInvoice_page.selectProduct(driver).click();
        purchaseInvoice_page.enter_tax(driver).sendKeys(""+random_number);
//        purchaseInvoice_page.enter_product_cost(driver).sendKeys(""+random_number);
        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        //scroll up a page
//        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(1000);

        purchaseInvoice_page.clickAddInvoice(driver).click();
        Thread.sleep(3000);

    }
//    @Test(priority = 3)
//    public void pay_purchase_invoice() {
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//
//        purchaseInvoice_page.clickAddPayment(driver).click();
//        purchaseInvoice_page.clickSaveButton(driver).click();
////        purchaseInvoice_page.clickViewInvoice(driver).click();
//    }
    @Test(priority = 3)
    public void search_about_purchase_invoice() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);

        String s = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[8]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/p[2]")).getText();
        driver.navigate().to("http://10.10.0.50/purchases/");
        Thread.sleep(2000);
        purchaseInvoice_page.searchbar(driver).sendKeys(""+s);
        System.out.println(s);
        Thread.sleep(1000);

        purchaseInvoice_page.click_action_dropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.click_show_payment(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.close_show_payment(driver).click();
    }
}
