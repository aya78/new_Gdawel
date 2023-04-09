package GdawelScenarioes;

import AddProductIntoStore.InValidTest1;
import Pages.login_Page;
import Pages.product_page;
import Pages.purchaseInvoice_page;
import Pages.quotations_page;
import com.github.javafaker.Faker;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.springframework.cache.annotation.Caching;
import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class full_cycle {
    public String random_string = RandomStringUtils.random(6, true, false);
    InValidTest1 a = new InValidTest1();
    String barcode;
    public String s;
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
        login_Page.enter_email(driver).sendKeys("test@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_products_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        product_page.clickOnSideMenu(driver).click();

        product_page.clickOnProducts(driver).click();
        product_page.click_action_button(driver).click();
        product_page.view_product(driver).click();
        driver.navigate().back();
        product_page.click_action_button(driver).click();
        product_page.open_product_reports(driver).click();
        driver.navigate().back();
        product_page.export_pdf(driver).click();
        product_page.export_excel(driver).click();
        product_page.clickOnProductName(driver).click();
        barcode = driver.findElement(By.xpath("(//tr[@role='row']//td)[3]")).getText();
        Thread.sleep(1000);

    }
    @Test(priority = 2)
    @Caching
    public void openTransferPage() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        product_page.open_transfers(driver).click();

        product_page.add_transfer(driver).click();
        product_page.click_from_warehouse(driver).click();
        product_page.select_warehouse1(driver).click();
        Thread.sleep(1000);
        product_page.click_to_warehouse(driver).click();
        product_page.select_warehouse2(driver);

        product_page.click_barcode_search(driver).sendKeys(barcode);
        product_page.save_transfer(driver).click();
        product_page.open_exist_transfer(driver).click();
    }

    @Test(priority = 3)
    public void open_purchase_page() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.clickOnPurchases(driver).click();

    }
    @Test(priority = 4)
    public void add_purchase_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        product_page object =new product_page();
        Faker fakeData=new Faker();
        object.setBarcode(fakeData.number().digits(3));
        purchaseInvoice_page.clickOnAddInvoice(driver).click();

        purchaseInvoice_page.scan_barcode(driver).sendKeys(""+barcode);
        Thread.sleep(1000);

        purchaseInvoice_page.selectProduct(driver).sendKeys(s);
        purchaseInvoice_page.enter_quantity(driver).sendKeys(""+50);
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

    @Test(priority = 5,description = "add payment (full required amount)")
    public void pay_purchase_invoice() {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        purchaseInvoice_page.clickAddPayment(driver).click();
        purchaseInvoice_page.clickSaveButton(driver).click();
//        purchaseInvoice_page.clickViewInvoice(driver).click();
    }
    @Story("Gadawel Basic sales search")@TmsLink("TC-003")
    @Test(priority = 6, description = "after create invoice copy it`s number and open purchases page and paste in search bar " +
            "\nThen the result status will get the sale invoice that matches the num entered in search bar that recently added")
    public void create_return_purchase_invoice() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.open_invoice(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.clickMoreButton(driver).click();
        purchaseInvoice_page.click_return_purchase(driver).click();
        purchaseInvoice_page.select_products(driver).click();
        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        purchaseInvoice_page.click_save_return_purchase(driver).click();
    }

    @Story("add quotation")@TmsLink("TC-001")
    @Test(priority = 7, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen navigate to sales & purchases and open quotations")
    public void add_quotation() throws InterruptedException {
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);

        quotations_page.open_quotations(driver).click();
        Thread.sleep(1000);

        quotations_page.add_quotation(driver).click();
        Thread.sleep(1000);
        quotations_page.click_dropdown_of_client(driver).click();
        Thread.sleep(500);
        quotations_page.select_client(driver).click();
        Thread.sleep(2000);
        quotations_page.scan_barcode(driver).sendKeys(""+barcode);
        Thread.sleep(2000);

        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();

        quotations_page.create_quotation(driver).click();

    }

}
