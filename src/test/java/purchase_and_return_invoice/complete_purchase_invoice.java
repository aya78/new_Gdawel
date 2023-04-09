package purchase_and_return_invoice;

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
import AddProductIntoStore.InValidTest1;

import java.util.concurrent.TimeUnit;

public class complete_purchase_invoice {
    String random_number = RandomStringUtils.random(2, false, true);
    String random_barcode = RandomStringUtils.random(8, false, true);
    public String random_string = RandomStringUtils.random(6, true, false);
    InValidTest1 a = new InValidTest1();
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
        login_Page.enter_email(driver).sendKeys("ramy@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 74108520);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_products_page() throws InterruptedException {
        product_page.clickOnSideMenu(driver).click();
        product_page.clickOnProducts(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void add_product_page() throws InterruptedException {

        for(int i=0 ; i<= 5 ; i++)
        {

            product_page.clickAddProduct(driver).click();
            product_page object =new product_page();
            Faker fakeData=new Faker();
            object.setName(fakeData.name().name());
            object.setBarcode(fakeData.number().digits(8));
            object.setQuantity(fakeData.number().digits(2));
            object.setProduct_cost(fakeData.number().digits(3));
            object.setSelling_price(fakeData.number().digits(3));

            Thread.sleep(2000);
            product_page.enterProductName(driver).sendKeys(object.getName());
            product_page.click_brand(driver).click();
            product_page.select_brand(driver);
//        product_page.click_barcode_generator(driver).click();

            product_page.select_barcode(driver).sendKeys(object.getBarcode());
            s =object.getBarcode();
            System.out.println(s);
            product_page.click_classification(driver).click();
            product_page.select_classification(driver);
            product_page.click_quantity(driver).sendKeys(object.getQuantity());
            product_page.click_product_unit(driver).click();
            product_page.click_product_cost(driver).sendKeys(object.getProduct_cost());
            Thread.sleep(2000);
            product_page.click_Product_selling_price(driver).sendKeys(object.getSelling_price());
            product_page.click_additional_Tax(driver).click();

            Thread.sleep(2000);
            Actions a = new Actions(driver);
            //scroll down a page
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
            //scroll up a page
            a.sendKeys(Keys.PAGE_UP).build().perform();
            product_page.click_add_product(driver).click();
            Thread.sleep(2000);
            // comment
        }

    }
    @Test(priority = 3)
    public void open_purchase_page() throws InterruptedException {
        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        purchaseInvoice_page.clickOnPurchases(driver).click();

    }
    @Test(priority = 4)
    public void add_purchase_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        product_page object =new product_page();
        Faker fakeData=new Faker();
        object.setBarcode(fakeData.number().digits(3));
        purchaseInvoice_page.clickOnAddInvoice(driver).click();

        purchaseInvoice_page.scan_barcode(driver).sendKeys("1");
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
