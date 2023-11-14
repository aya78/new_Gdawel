package AddProductIntoStore;

import Pages.product_page;
import Pages.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InValidTest1 {
    String random_number = RandomStringUtils.random(5, false, true);
    String random_string = RandomStringUtils.random(6, true, false);
    String random_barcode = RandomStringUtils.random(8, false, true);


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
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
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
     /**1- Enter empty name
      * 2- Type 8 digits in barcode with barcode sign (EAN-8)  OR Type string in barcode
      * 3- Enter empty product_cost & Product_selling_price                                                 **/
        product_page.clickAddProduct(driver).click();
        Thread.sleep(2000);
        product_page.enterProductName(driver).sendKeys("");
        product_page.select_brand(driver).click();
        product_page.select_barcode_sign(driver).click();
//        product_page.select_barcode(driver).sendKeys(""+random_barcode);
        product_page.select_barcode(driver).sendKeys(""+random_string);
        Thread.sleep(2000);
        product_page.click_classification(driver).click();
        product_page.click_quantity(driver).sendKeys("");
        product_page.click_product_unit(driver).click();
        product_page.click_product_cost(driver).sendKeys("");
        product_page.click_Product_selling_price(driver).sendKeys("");
        product_page.click_additional_Tax(driver).click();

//        product_page.upload_product_img(driver).sendKeys("/home/hash-pc-8/Downloads/iphone.jpeg");
        product_page.click_add_product(driver).click();
        Thread.sleep(2000);
        System.out.println("");
    }
}
