package GdawelScenarioes;
import AddProductIntoStore.add_brand;
import AddProductIntoStore.add_unit;
import com.github.javafaker.Faker;
import login.login_Page;
import AddProductIntoStore.product_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import AddProductIntoStore.validTest1;
import purchase_and_return_invoice.validScenario1;
public class AddNewPurchaseInvoice {
    public WebDriver driver;
    validTest1 new_test = new validTest1();
    add_unit unit= new add_unit();
    add_brand brand = new add_brand();
    validScenario1 purchase_invoice= new validScenario1();
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
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void add_product() throws InterruptedException {

        new_test.open_products_page();
        new_test.add_product_page();
        unit.add_unit();
        brand.add_brand();
        new_test.open_products_page();
        new_test.add_product_page();
    }

    @Test(priority = 3)
    public void add_new_purchase_invoice() throws InterruptedException {
        purchase_invoice.open_purchase_page();
        purchase_invoice.add_purchase_page();

    }




}
