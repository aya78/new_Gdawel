package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class product_page {
    private String name;
    private String barcode;
    private String quantity;
    private String product_cost;
    private String selling_price;
    private String email;
    private String phone;
    private String password;
    private static WebElement element=null;
    // public int randomInt;
    static WebDriver driver = null;

    public product_page() {
        this.driver = driver;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /***************************************/
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    /*****************************************/
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    /*****************************************/
    public String getProduct_cost() {
        return product_cost;
    }
    public void setProduct_cost(String product_cost) {
        this.product_cost = product_cost;
    }
    /*****************************************/
    public String getSelling_price() {
        return selling_price;
    }
    public void setSelling_price(String selling_price) {
        this.selling_price = selling_price;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


//
    public static WebElement clickOnSideMenu(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"side-main-menu\"]/li[3]/a"));
        return element;
    }
    //email
    // //*[@id="product-list-menu"]/a
    public static WebElement clickOnProducts(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-list-menu\"]/a"));
        return element;
    }
    // Search about product
    // //*[@id="product-data-table_filter"]/label/input
    public static WebElement clickOnSearch(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table_filter\"]/label/input"));
        return element;
    }
// //*[@id="data-length-nodata"]/div/div/div/a[2]
    // //*[@id="data-length-operations"]/a[2]
    public static WebElement clickAddProduct(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[2]"));
        return element;
    }
    /**  ------------------------------------add unit & brand ---------------------------add product -------------------------------------------------------------- **/

    public static WebElement open_units(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@href='https://gdawel.app/dashboard/unit']"));
        return element;
    }
    // //*[@id="content"]/div[1]/section/div/div[1]/div/a[1]
    public static WebElement add_new_unit(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/section/div/div[1]/div/a[1]"));
        return element;
    }
    public static WebElement enter_barcode(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[2]/div[1]/input"));
        return element;
    }
    public static WebElement enter_name(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[2]/div[2]/input"));
        return element;
    }
    public static WebElement click_save_unit(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"createForm\"]/div[2]/input"));
        return element;
    }
    /************************************  add brand *******************************************************************/
    // name
    public static WebElement open_brands(WebDriver driver){
        element = driver.findElement(By.id("name"));
        return element;
    }
    // //*[@id="content"]/div/section/div/div[1]/div/button[1]
    public static WebElement add_brand(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div[1]/div/button[1]"));
        return element;
    }
    // //*[@id="createModal"]/div/div/form/div[2]/div[1]/input
    public static WebElement enter_title(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[1]/input"));
        return element;
    }
    public static WebElement select_image(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-64295f4d107b0\"]"));
        return element;
    }
    // //*[@id="createModal"]/div/div/form/div[2]/div[3]/input
    public static WebElement click_save_brand(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[3]/input"));
        return element;
    }


    // name
    public static WebElement enterProductName(WebDriver driver){
        element = driver.findElement(By.id("name"));
        return element;
    }
    public static WebElement click_brand(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/button"));
        return element;
    }
    public static WebElement select_brand(WebDriver driver) throws InterruptedException {
        element =driver.findElement(By.name("brand_id"));
        Select skills = new Select(element);
        int dropdown_value= driver.findElements(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div.col-sm-6.mb-3.brand > div > div > div > select > option")).size();
        System.out.println(dropdown_value);

        Random random3=new Random();
        int index= random3.nextInt(dropdown_value);
        skills.selectByIndex(index);
        System.out.println(index);
        Thread.sleep(5000);
        return element;
    }
    // //a[@id='bs-select-11-0']//span[1]
//    public static WebElement select_brand(WebDriver driver){
//        element = driver.findElement(By.xpath("//*[@id=\"bs-select-8-3\"]"));
//        return element;
//    }
    // #product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(4) > div > div > div > select > option:nth-child(5)
    public static WebElement select_barcode_sign(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(4) > div > div > div > select > option:nth-child(6)"));
        return element;
    }
    // //button[@type='button']//img
    public static WebElement click_barcode_generator(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@type='button']//img"));
        return element;
    }
    public static WebElement select_barcode(WebDriver driver){
        element = driver.findElement(By.id("code"));
        return element;
    }
    // #product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(6) > div > div > div > select > option:nth-child(2)
    // #bs-select-13-0
    public static WebElement select_classification(WebDriver driver) throws InterruptedException {
        element =driver.findElement(By.name("category_id"));
        Select skills = new Select(element);
        int dropdown_value= driver.findElements(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div > div > div:nth-child(5) > div > div:nth-child(2) > div > select > option")).size();
        System.out.println(dropdown_value);

        Random random3=new Random();
        int index= random3.nextInt(dropdown_value);
        skills.selectByIndex(index);
        System.out.println(index);
        Thread.sleep(5000);
        return element;
    }
    public static WebElement click_classification(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-9.col-lg-12 > div > div.card-body > div > div:nth-child(5) > div > div > div > button"));
        return element;
    }
//    public static WebElement select_classification(WebDriver driver){
//        element = driver.findElement(By.xpath("//*[@id=\"bs-select-9-0\"]"));
//        return element;
//    }
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
    // //*[@id="product-form"]/div/div/div[2]/div[1]/div/div/div[2]/input
    public static WebElement click_Product_selling_price(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[2]/div[1]/div/div/div[2]/input"));
        return element;
    }
    //button[@class='dz-button']//span[1]
    public static WebElement upload_product_img(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"imageUpload\"]/div/button"));
        return element;
    }
    // #product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)
    public static WebElement click_additional_Tax(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)"));
        return element;
    }
