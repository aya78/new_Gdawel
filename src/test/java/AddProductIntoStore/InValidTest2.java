package AddProductIntoStore;

import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class InValidTest2 {

/** check on option >> هذا المنتج له سعر مختلف ف المخازن
 * check on option >> يحتوي هذا العنصر علي IMEI **/
    /**  طريقه الضرايب ضريبه شامله و الضريبه مضافه* */
    /**Enter empty Product_selling_price**/



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
            // driver=new ChromeDriver();
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
            Actions a = new Actions(driver);

            /**Enter empty Product_selling_price**/

            Thread.sleep(2000);
            product_page.clickAddProduct(driver).click();
            Thread.sleep(2000);

            product_page.enterProductName(driver).sendKeys("" +random_string);
            product_page.select_brand(driver).click();
            product_page.click_barcode_generator(driver).click();
            Thread.sleep(2000);
            product_page.click_classification(driver).click();
//        product_page.click_quantity(driver).sendKeys("10");
            product_page.click_product_unit(driver).click();
            product_page.click_product_cost(driver).sendKeys("" + random_number);
            product_page.click_Product_selling_price(driver).sendKeys("");
//      product_page.upload_product_img(driver).sendKeys("/home/hash-pc-8/Downloads/iphone.jpeg");
            product_page.click_additional_Tax(driver).click();
            product_page.click_Tax_type(driver).click();
            Thread.sleep(2000);
            //scroll down a page
            a.sendKeys(Keys.PAGE_DOWN).build().perform();

            product_page.click_first_checklist(driver).click();
            Thread.sleep(2000);
//            product_page.set_first_value(driver).sendKeys("200");
//            product_page.set_second_value(driver).sendKeys("600");
            new WebDriverWait(driver, Duration.ofSeconds(20));
            product_page.click_product_has_IMEI(driver).click();
            Thread.sleep(2000);

            //scroll up a page
            a.sendKeys(Keys.PAGE_UP).build().perform();
            product_page.click_add_product(driver).click();
            Thread.sleep(2000);

        }
//        @AfterTest
//        public void TearDown(){
//            driver.quit();
//        }

    }

