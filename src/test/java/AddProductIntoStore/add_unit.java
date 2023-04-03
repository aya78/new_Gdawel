package AddProductIntoStore;

import com.github.javafaker.Faker;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static AddProductIntoStore.product_page.driver;

public class add_unit {
    @Test(priority = 0)
    public void add_unit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        product_page object =new product_page();
        Faker fakeData=new Faker();
        product_page.open_units(driver).click();
        /** create base unit */
        product_page.add_new_unit(driver).click();
        object.setName(fakeData.name().name());
        object.setBarcode(fakeData.number().digits(8));
        product_page.enter_barcode(driver).sendKeys(object.getBarcode());
        product_page.enter_name(driver).sendKeys(object.getName());
        product_page.click_save_unit(driver).click();
    }
}

