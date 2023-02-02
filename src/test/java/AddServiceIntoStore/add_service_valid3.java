package AddServiceIntoStore;

import AddProductIntoStore.product_page;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**  طريقه الضرايب ضريبه شامله و الضريبه صفريه* */

public class add_service_valid3 {
    String random_number = RandomStringUtils.random(5, false, true);
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
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_products_page() throws InterruptedException {
        product_page.clickOnSideMenu(driver).click();
        product_page.clickOnProducts(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void add_service_page() throws InterruptedException {
        service_page.clickAddProduct(driver).click();
        Thread.sleep(2000);
        service_page.clickAddService(driver).click();
        service_page.enterServiceName(driver).sendKeys(""+random_string);
        service_page.select_barcode(driver).sendKeys(""+random_barcode);
        Thread.sleep(2000);
        service_page.click_dropdown(driver).click();
        Thread.sleep(1000);
        service_page.select_brand(driver).click();
        service_page.click_product_cost(driver).sendKeys("200");
        service_page.click_Tax_type(driver).click();
        service_page.click_add_service(driver).click();
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void search_service_page() throws InterruptedException {
        service_page.clickOnSearch(driver).sendKeys(""+random_barcode);
        Thread.sleep(2000);
    }
//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
