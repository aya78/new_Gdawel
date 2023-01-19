package AddProductIntoStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class product_page {
    private static WebElement element=null;
    // public int randomInt;
    static WebDriver driver = null;

    public product_page(WebDriver driver) {
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
    public static WebElement clickAddProduct(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(@class,'btn btn-danger')]/following-sibling::a[1]"));
        return element;
    }
    // name
    public static WebElement enterProductName(WebDriver driver){
        element = driver.findElement(By.id("name"));
        return element;
    }
    // //a[@id='bs-select-11-0']//span[1]
    public static WebElement select_brand(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(3) > div > div > div > select > option:nth-child(8)"));
        return element;
    }
    // //button[@type='button']//img
    public static WebElement click_barcode_generator(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@type='button']//img"));
        return element;
    }
    // #product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(6) > div > div > div > select > option:nth-child(2)
    // #bs-select-13-0
    public static WebElement click_classification(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(6) > div > div > div > select > option:nth-child(2)"));
        return element;
    }
    // (//input[@step='any'])[2]
    public static WebElement click_quantity(WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@step='any'])[2]"));
        return element;
    }
    // #unit > div > div:nth-child(1) > div > div > div > select > option:nth-child(3)
    public static WebElement click_product_unit(WebDriver driver){
        element = driver.findElement(By.cssSelector("#unit > div > div:nth-child(1) > div > div > div > select > option:nth-child(3)"));
        return element;
    }
    // //div[@id='cost']//input[1]
    public static WebElement click_product_cost(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@id='cost']//input[1]"));
        return element;
    }
    // //label[@class='item-pay-price']/following-sibling::input[1]
    public static WebElement click_Product_selling_price(WebDriver driver){
        element = driver.findElement(By.xpath("//label[@class='item-pay-price']/following-sibling::input[1]"));
        return element;
    }
    //button[@class='dz-button']//span[1]
    public static WebElement upload_product_img(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@class='dz-button']//span[1]"));
        return element;
    }
    // #product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)
    public static WebElement click_additional_Tax(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)"));
        return element;
    }
    // #product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(5) > div > select > option:nth-child(2)
    public static WebElement click_Tax_type(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(5) > div > select > option:nth-child(2)"));
        return element;
    }
    // //span[text()='هذا العنصر له سعر مختلف في المخازن']/following-sibling::span
    public static WebElement click_first_checklist(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='هذا العنصر له سعر مختلف في المخازن']/following-sibling::span"));
        return element;
    }
    // (//input[@type='number'])[3]
    public static WebElement set_first_value(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"diffPrice-table\"]/thead/tr[2]/td[2]/input"));
        return element;
    }
    // //table[@id='diffPrice-table']/thead[1]/tr[3]/td[2]/input[1]
    public static WebElement set_second_value(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"diffPrice-table\"]/thead/tr[3]/td[2]/input"));
        return element;
    }
    // //span[text()='يحتوي هذا العنصر على IMEI أو أرقام تسلسلية']/following-sibling::span
    public static WebElement click_product_has_IMEI(WebDriver driver){
        element = driver.findElement(By.xpath("(//span[@class='check-content']/following-sibling::span)[3]"));
        return element;
    }
    public static WebElement click_add_product(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='submit-btn']"));
        return element;
    }


}
