package sale_invoice;

import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import purchase_invoice.purchaseInvoice_page;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class return_sale {
    //    String random_number = RandomStringUtils.random(2, false, true);
//    String random_barcode = RandomStringUtils.random(8, false, true);
    public String random_string = RandomStringUtils.random(6, true, false);
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Story("Gadawel Basic Login")@TmsLink("TC-000")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen the result status will open the website")
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Story("Gadawel sales")@TmsLink("TC-001")
    @Test(priority = 1)
    public void open_sales_page() {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        sale_page.open_sales(driver).click();
    }
//    @Story("add sale invoice ")@TmsLink("TC-002")
//    @Test(priority = 2, description = "add sale invoice with [ reimbursement status : pending, invoice status : complete ] "+
//            "Then the result status will add invoice & open it`s details")
//    public void add_sale_invoice() throws InterruptedException {
//        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        sale_page.clickOnAddInvoice(driver).click();
//        Thread.sleep(1000);
//        sale_page.clickOnClientDropdown(driver).click();
//        sale_page.selectValueFromDropdown1(driver).click();
//        Thread.sleep(1000);
//        sale_page.clickOnStoreDropdown(driver).click();
//        sale_page.selectValueFromDropdown2(driver).click();
//        Thread.sleep(1000);
//        sale_page.click_bill_collector(driver).click();
//        sale_page.selectValueFromDropdown3(driver).click();
//        Thread.sleep(1000);
//        sale_page.scan_barcode(driver).sendKeys(""+1);
//        Thread.sleep(1000);
//        sale_page.selectProduct(driver).click();
//        sale_page.enter_Shipping_charges(driver).sendKeys("20");
//        Actions a = new Actions(driver);
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
//        Thread.sleep(1000);
//        sale_page.clickAddInvoice(driver).click();
//    }
    @Story("Gadawel Basic sales search")@TmsLink("TC-003")
    @Test(priority = 2, description = "after create invoice copy it`s number and open purchases page and paste in search bar " +
            "\nThen the result status will get the sale invoice that matches the num entered in search bar that recently added")
    public void create_return_sale_invoice() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        sale_page.open_invoice(driver).click();
        Thread.sleep(1000);
        sale_page.clickMoreButton(driver).click();
        sale_page.click_return_sale(driver).click();
        sale_page.select_products(driver).click();
        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        sale_page.click_save_return_sale(driver).click();
    }
}
