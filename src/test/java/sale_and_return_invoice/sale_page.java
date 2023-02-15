package sale_and_return_invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sale_page {
    private static WebElement element = null;

    // public int randomInt ;
    static WebDriver driver = null;

    public sale_page(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement clickOnSideMenu(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"side-main-menu\"]/li[4]/a"));
        return element;
    }

    // //*[@id="sale-list-menu"]/a
    public static WebElement open_sales(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-list-menu\"]/a"));
        return element;
    }

    public static WebElement clickOnAddInvoice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[1]"));
        return element;
    }

    // //*[@id="content"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[2]/button
    public static WebElement clickOnClientDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[2]/button"));
        return element;
    }

    // //*[@id="bs-select-11"]/ul/li[3]
    public static WebElement selectValueFromDropdown1(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"bs-select-11\"]/ul/li[3]"));
        return element;
    }

    // //*[@id="content"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/button
    public static WebElement clickOnStoreDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/button"));
        return element;
    }

    // #bs-select-12 > ul > li:nth-child(1)
    public static WebElement selectValueFromDropdown2(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#bs-select-12 > ul > li:nth-child(1)"));
        return element;
    }

    // //*[@id="content"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div/div/button
    public static WebElement click_bill_collector(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/section/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div/div/button"));
        return element;
    }

    // #bs-select-13 > ul > li:nth-child(1)
    public static WebElement selectValueFromDropdown3(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#bs-select-13 > ul > li:nth-child(1)"));
        return element;
    }

    // //*[@id="purchase-form"]/div/div[5]/div/div/label/span
    public static WebElement click_span(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[5]/div/div/label/span"));
        return element;
    }

    // //*[@id="input-63e2154973d20"]
    public static WebElement upload_file(WebDriver driver) {
        element = driver.findElement(By.id("input-63e2154973d20"));
        return element;
    }

    // //*[@id="lims_productcodeSearch"]
    public static WebElement scan_barcode(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"lims_productcodeSearch\"]"));
        return element;
    }

    // //div[text()='06012945|flower']
    // //div[text()='09391587|Walker Burks']
    public static WebElement selectProduct(WebDriver driver) {
        element = driver.findElement(By.xpath("//li[@class='ui-menu-item']//div"));
        return element;
    }

    // //*[@id="purchase-form"]/div/div[9]/div/input
    public static WebElement enter_tax(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[9]/div/input"));
        return element;
    }

    // //*[@id="purchase-form"]/div/div[10]/div/input
    public static WebElement enter_product_cost(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"purchase-form\"]/div/div[10]/div/input"));
        return element;
    }

    // //*[@id="content"]/div/form/section/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/input
    public static WebElement enter_Shipping_charges(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/section/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/input"));
        return element;
    }

    // //*[@id="submit-button"]
    public static WebElement clickAddInvoice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        return element;
    }

    public static WebElement searchbar(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table_filter\"]/label/input"));
        return element;
    }

    // //*[@id="sale-table"]/tbody/tr[1]/td[1]
    public static WebElement open_invoice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table\"]/tbody/tr[1]/td[1]"));
        return element;
    }

    // //*[@id="sale-table"]/tbody/tr/td[12]/div/button
    // //*[@id="sale-table"]/tbody/tr[1]/td[12]/div/button
    // //*[@id="sale-table"]/tbody/tr/td[12]/div
    public static WebElement click_action_dropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table\"]/tbody/tr/td[12]/div"));
        return element;
    }

    // //*[@id="dropGroup"]/button
    // (//button[contains(@class,'px-3 py-2')]//i)[2]
    public static WebElement clickMoreButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#content > div > section > div > div.card.p-4.purchase-details > div.d-flex.justify-content-between.align-content-center.flex-column-meduim.gap-2 > div.d-flex.align-items-center.gap-3.flex-wrap.mt-medium-1 > div:nth-child(3) > button"));
        return element;
    }

    public static WebElement clickViewInvoice(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"invoiceItems\"]/a[1]"));
        return element;
    }

    /**************************************************************Action on sale invoice**********************************************************************/
    // find by css selector
    // #sale-table > tbody > tr > td:nth-child(12) > div > button
    // find by xpath
    // //*[@id="sale-table"]/tbody/tr/td[12]/div/ul/li[4]/button
    // (//ul[contains(@class,'dropdown-menu edit-options')]//button)[3]
    // find by class
    // add-delivery btn btn-link list-action
    public static WebElement add_delivery_for_invoice(WebDriver driver) {
        element = driver.findElement(By.xpath("(//ul[contains(@class,'dropdown-menu edit-options')]//button)[3]"));
        return element;
    }

    // //*[@id="sale-table"]/tbody/tr/td[12]/div/ul/li[2]/button
    public static WebElement click_show_payment(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table\"]/tbody/tr/td[12]/div/ul/li[2]/button"));
        return element;
    }

    // //*[@id="view-payment"]/div/div/div[1]/button
    public static WebElement close_show_payment(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"view-payment\"]/div/div/div[1]/button"));
        return element;
    }

    // //*[@id="sale-table"]/tbody/tr/td[12]/div/ul/li[3]/button
    public static WebElement add_payment(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sale-table\"]/tbody/tr/td[12]/div/ul/li[3]/button"));
        return element;
    }

    // //*[@id="add-payment"]/div/div/div[2]/form/button
    public static WebElement click_save(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"add-payment\"]/div/div/div[2]/form/button"));
        return element;
    }

    // //*[@id="add-delivery"]/div/div/div[2]/form/div/div[3]/div/button
    public static WebElement change_status_of_delivery(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"add-delivery\"]/div/div/div[2]/form/div/div[3]/div/button"));
        return element;
    }

    // #bs-select-16 > ul > li:nth-child(1)
    public static WebElement select_value_for_status_of_delivery(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#bs-select-16 > ul > li:nth-child(1)"));
        return element;
    }

    // //*[@id="add-delivery"]/div/div/div[2]/form/button
    public static WebElement click_save_in_add_delivery(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"add-delivery\"]/div/div/div[2]/form/button"));
        return element;
    }

    /**
     * ************************************** create return sale invoice
     *********************************************************************/
    // //*[@id="invoiceItems"]/a[3]
    public static WebElement click_return_sale(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#invoiceItems > a:nth-child(5)"));
        return element;
    }

    // //*[@id="myTable"]/tbody/tr/td[9]/input
    public static WebElement select_products(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#myTable > tbody > tr > td:nth-child(9) > label > span"));
        return element;
    }

    // #submit-button
    public static WebElement click_save_return_sale(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#submit-button"));
        return element;
    }
}