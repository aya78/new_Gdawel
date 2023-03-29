package AddProductIntoStore;

import com.github.javafaker.Faker;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

/** check on option >> هذا المنتج له سعر مختلف ف المخازن
 * check on option >> يحتوي هذا العنصر علي IMEI **/
/**  طريقه الضرايب ضريبه شامله و الضريبه مضافه* */


public class validTest2 {
    String random_number = RandomStringUtils.random(5, false, true);
    String random_string = RandomStringUtils.random(6, true, false);

    public WebDriver driver;
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
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_products_page() throws InterruptedException {
        product_page.clickOnSideMenu(driver).click();
        product_page.clickOnProducts(driver).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void add_product_page() throws InterruptedException {


        for (int i = 0; i <= 5; i++) {
            Thread.sleep(2000);
            product_page.clickAddProduct(driver).click();
            product_page object =new product_page();
            Faker fakeData=new Faker();
            object.setName(fakeData.name().name());
            object.setBarcode(fakeData.number().digits(8));
            object.setQuantity(fakeData.number().digits(2));
            object.setProduct_cost(fakeData.number().digits(3));
            object.setSelling_price(fakeData.number().digits(3));
            boolean d = fakeData.file().extension().isBlank();

            String m = fakeData.job().position();
            System.out.println(m);
            Thread.sleep(2000);
            product_page.enterProductName(driver).sendKeys(object.getName());
            product_page.click_brand(driver).click();
            product_page.select_brand(driver);
            product_page.select_barcode(driver).sendKeys(object.getBarcode());
            String s = object.getBarcode();
            System.out.println(s);
            Thread.sleep(2000);
            product_page.click_classification(driver).click();
            product_page.select_classification(driver);
//            product_page.select_classification(driver).click();
//            product_page.click_quantity(driver).sendKeys("10");
            product_page.click_product_unit(driver).click();
            product_page.click_product_cost(driver).sendKeys(object.getProduct_cost());
            product_page.click_Product_selling_price(driver).sendKeys(object.getSelling_price());
            // /home/hash-pc-8/Downloads/iphone.jpeg
          product_page.upload_product_img(driver).sendKeys("/home/hash-pc-8/Downloads/iphone.jpeg");
            product_page.click_additional_Tax(driver).click();
            product_page.click_Tax_type(driver).click();
            Thread.sleep(2000);
//            product_page.click_first_checklist(driver).click();
//            Thread.sleep(2000);
//            product_page.set_first_value(driver).sendKeys("200");
//            product_page.set_second_value(driver).sendKeys("600");
//            new WebDriverWait(driver, Duration.ofSeconds(20));
//            product_page.click_product_has_IMEI(driver).click();
            product_page.click_add_product(driver).click();
            Thread.sleep(2000);
        }
    }
//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }

}
