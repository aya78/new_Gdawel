package GdawelScenarioes;

import AddProductIntoStore.InValidTest1;
import Pages.*;
import com.github.javafaker.Faker;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.cache.annotation.Caching;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Gdawel_full_cycle{
    public String random_string = RandomStringUtils.random(6, true, false);
    InValidTest1 a = new InValidTest1();
    public String barcode= String.valueOf(40658961);
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
    @Test
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://gdawel.app/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("test@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"Valid_login"})
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
//        barcode = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/p")).getText();
//        System.out.println(barcode);
        Thread.sleep(1000);

    }
    @Test( dependsOnMethods={"open_products_page"})
    @Caching
    public void openTransferPage() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("#transfer-list-menu > a")));
// click on the compose button as soon as the "compose" button is visible
//        driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
        product_page.open_transfers(driver).click();

        product_page.add_transfer(driver).click();
        boolean m=ElementClickInterceptedException.DRIVER_INFO.isBlank();
        new AssertionError(m);
        product_page.click_from_warehouse(driver).click();
        product_page.select_warehouse1(driver).click();
        Thread.sleep(1000);
        product_page.click_to_warehouse(driver).click();
        Thread.sleep(1000);

        product_page.select_warehouse2(driver);
        Thread.sleep(1000);

        product_page.click_barcode_search(driver).sendKeys(""+barcode);
        Thread.sleep(1000);
        product_page.save_transfer(driver).click();
        product_page.open_exist_transfer(driver).click();
    }

    @Test(dependsOnMethods={"openTransferPage"})
    public void open_purchase_page() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.clickOnPurchases(driver).click();

    }
    @Test(dependsOnMethods={"open_purchase_page"})
    public void add_purchase_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        product_page object =new product_page();
        Faker fakeData=new Faker();
        object.setBarcode(fakeData.number().digits(3));
        purchaseInvoice_page.clickOnAddInvoice(driver).click();
//        purchaseInvoice_page.clickOnSupplierDropdown(driver).click();
//        purchaseInvoice_page.select_supplier(driver);
        purchaseInvoice_page.scan_barcode(driver).sendKeys(""+barcode);
        Thread.sleep(1000);

//      purchaseInvoice_page.selectProduct(driver).sendKeys(s);
//        purchaseInvoice_page.enter_quantity(driver).click();
//        purchaseInvoice_page.enter_quantity(driver).sendKeys(Keys.BACK_SPACE);
//        purchaseInvoice_page.enter_quantity(driver).sendKeys(""+50);
       // purchaseInvoice_page.enter_tax(driver).sendKeys(object.getProduct_cost());
//        purchaseInvoice_page.enter_product_cost(driver).sendKeys(""+random_number);
//        Actions a = new Actions(driver);
//        //scroll down a page
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        //scroll up a page
//        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(1000);
        purchaseInvoice_page.clickAddInvoice(driver).click();
        Thread.sleep(3000);
        currentUrl =driver.getCurrentUrl();
    }

    @Test(dependsOnMethods={"add_purchase_page"},description = "add payment (full required amount)")
    public void pay_purchase_invoice() {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        purchaseInvoice_page.clickAddPayment(driver).click();
        purchaseInvoice_page.clickSaveButton(driver).click();
//        purchaseInvoice_page.clickViewInvoice(driver).click();
    }
    @Story("Gadawel Basic sales search")@TmsLink("TC-003")
    @Test(dependsOnMethods={"pay_purchase_invoice"}, description = "after create invoice copy it`s number and open purchases page and paste in search bar " +
            "\nThen the result status will get the sale invoice that matches the num entered in search bar that recently added")
    public void create_return_purchase_invoice() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        purchaseInvoice_page.open_invoice(driver).click();
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
    @Story("Gadawel sales")@TmsLink("TC-001")
    @Test(dependsOnMethods={"create_return_purchase_invoice"})
    public void open_sales_page() {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        sale_page.open_sales(driver).click();
    }
    @Story("add sale invoice ")@TmsLink("TC-002")
    @Test(dependsOnMethods={"open_sales_page"}, description = "add sale invoice with [ reimbursement status : pending, invoice status : complete ] "+
            "Then the result status will add invoice & open it`s details")
    public void add_sale_invoice() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        sale_page.clickOnAddInvoice(driver).click();
        Thread.sleep(1000);
        sale_page.clickOnClientDropdown(driver).click();
        sale_page.selectValueFromDropdown1(driver);
        Thread.sleep(1000);

        sale_page.scan_barcode(driver).sendKeys(""+barcode);
        Thread.sleep(1000);
//        sale_page.selectProduct(driver).click();
        sale_page.enter_Shipping_charges(driver).sendKeys("20");
//        Actions a = new Actions(driver);
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        sale_page.clickAddInvoice(driver).click();
    }

    @Story("add quotation")@TmsLink("TC-001")
    @Test(dependsOnMethods={"add_sale_invoice"}, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen navigate to sales & purchases and open quotations")
    public void add_sale_quotation() throws InterruptedException {
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
