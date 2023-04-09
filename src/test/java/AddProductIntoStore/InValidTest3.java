package AddProductIntoStore;

import Pages.product_page;
import Pages.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InValidTest3 {
    /**  طريقه الضرايب ضريبه حصريه و الضريبه صفريه* */
    /**  ------------------------un select product_unit
     * enter string input in barcode
     * enter empty product_cost
     * ----------------------------**/


    String random_number = RandomStringUtils.random(5, false, true);
        String random_barcode = RandomStringUtils.random(8, false, true);

        public String random_string = RandomStringUtils.random(6, true, false);

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
    //*[@id="product-form"]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div/button/div/div/div
        @Test(priority = 2)
        public void add_product_page() throws InterruptedException {
             /**  ------------------------un select product_unit----------------------------**/
            product_page.clickAddProduct(driver).click();

            Thread.sleep(2000);
            product_page.enterProductName(driver).sendKeys(""+random_string);
            product_page.select_brand(driver).click();
//        product_page.click_barcode_generator(driver).click();

//            driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div/button/div/div/div")).click();
            product_page.select_barcode_sign(driver).click();
            product_page.select_barcode(driver).sendKeys("" + random_string);
            System.out.println(random_string);
            product_page.click_classification(driver).click();
            product_page.click_quantity(driver).sendKeys("10");
//            product_page.click_product_unit(driver).click();
            product_page.click_product_cost(driver).sendKeys("");
            Thread.sleep(2000);
            product_page.click_Product_selling_price(driver).sendKeys(""+random_number);
//        product_page.click_additional_Tax(driver).click();
//        product_page.upload_product_img(driver).sendKeys("/home/hash-pc-8/Downloads/iphone.jpeg");
            Thread.sleep(2000);

            product_page.click_add_product(driver).click();
            Thread.sleep(2000);
            // comment
        }
        @Test(priority = 3)
        public void search_product_page() throws InterruptedException {

            product_page.clickOnSearch(driver).sendKeys(""+random_barcode);
            Thread.sleep(2000);
        }
//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
