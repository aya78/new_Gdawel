package AddServiceIntoStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class service_page {
    private static WebElement element=null;
    // public int randomInt;
    static WebDriver driver = null;
    public service_page(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement clickOnSideMenu(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"side-main-menu\"]/li[3]/a"));
        return element;
    }
    //email
    public static WebElement clickOnProducts(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@href='http://10.10.0.50/products']"));
        return element;
    }
    // Search about product
    // //*[@id="product-data-table_filter"]/label/input
//    public static WebElement clickOnSearch(WebDriver driver){
//        element = driver.findElement(By.xpath("//*[@id=\"product-data-table_filter\"]/label/input"));
//        return element;
//    }
    public static WebElement clickAddProduct(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(@class,'btn btn-danger')]/following-sibling::a[1]"));
        return element;
    }

    // //*[@id="first"]/div/div/div[2]/div
    public static WebElement clickAddService(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"first\"]/div/div/div[2]/div/img"));
        return element;
    }
    public static WebElement enterServiceName(WebDriver driver){
        element = driver.findElement(By.id("name"));
        return element;
    }
//    public static WebElement select_barcode_sign(WebDriver driver){
//        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(4) > div > div > div > select > option:nth-child(1)"));
//        return element;
//    }
    public static WebElement select_barcode(WebDriver driver){
        element = driver.findElement(By.id("code"));
        return element;
    }
    // //*[@id="product-form"]/div/div/div[1]/div/div[2]/div/div[5]/div/div/div/button
    public static WebElement click_dropdown(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div/div/button"));
        return element;
    }
    public static WebElement select_brand(WebDriver driver){
        element = driver.findElement(By.cssSelector("#bs-select-13-1 > span"));
        return element;
    }
    // (//div[@class='mb-3']//input)[2]
    // click_product_cost
    public static WebElement click_product_cost(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[2]/div[1]/div/div/div[2]/input"));
        return element;
    }
    // //div[@class='mt-sm-0 mt-2']//input[1]
    public static WebElement click_add_service(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='mt-sm-0 mt-2']//input[1]"));
        return element;
    }
}
