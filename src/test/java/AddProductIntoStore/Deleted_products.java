package AddProductIntoStore;

import login.login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.TEST;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Deleted_products {
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
    public void Open_deletedProducts() throws InterruptedException {
        product_page.click_deleted_products(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void restore_deletedProducts() throws InterruptedException {

        product_page.click_action_button(driver).click();
        product_page.click_view_deleted_product(driver).click();
        String v= product_page.copy_barcode(driver).getText();
        product_page.restore_product(driver).click();

    }

    //    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
