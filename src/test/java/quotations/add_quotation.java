package quotations;

import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import  purchase_and_return_invoice.purchaseInvoice_page;

public class add_quotation {
    public String random_num = RandomStringUtils.random(2, false, true);
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
    @Story("add quotation")@TmsLink("TC-001")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen navigate to sales & purchases and open quotations")
    public void add_quotation() throws InterruptedException {
       purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);

        quotations_page.open_quotations(driver).click();
        Thread.sleep(2000);

        quotations_page.add_quotation(driver).click();
        Thread.sleep(2000);

        quotations_page.click_dropdown_of_bill_collector(driver).click();
        Thread.sleep(1000);

        quotations_page.select_bill_collector(driver).click();
       Thread.sleep(2000);
        quotations_page.click_dropdown_of_supplier(driver).click();
        Thread.sleep(1000);

        quotations_page.select_supplier(driver).click();
        Thread.sleep(2000);

        quotations_page.click_dropdown_of_client(driver).click();
        Thread.sleep(1000);

        quotations_page.select_client(driver).click();
        Thread.sleep(2000);

        quotations_page.click_dropdown_of_store(driver).click();
        Thread.sleep(1000);

        quotations_page.select_store(driver).click();
        Thread.sleep(2000);

        quotations_page.scan_barcode(driver).sendKeys(""+1);
        Thread.sleep(2000);

        Actions a = new Actions(driver);
        //scroll down a page
        a.sendKeys(Keys.PAGE_DOWN).build().perform();

        quotations_page.enter_order_discount(driver).sendKeys(""+random_num);
        quotations_page.enter_shipping_cost(driver).sendKeys(""+random_num);
        quotations_page.create_quotation(driver).click();

    }


}
