package quotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class quotations_page {
    private static WebElement element=null;

    // public int randomInt ;
    static WebDriver driver = null;
    public quotations_page(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement open_quotations(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"quotation-list-menu\"]/a"));
        return element;
    }
    // //*[@id="data-length-operations"]/a
    public static WebElement add_quotation(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a"));
        return element;
    }
    // //*[@id="quotation-form"]/div/div[1]/div/div/button
    // bill collector
    public static WebElement click_dropdown_of_bill_collector(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"quotation-form\"]/div/div[1]/div/div/button"));
        return element;
    }
    // //*[@id="bs-select-8-0"]
    public static WebElement select_bill_collector(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"bs-select-8-0\"]"));
        return element;
    }
    // //*[@id="quotation-form"]/div/div[2]/div/div/button/div/div/div
    // supplier
    public static WebElement click_dropdown_of_supplier(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"quotation-form\"]/div/div[2]/div/div/button/div/div/div"));
        return element;
    }
    // //*[@id="bs-select-9-0"]
    public static WebElement select_supplier(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"bs-select-9-0\"]"));
        return element;
    }

    // //form[@id='quotation-form']/div[1]/div[3]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]
    // client
    public static WebElement click_dropdown_of_client(WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id='quotation-form']/div[1]/div[3]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]"));
        return element;
    }
    // //*[@id="bs-select-9-0"]
    public static WebElement select_client(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()[normalize-space()='عميل نقدي (1677142694)']]"));
        return element;
    }
    // //form[@id='quotation-form']/div[1]/div[4]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]
    // store
    public static WebElement click_dropdown_of_store(WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id='quotation-form']/div[1]/div[4]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]"));
        return element;
    }
    // //span[text()[normalize-space()='alex']]
    public static WebElement select_store(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()[normalize-space()='alex']]"));
        return element;
    }
    // //*[@id="lims_productcodeSearch"]
    public static WebElement scan_barcode(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"lims_productcodeSearch\"]"));
        return element;
    }
    // //*[@id="quotation-form"]/div/div[10]/div/input
    // order discount
    public static WebElement enter_order_discount(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"quotation-form\"]/div/div[10]/div/input"));
        return element;
    }
    // //*[@id="quotation-form"]/div/div[11]/div/input
    // shipping cost
    public static WebElement enter_shipping_cost(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"quotation-form\"]/div/div[11]/div/input"));
        return element;
    }
    // //*[@id="submit-button"]
    public static WebElement create_quotation(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        return element;
    }
    // //button[@data-toggle='dropdown']//i
    public static WebElement click_action(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@data-toggle='dropdown']//i"));
        return element;
    }
    // //ul[@user='menu']//a
    // view_quotation
    public static WebElement view_quotation(WebDriver driver){
        element = driver.findElement(By.xpath("//ul[@user='menu']//a"));
        return element;
    }
    // //button[text()[normalize-space()='الفاتورة']]
    public static WebElement click_invoice_button(WebDriver driver){
        element = driver.findElement(By.xpath("//button[text()[normalize-space()='الفاتورة']]"));
        return element;
    }
    // //i[contains(@class,'fa fa-share')]/following-sibling::span[1]
    public static WebElement view_quotation_invoice(WebDriver driver){
        element = driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]/following-sibling::span[1]"));
        return element;
    }

}
