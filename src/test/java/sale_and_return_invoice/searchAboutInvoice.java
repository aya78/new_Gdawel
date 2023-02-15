package sale_and_return_invoice;

import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import purchase_and_return_invoice.purchaseInvoice_page;

import java.util.concurrent.TimeUnit;

public class searchAboutInvoice {
    public String random_string = RandomStringUtils.random(6, true, false);
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Story("Gadawel Basic Login")@TmsLink("TC-000")
    @Test(priority = 0, description = " Login to Gdawel with valid username & password for exist user \nThen the result status will open the website")
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
//      Thread.sleep(2000);
    }
    @Story("Gadawel sales")@TmsLink("TC-001")
    @Test(priority = 1)
    public void open_sales_page() {
        /**THIS row of code below mean that -> driver wait for 800 seconds after any action in elements **/
        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        purchaseInvoice_page.clickOnSideMenu(driver).click();
        sale_page.open_sales(driver).click();
    }
    @Story("Gadawel Basic sales search")@TmsLink("TC-002")
    @Test(priority = 2, description = "after create invoice copy it`s number and open purchases page and paste in search bar " +
            "\nThen the result status will get the sale invoice that matches the num entered in search bar ")
    public void search_about_sale_invoice() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
        sale_page.open_invoice(driver).click();
        Thread.sleep(1000);
        String  s= driver.findElement(By.xpath("(//p[contains(@class,'mb-0 text-muted')]/following-sibling::p)[3]")).getText();
        sale_page.open_sales(driver).click();
        Thread.sleep(2000);
        sale_page.searchbar(driver).sendKeys(""+s);
        System.out.println(s);
    }

}
