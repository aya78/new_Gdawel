package sale_and_return_invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardPage {
    private static WebElement element = null;

    // public int randomInt ;
    static WebDriver driver = null;
//    private String s;
    private static By status_alert = By.id("");
    public static String getAlertText(){
        return driver.findElement(status_alert).getText();
    }
    public GiftCardPage(WebDriver driver) {
        this.driver = driver;
    }
//    public static void getText(String s){
//        this.s=s;
//    }

    /**********************************************************************************Gift Card************************************************************************/
    // #gift-card-menu > a
    // //*[@id="gift-card-menu"]/a
    public static WebElement open_gift_card(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#gift-card-menu > a"));
        return element;
    }
    // //*[@id="content"]/div/section/div/div[1]/div/button
    public static WebElement add_gift_card(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div[1]/div/button"));
        return element;
    }
    // //*[@id="gift_card-modal"]/div/div/div[2]/form/div[1]/div/div/button
    public static WebElement insert_gift_card_barcode(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"gift_card-modal\"]/div/div/div[2]/form/div[1]/div/div/button"));
        return element;
    }
    // //*[@id="gift_card-modal"]/div/div/div[2]/form/div[2]/input
    public static WebElement add_value_for_gift_card(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"gift_card-modal\"]/div/div/div[2]/form/div[2]/input"));
        return element;
    }
    // //*[@id="gift_card-modal"]/div/div/div[2]/form/div[4]/div/button
    public static WebElement click_dropdown_of_client(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"gift_card-modal\"]/div/div/div[2]/form/div[4]/div/button"));
        return element;
    }
    // //*[@id="bs-select-9-0"]
    public static WebElement select_client(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"bs-select-9-0\"]"));
        return element;
    }
    // //*[@id="gift_card-modal"]/div/div/div[2]/form/div[6]/button
    public static WebElement click_add_gift_card(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"gift_card-modal\"]/div/div/div[2]/form/div[6]/button"));
        return element;

    }
    public static WebElement add_payment(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table\"]/tbody/tr/td[12]/div/ul/li[3]/button"));
        return element;
    }
    public static WebElement click_dropdown_of_gift_card(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"gift_card-modal\"]/div/div/div[2]/form/div[6]/button"));
        return element;
    }
    // //*[@id="bs-select-9-0"]
    public static WebElement select_gift_card(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#bs-select-9-0"));
        return element;
    }

    // //*[@id="add-payment"]/div/div/div[2]/form/button
    public static WebElement click_save(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"add-payment\"]/div/div/div[2]/form/button"));
        return element;
    }

    public static class getAlertText {
    }
}
