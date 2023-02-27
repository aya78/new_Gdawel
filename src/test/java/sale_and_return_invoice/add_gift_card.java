package sale_and_return_invoice;

import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import purchase_and_return_invoice.purchaseInvoice_page;

import java.util.concurrent.TimeUnit;

public class add_gift_card {
        String random_number = RandomStringUtils.random(3, false, true);

    public String url ;
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Story("Gadawel Basic Login")@TmsLink("TC-000")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen the result status will open the website")
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test (priority = 1)
    public void Add_Gift_Card() throws InterruptedException {
        /**  عميل نقدي**/
     sale_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);
        sale_page.open_gift_card(driver).click();
        Thread.sleep(1000);

        sale_page.add_gift_card(driver).click();
        Thread.sleep(1000);

        sale_page.insert_gift_card_barcode(driver).click();
     sale_page.add_value_for_gift_card(driver).sendKeys(""+random_number);
     sale_page.click_dropdown_of_client(driver).click();
     Thread.sleep(1000);
     sale_page.select_client(driver).click();
     sale_page.click_add_gift_card(driver).click();
    }
//    @Test(priority = 2)
//    public void open_sales_page() {
//        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        purchaseInvoice_page.clickOnSideMenu(driver).click();
//        sale_page.open_sales(driver).click();
//    }
//    @Test(priority = 3)
//    public void open_sale_invoice() throws InterruptedException {
//     sale_page.open_invoice(driver).click();
//     sale_page.add_payment(driver).click();
//     sale_page.click_dropdown_of_gift_card(driver).click();
//     Thread.sleep(1000);
//     sale_page.select_gift_card(driver).click();
//     Thread.sleep(1000);
//     sale_page.click_save(driver).click();
//    }

}
