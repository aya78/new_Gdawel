package purchase_and_return_invoice;

import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class validScenario1 {
    String random_number = RandomStringUtils.random(2, false, true);
    String random_barcode = RandomStringUtils.random(8, false, true);
    public String random_string = RandomStringUtils.random(6, true, false);
    public String currentUrl;
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
        driver.get("https://gdawel.app/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
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
        purchaseInvoice_page.clickOnAddInvoice(driver).click();
//      Thread.sleep(2000);
        purchaseInvoice_page.clickOnSupplierDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.selectValueFromDropdown1(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.clickOnStoreDropdown(driver).click();
        Thread.sleep(1000);
        purchaseInvoice_page.selectValueFromDropdown2(driver).click();
//        Thread.sleep(1000);
//        purchaseInvoice_page.click_span(driver).click();
        purchaseInvoice_page.upload_file(driver).sendKeys("/home/hash-pc-8/Downloads/20230109-030024.csv");
//        purchaseInvoice_page.scan_barcode(driver).sendKeys("1");
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
        currentUrl =driver.getCurrentUrl();
    }
//    @Test(priority =3)
//    public void view_purchase_invoice() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        purchaseInvoice_page.open_invoice(driver).click();
//        Thread.sleep(2000);
//        String currentUrl =driver.getCurrentUrl();
//        purchaseInvoice_page.clickMoreButton(driver).click();
//        purchaseInvoice_page.clickViewInvoice(driver).click();
////        driver.navigate().back();
//        Thread.sleep(2000);
////        String d = driver.findElement(By.xpath("//div[@class='text-intial']//p[1]")).getText();
////        System.out.println(d);
////        driver.navigate().to(currentUrl);
////        Thread.sleep(2000);
//    }

//    @Test(priority = 3,description = "add payment (full required amount)")
//    public void pay_purchase_invoice() {
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        purchaseInvoice_page.clickAddPayment(driver).click();
//        purchaseInvoice_page.clickSaveButton(driver).click();
////        purchaseInvoice_page.clickViewInvoice(driver).click();
//    }
//    @Test(priority = 4, description = "after create invoice copy it`s number and open purchases page and paste in search bar ")
//    public void search_about_purchase_invoice() throws InterruptedException {
//
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        Thread.sleep(2000);
//        driver.navigate().to(currentUrl);
////        String s = driver.findElement(By.xpath("//p[text()='رقم الفاتورة']/following-sibling::p")).getText();
//        // String s = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[8]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/p[2]")).getText();
//        String s = driver.findElement(By.xpath("(//p[contains(@class,'mb-0 fs-6')])[3]")).getText();
//        Thread.sleep(1000);
//        System.out.println(s);
//        driver.navigate().to("http://10.10.0.50/purchases");
//        purchaseInvoice_page.searchbar(driver).sendKeys(""+s);
//        Thread.sleep(1000);
//        purchaseInvoice_page.click_action_dropdown(driver).click();
//        Thread.sleep(1000);
//        purchaseInvoice_page.click_show_payment(driver).click();
//        Thread.sleep(1000);
//        purchaseInvoice_page.close_show_payment(driver).click();
//
//    }

}
