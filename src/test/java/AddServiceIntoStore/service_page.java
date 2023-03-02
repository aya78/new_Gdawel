package AddServiceIntoStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class service_page {
    private static WebElement element=null;
    // public int randomInt ;
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
    // //*[@id="data-length-operations"]/a[2]
    public static WebElement clickAddProduct(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[2]"));
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
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div/div/button"));
        return element;
    }
    public static WebElement select_brand(WebDriver driver) throws InterruptedException {
        element =driver.findElement(By.name("category_id"));
        Select skills = new Select(element);
        int dropdown_value= driver.findElements(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(5) > div > div > div > select > option")).size();
        System.out.println(dropdown_value);

        Random random3=new Random();
        int index= random3.nextInt(dropdown_value);
        skills.selectByIndex(index);
        System.out.println(index);
        Thread.sleep(5000);
        return element;
    }
//    public static WebElement select_brand(WebDriver driver){
//        element = driver.findElement(By.cssSelector("#bs-select-12 > ul > li:nth-child(2)"));
//        return element;
//    }
    // (//div[@class='mb-3']//input)[2]
    // click_product_cost
    public static WebElement click_product_cost(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[2]/div[1]/div/div/div[2]/input"));
        return element;
    }
    public static WebElement click_additional_Tax(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)"));
        return element;
    }
    public static WebElement click_Tax_type(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(5) > div > select > option:nth-child(2)"));
        return element;
    }
    // //*[@id="customSwitch1"]
    public static WebElement click_special_item(WebDriver driver){
        element = driver.findElement(By.cssSelector("form#product-form>div>div>div:nth-of-type(2)>div:nth-of-type(3)>div>div>label"));
        return element;
    }
    // //div[@class='mt-sm-0 mt-2']//input[1]
    public static WebElement click_add_service(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='mt-sm-0 mt-2']//input[1]"));
        return element;
    }
    // //*[@id="product-data-table_filter"]/label/input
    public static WebElement clickOnSearch(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table_filter\"]/label/input"));
        return element;
    }
}