//    public static WebElement click__Tax(WebDriver driver){
//        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(4) > div > select > option:nth-child(2)"));
//        return element;
//    }
    // #product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(5) > div > select > option:nth-child(2)
    public static WebElement click_Tax_type(WebDriver driver){
        element = driver.findElement(By.cssSelector("#product-form > div > div > div.col-xl-3.col-lg-12 > div:nth-child(1) > div > div > div:nth-child(5) > div > select > option:nth-child(2)"));
        return element;
    }
    // //span[text()='هذا العنصر له سعر مختلف في المخازن']/following-sibling::span
    public static WebElement click_first_checklist(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"diffPrice-option\"]/h5/label/span[2]"));
        return element;
    }
    // (//input[@type='number'])[3]
    public static WebElement set_first_value(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"diffPrice-table\"]/thead/tr[2]/td[2]/input"));
        return element;
    }
    // //table[@id='diffPrice-table']/thead[1]/tr[3]/td[2]/input[1]
    // //*[@id="diffPrice-table"]/thead/tr[3]/td[2]/input
    public static WebElement set_second_value(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"diffPrice-table\"]/thead/tr[3]/td[2]/input"));
        return element;
    }
    // //span[text()='يحتوي هذا العنصر على IMEI أو أرقام تسلسلية']/following-sibling::span
    // //*[@id="is-imei"]
    public static WebElement click_product_has_IMEI(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"imei-option\"]/h5/label/span[2]"));
        return element;
    }
    /** هذا المنتج له دفعه و تاريخ انتهاء صلاحيه**/
    // //*[@id="batch-option"]/h5/label/span[2]
    public static WebElement click_checklist2(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"batch-option\"]/h5/label/span[2]"));
        return element;
    }
    /** هذا المنتج له سعر ترويجي**/
    // //*[@id="product-form"]/div/div/div[1]/div/div[2]/div/div[15]/h5/label/span[2]
    // //*[@id="product-form"]/div/div/div[1]/div/div[2]/div/div[15]/h5/label/span[1]
    public static WebElement click_checklist4(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"product-form\"]/div/div/div[1]/div/div[2]/div/div[15]/h5/label/span[2]"));
        return element;
    }
    // //*[@id="promotion_price"]/input
    public static WebElement enter_price(WebDriver driver){
        element = driver.findElement(By.name("promotion_price"));
        return element;
    }

    // //*[@id="submit-btn"]
    // submit-btn
    public static WebElement click_add_product(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"));
        return element;
    }
    /**  ---------------------------------------------------------------deleted products -------------------------------------------------------------- **/
    public static WebElement click_deleted_products(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//input[@id='submit-btn']"));
        return element;
    }
    //
    public static WebElement clickOnProductName(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[2]/td[2]/a"));
        return element;
    }
    // //*[@id="product-data-table"]/tbody/tr[1]/td[11]/div/button
    public static WebElement click_action_button(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]/td[11]/div/button"));
        return element;
    }
    public static WebElement view_product(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]/td[11]/div/ul/li/a"));
        return element;
    }
    public static WebElement open_product_reports(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]/td[11]/div/ul/form[1]/li/button"));
        return element;
    }
    public static WebElement export_pdf(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table_wrapper\"]/div[1]/div[3]/button[1]"));
        return element;
    }
    // //*[@id="product-data-table_wrapper"]/div[1]/div[3]/button[2]
    public static WebElement export_excel(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table_wrapper\"]/div[1]/div[3]/button[2]"));
        return element;
    }
    /***************************************************************************************************/
    // //*[@id="product-data-table"]/tbody/tr[2]/td[11]/div/ul/form[2]/li/button
    public static WebElement print_barcode(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[2]/td[11]/div/ul/form[2]/li/button"));
        return element;
    }
    // //*[@id="myTable"]/tbody/tr/td[3]/input
    public static WebElement edit_quantity(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[3]/input"));
        return element;
    }

    // //*[@id="product-data-table"]/tbody/tr[1]/td[11]/div/ul/li[1]/a
    public static WebElement click_view_deleted_product(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"product-data-table\"]/tbody/tr[1]/td[11]/div/ul/li[1]/a"));
        return element;
    }
    // //*[@id="content"]/div/section/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/p
    public static WebElement copy_barcode(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/p"));
        return element;
    }
    // //*[@id="content"]/div/section/div/div/div[1]/div[2]/form[2]/button
    public static WebElement restore_product(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div/div/div[1]/div[2]/form[2]/button"));
        return element;
    }
    /**   ***************************     add transfer *******************************************************************         */
    // //*[@id="transfer-list-menu"]/a
    public static WebElement open_transfers(WebDriver driver){
        //  comment
        element = driver.findElement(By.cssSelector("#transfer-list-menu > a"));
        return element;
    }
    public static WebElement add_transfer(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[1]"));
        return element;
    }
    // //*[@id="from_warehouse_id"]
    public static WebElement click_from_warehouse(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"transfer-form\"]/div/div[2]/div/div/div[2]/div/div/button"));
        return element;
    }
    public static WebElement select_warehouse1(WebDriver driver){
        //  comment
        element = driver.findElement(By.cssSelector("#from_warehouse_id > option:nth-child(2)"));
        return element;
    }
    // //*[@id="to_warehouse_id"]
    public static WebElement click_to_warehouse(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"transfer-form\"]/div/div[2]/div/div/div[4]/div/div/button"));
        return element;
    }
    public static WebElement select_warehouse2(WebDriver driver) throws InterruptedException {
        element =driver.findElement(By.name("to_warehouse_id"));
        Select skills = new Select(element);
        int dropdown_value= driver.findElements(By.cssSelector("#to_warehouse_id > option")).size();
        System.out.println(dropdown_value);


        Random random3=new Random();
        int index= random3.nextInt(dropdown_value);
        skills.selectByIndex(index);
        System.out.println(index);
        Thread.sleep(5000);
        return element;
    }
    // //*[@id="productcodeSearch"]

    public static WebElement click_barcode_search(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"productcodeSearch\"]"));
        return element;
    }
    // //*[@id="submit-button"]
    public static WebElement save_transfer(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        return element;
    }
    // //*[@id="transfer-table"]/tbody/tr[1]/td[2]/a
    public static WebElement open_exist_transfer(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"transfer-table\"]/tbody/tr[1]/td[2]/a"));
        return element;
    }
    // //*[@id="data-length-operations"]/a[2]
    public static WebElement import_transfer(WebDriver driver){
        //  comment
        element = driver.findElement(By.xpath("//*[@id=\"data-length-operations\"]/a[2]"));
        return element;
    }
//    public static class RandomString {
//
//        private final int i;
//
//        public RandomString(int i) {
//            this.i=i;
//        }
//
//        // function to generate a random string of length n
//        static String getAlphaNumericString(int n) {
//
//            // choose a Character random from this String
//            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                    + "0123456789"
//                    + "abcdefghijklmnopqrstuvxyz";
//
//            // create StringBuffer size of AlphaNumericString
//            StringBuilder sb = new StringBuilder(n);
//
//            for (int i = 0; i < n; i++) {
//
//                // generate a random number between
//                // 0 to AlphaNumericString variable length
//                int index
//                        = (int) (AlphaNumericString.length()
//                        * Math.random());
//
//                // add Character one by one in end of sb
//                sb.append(AlphaNumericString
//                        .charAt(index));
//            }
//
//            return sb.toString();
//        }
//    }

}
