package quotations;

import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import  purchase_and_return_invoice.purchaseInvoice_page;

public class Action_on_quotation {
    public String random_num = RandomStringUtils.random(2, false, true);
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
    @Story(" actions on quotations")@TmsLink("TC-001")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user" +
            " \nThen view quotation")
    public void action_on_quotation_invoice() throws InterruptedException {
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        Thread.sleep(1000);
        quotations_page.open_quotations(driver).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//td[text()='4']")).click();
        quotations_page.click_action(driver).click();
        quotations_page.view_quotation(driver).click();
        url = driver.getCurrentUrl();
        quotations_page.click_invoice_button(driver).click();
        quotations_page.view_quotation_invoice(driver).click();
        driver.navigate().to(url);
    }
}
