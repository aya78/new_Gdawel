package AddServiceIntoStore;

import Pages.product_page;
import Pages.service_page;
import com.github.javafaker.Faker;
import Pages.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**  طريقه الضرايب ضريبه حصريه و الضريبه صفريه* */

public class validScenario1 {
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
    public void add_service_page() throws InterruptedException {
        for(int i =0 ; i<=4 ; i++){
            Thread.sleep(1000);

            product_page.clickAddProduct(driver).click();
            Thread.sleep(2000);
            service_page.clickAddService(driver).click();
            product_page object =new product_page();
            Faker fakeData=new Faker();
            object.setName(fakeData.name().name());
            object.setBarcode(fakeData.number().digits(8));
            object.setQuantity(fakeData.number().digits(2));
            object.setProduct_cost(fakeData.number().digits(3));
            service_page.enterServiceName(driver).sendKeys(object.getName());
            service_page.select_barcode(driver).sendKeys(object.getBarcode());
            Thread.sleep(2000);
            service_page.click_dropdown(driver).click();
            Thread.sleep(1000);
            service_page.select_brand(driver);
            service_page.click_product_cost(driver).sendKeys(object.getProduct_cost());
            service_page.click_add_service(driver).click();
            Thread.sleep(1000);
        }

    }
//    @Test(priority = 3)
//    public void search_service_page() throws InterruptedException {
//        service_page.clickOnSearch(driver).sendKeys(""+random_barcode);
//        Thread.sleep(2000);
//    }
//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }

}
