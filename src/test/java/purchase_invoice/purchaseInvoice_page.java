package purchase_invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class purchaseInvoice_page {
    private static WebElement element=null;
    // public int randomInt ;
    static WebDriver driver = null;
    public purchaseInvoice_page(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement clickOnSideMenu(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"side-main-menu\"]/li[4]/a"));
        return element;
    }
    // //*[@id="purchase-list-menu"]/a
    public static WebElement clickOnPurchase(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-list-menu\"]/a"));
        return element;
    }
    // //*[@id="data-length-operations"]/a[1]
    public static WebElement clickOnAddInvoice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[1]"));
        return element;
    }
}
