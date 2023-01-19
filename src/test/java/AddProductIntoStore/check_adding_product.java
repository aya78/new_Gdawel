package AddProductIntoStore;

import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class check_adding_product {
    public WebDriver driver;
    String random_barcode = RandomStringUtils.random(8, false, true);

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
    public void search_product_page() throws InterruptedException {

        product_page.clickOnSearch(driver).sendKeys(""+random_barcode);
        Assert.doesNotContain(random_barcode,"new","product is added successfully");
        Thread.sleep(2000);

//        String barcode= product_page.click_barcode_generator(driver).getText();
//        Assert.doesNotContain(barcode,"new","product is added successfully");
        // //*[@id="code"]
        Thread.sleep(2000);
//      WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"code\"]"));

//        Select select = new Select(product_page.select_barcode(driver));
////        product_page.clickOnSearch(driver).sendKeys(""+select);

    }
}
