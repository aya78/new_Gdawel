package sale_and_return_invoice;

import Pages.sale_page;
import com.github.javafaker.Faker;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import Pages.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.product_page;

import static sale_and_return_invoice.GiftCardPage.*;

public class Add_gift_card {
    String random_number = RandomStringUtils.random(3, false, true);

    public String url ;
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
    @Story("Gadawel Basic Login")@TmsLink("TC-000")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen the result status will open the website")
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://gdawel.app/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 123456789);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Test (priority = 1)
    public void AddGiftCard() throws InterruptedException {
        /**  عميل نقدي**/
        sale_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);
        product_page object = new product_page();
        Faker fakeData=new Faker();
        object.setBarcode(fakeData.number().digits(5));
        open_gift_card(driver).click();
        Thread.sleep(1000);

        add_gift_card(driver).click();
        Thread.sleep(1000);
        insert_gift_card_barcode(driver).click();
        add_value_for_gift_card(driver).sendKeys(object.getBarcode());
        System.out.println(random_number);
        click_dropdown_of_client(driver).click();
        Thread.sleep(1000);
        select_client(driver).click();
        click_add_gift_card(driver).click();
//        return new getAlertText();
//   assertEquals(getAlertText().contains("GiftCard created successfully"), true, "error");

    }
//    @Test(priority = 2)
//    public void open_sales_page() {
//        /** THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
//        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
//        purchaseInvoice_page.clickOnSideMenu(driver).click();
//        sale_page.open_sales(driver).click();
//
//    }
//    @Test(priority = 3,description = " open sale invoice and add payment by gift card it`s value more than price of sale invoice" +
//            " \n then it will withdraw the money in the card, and whoever remains will go to the deferred amount")
//    public void open_sale_invoiceAnd_pay() throws InterruptedException {
//     sale_page.open_invoice(driver).click();
//     sale_page.add_payment(driver).click();
//     Thread.sleep(1000);
//     sale_page.select_payment_method(driver).click();
//     Thread.sleep(1000);
//     sale_page.select_payment_with_giftCard(driver).click();
//     Thread.sleep(1000);
//     sale_page.click_dropdown_of_gift_card(driver).click();
//     Thread.sleep(1000);
//     sale_page.select_gift_card1(driver).click();
//     Thread.sleep(1000);
//     sale_page.click_save(driver).click();
//     GiftCardPage.open_gift_card(driver).click();
//    }

}
