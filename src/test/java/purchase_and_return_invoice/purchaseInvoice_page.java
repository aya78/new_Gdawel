package purchase_and_return_invoice;

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
    public static WebElement clickOnPurchases(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-list-menu\"]/a"));
        return element;
    }
    // //*[@id="data-length-operations"]/a[1]
    public static WebElement clickOnAddInvoice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[1]"));
        return element;
    }
    // //*[@id="purchase-form"]/div/div[2]/div/div[2]/button/div/div/div
    public static WebElement clickOnSupplierDropdown(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[2]/div/div[2]/button/div/div/div"));
        return element;
    }
// //*[@id="bs-select-11"]/ul/li[4]
    public static WebElement selectValueFromDropdown1(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"bs-select-11\"]/ul/li[4]"));
        return element;
    }
    // //*[@id="purchase-form"]/div/div[3]/div/div/button
    public static WebElement clickOnStoreDropdown(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[3]/div/div/button"));
        return element;
    }
    // #bs-select-12-0
    public static WebElement selectValueFromDropdown2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#bs-select-12-0"));
        return element;
    }
    // //*[@id="purchase-form"]/div/div[5]/div/div/label/span
    public static WebElement click_span(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[5]/div/div/label/span"));
        return element;
    }
    // //*[@id="input-63e2154973d20"]
    // //*[@id="input-63e9f96197c31"]
    public static WebElement upload_file(WebDriver driver){
        element = driver.findElement(By.className("form-control"));
        return element;
    }
    public static WebElement scan_barcode(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"lims_productcodeSearch\"]"));
        return element;
    }
    // //div[text()='06012945|flower']
    // //div[text()='09391587|Walker Burks']
    public static WebElement selectProduct(WebDriver driver){
        element = driver.findElement(By.xpath("//div[text()='09391587|Walker Burks']"));
        return element;
    }
    // //*[@id="purchase-form"]/div/div[9]/div/input
    public static WebElement enter_tax(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[9]/div/input"));
        return element;
    }
    // //*[@id="purchase-form"]/div/div[10]/div/input
    public static WebElement enter_product_cost(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[10]/div/input"));
        return element;
    }
    // //*[@id="submit-btn"]
    public static WebElement clickAddInvoice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"submit-btn\"] "));
        return element;
    }
    // //*[@id="content"]/div/section/div/div[1]/div[1]/div[2]/button
    // //*[@id="content"]/div/section/div/div[1]/div[1]/div[2]/button[1]
    public static WebElement clickAddPayment(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div[1]/div[1]/div[2]/button[1]"));
        return element;
    }
    // //*[@id="add-payment"]/div/div/div[2]/form/button
    public static WebElement clickSaveButton(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"add-payment\"]/div/div/div[2]/form/button"));
        return element;
    }
    /**************************************************************************************************************************************/
    // //i[contains(@class,'fa fa-search')]/following-sibling::input[1]
    public static WebElement searchbar(WebDriver driver){
        element=driver.findElement(By.className("form-control form-control-sm"));
        return element;
    }
    // //*[@id="purchase-table"]/tbody/tr/td[10]/div/button
    public static WebElement click_action_dropdown(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"purchase-table\"]/tbody/tr/td[10]/div/button"));
        return element;
    }
    // //*[@id="purchase-table"]/tbody/tr/td[10]/div/ul/li[2]/button
    public static WebElement click_show_payment(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"purchase-table\"]/tbody/tr/td[10]/div/ul/li[2]/button"));
        return element;
    }
    // //*[@id="view-payment"]/div/div/div[1]/button
    public static WebElement close_show_payment(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"view-payment\"]/div/div/div[1]/button"));
        return element;
    }

    public static WebElement clickViewInvoice(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"invoiceItems\"]/a[1]"));
        return element;
    }

    // //*[@id="dropItems"]/a[1]
    public static WebElement printInvoice(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"dropItems\"]/a[1]"));
        return element;
    }
    // //*[@id="dropItems"]/a[2]
    public static WebElement AddReturnInvoice(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"invoiceItems\"]/a[3]"));
        return element;
    }
// //table[@id='purchase-table']/tbody[1]/tr[1]/td[1]
public static WebElement open_invoice(WebDriver driver){
    element=driver.findElement(By.xpath("//table[@id='purchase-table']/tbody[1]/tr[1]/td[1]"));
    return element;
}
    // //button[@data-toggle='modal']//span[1]
    public static WebElement change_status_of_invoice(WebDriver driver){
        element=driver.findElement(By.xpath("//button[@data-toggle='modal']//span[1]"));
        return element;
    }
    /***********************************************************return purchase****************************************************************/
    // //*[@id="dropGroup"]/button
    public static WebElement clickMoreButton(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div[1]/div[1]/div[2]/div[1]/button"));
        return element;
    }
    // //*[@id="invoiceItems"]/a[3]
    public static WebElement click_return_purchase(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"invoiceItems\"]/a[3]"));
        return element;
    }

    // //*[@id="myTable"]/tbody/tr/td[9]/input
    public static WebElement select_products(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[9]/input"));
        return element;
    }

    // #submit-button
    public static WebElement click_save_return_purchase(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#submit-button"));
        return element;
    }
    /***********************************************************************************************************/

}
//    public WebElement fluentWait(final By locator) {
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(30, TimeUnit.SECONDS)
//                .pollingEvery(5, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(locator);
//            }
//        });
//
//        return  foo;
//    };
//    /**
//     * wait until expected element is visible
//     *
//     * @param   expectedElement     element to be expected
//     * @param   timeout             Maximum timeout time
//     */
//
//    public  void waitForElement(By expectedElement, long timeout) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, timeout);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(expectedElement));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            //System.out.println("print ur message here");
//        }
//    }
