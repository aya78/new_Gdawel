package AddProductIntoStore;

import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Random_user_test {
    String random_number = RandomStringUtils.random(5, false, true);
    int finite;
    String random_barcode = RandomStringUtils.random(8, false, true);
    Random r = new Random();
    int barcode = r.nextInt(8);
    int cost = r.nextInt(3);
    String name = r.toString();

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
    public void add_product_page() throws InterruptedException {
//        Scanner scanner=new Scanner(System.in);
//        scanner.hasNextInt(finite);
        for (int i =0 ; i<=5 ; i++)
        {
            product_page.clickAddProduct(driver).click();

            Thread.sleep(2000);
            product_page.enterProductName(driver).sendKeys(""+ new product_page.RandomString(6));
            product_page.select_brand(driver).click();
            product_page.select_barcode(driver).sendKeys("" + random_barcode);
            System.out.println(barcode);
            Thread.sleep(1000);
            product_page.click_classification(driver).click();
            product_page.select_classification(driver).click();
            product_page.click_quantity(driver).sendKeys("10");
            product_page.click_product_unit(driver).click();
            product_page.click_product_cost(driver).sendKeys(""+random_number);
            Thread.sleep(2000);
            product_page.click_Product_selling_price(driver).sendKeys(""+random_number);
            Thread.sleep(2000);
            Actions a = new Actions(driver);
            //scroll down a page
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
            //scroll up a page
            a.sendKeys(Keys.PAGE_UP).build().perform();
            product_page.click_add_product(driver).click();
            Thread.sleep(2000);
        }
        // comment
    }
}
