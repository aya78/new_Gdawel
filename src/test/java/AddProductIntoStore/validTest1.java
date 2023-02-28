package AddProductIntoStore;

import login.login_Page;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;
import java.io.File;

import static org.codehaus.plexus.util.FileUtils.cleanDirectory;
import static org.codehaus.plexus.util.FileUtils.waitFor;
/**  طريقه الضرايب ضريبه حصريه و الضريبه مضافه* */

public class validTest1 {
    String random_number = RandomStringUtils.random(5, false, true);
    String random_barcode = RandomStringUtils.random(8, false, true);

     public String random_string = RandomStringUtils.random(6, true, false);

    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void Valid_login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("" + 12345678);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void open_products_page() throws InterruptedException {
        product_page.clickOnSideMenu(driver).click();
        product_page.clickOnProducts(driver).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void add_product_page() throws InterruptedException {

        product_page.clickAddProduct(driver).click();

        Thread.sleep(2000);
        product_page.enterProductName(driver).sendKeys(""+random_string);
        product_page.select_brand(driver).click();
//        product_page.click_barcode_generator(driver).click();

        product_page.select_barcode(driver).sendKeys("" + random_barcode);
        System.out.println(random_barcode);
        product_page.click_classification(driver).click();
        product_page.click_quantity(driver).sendKeys("10");
        product_page.click_product_unit(driver).click();
        product_page.click_product_cost(driver).sendKeys(""+random_number);
        Thread.sleep(2000);
        product_page.click_Product_selling_price(driver).sendKeys(""+random_number);
        product_page.click_additional_Tax(driver).click();
//        product_page.upload_product_img(driver).sendKeys("/home/hash-pc-8/Downloads/iphone.jpeg");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute('style', arguments[1])",driver.findElement(By.xpath("//input[@type='file']")), "0");
//        js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
//        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("Your Path to the file your system");
        File file = new File("iphone.jpeg");
//        product_page.upload_product_img(driver).sendKeys(file.getAbsolutePath());
//        Thread.sleep(2000);
//
////        driver.findElement(By.id("imageUpload")).sendKeys("zara.jpeg");
////        driver.findElement(By.id("file-submit")).submit();
//        if(driver.getPageSource().contains("File Uploaded!")) {
//            System.out.println("file uploaded");
//        }
//        else{
//            System.out.println("file not uploaded");
//        }
        Thread.sleep(2000);

        Actions a = new Actions(driver);
        //scroll down a page
//        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        //scroll up a page
        a.sendKeys(Keys.PAGE_UP).build().perform();
        product_page.click_add_product(driver).click();
        Thread.sleep(2000);
        // comment
    }
    @Test(priority = 3)
    public void search_product_page() throws InterruptedException {
        String message = "Product created successfully\n";
//      new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlMatches("http://10.10.0.50/products"));
//      new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.javaScriptThrowsNoExceptions("ddd"));
//        new WebDriverWait(product_page.clickAddProduct(driver).isSelected("",), Duration.ofSeconds(20));
        product_page.clickOnSearch(driver).sendKeys(""+random_barcode);
//      Assert.("product is added successfully");
        Thread.sleep(2000);
    }
    private void waitFor(String s) {

    }
//    @Test(priority = 1)
//    public void Register_Step2() throws InterruptedException {
//
//        // Step 2
//        register_Page.enter_name(driver).sendKeys("" + person_name + " " + person_name);
////        String var = register_Page.enter_name(driver).getText();
//        register_Page.enter_Email(driver).sendKeys("" + person_name + email_n + "@gmail.com");
//        register_Page.enter_personal_Phone(driver).sendKeys("0" + personal_phone);
//        register_Page.enter_Password(driver).sendKeys("123456789");
////        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='xxxxxxxx']")));
////        System.out.println(random_password);
////        String repeat_pass = register_Page.enter_Password(driver).getText();
////        System.out.println("teeeeeeee"+repeat_pass);
////        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.elementToBeClickable(By.name("password_confirmation")));
////        // Print the first result
////        System.out.println(firstResult.getText());
//        register_Page.repeat_Password(driver).sendKeys("123456789");
//        register_Page.click_next2(driver).click();
////        Thread.sleep(2000);
//    }
//    @Test(priority = 2)
//    public void Register_Step3() throws InterruptedException {
//
//        Thread.sleep(2000);
//        // Step 3
//        register_Page.enter_company_name(driver).sendKeys("" + random_string + " " + random_string);
//        register_Page.enter_manager_name(driver).sendKeys("" + random_manager_n + " " + random_manager_n);
//        register_Page.enter_company_email(driver).sendKeys("" + random_string + "@" + random_string + ".com");
//        register_Page.enter_company_number(driver).sendKeys("0" + personal_phone);
//        register_Page.enter_TaxNumber(driver).sendKeys("" + Tax);
//        register_Page.enter_CommercialRegistration(driver).sendKeys("" + Traditional);
////        register_Page.select_state(driver);
////        WebElement fResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.elementToBeClickable(By.name("state_id")));
////        // Print the first result
////        System.out.println(fResult.getText());
////        register_Page.select_city(driver);
//        register_Page.click_state2(driver).click();
//        register_Page.click_city2(driver).click();
////        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/form/div[1]/div/div[4]/div[1]/div/input")));
////        register_Page.enter_first_address(driver).click();
//        register_Page.enter_first_address(driver).sendKeys("ddddd");
////        register_Page.enter_second_address(driver).sendKeys(""+random_string);
////        WebElement cResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button'])[3]")));
//        register_Page.click_next3(driver).sendKeys(Keys.RETURN);
//        Thread.sleep(2000);
//    }
//    @Test(priority = 3)
//    public void Register_Step4() throws InterruptedException{
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fw-bold fs-3']")));
//        // Print the first result
//        System.out.println(firstResult.getText());
//        // Step4
//        register_Page.select_sizeOfTeam2(driver).click();
//        register_Page.click_c_work2(driver).click();
////        register_Page.select_company_activities(driver).sendKeys(Keys.RETURN);
//        // click the "UploadFile" button
//        register_Page.upload_c_image(driver).sendKeys("/home/hash-pc-8/Downloads/H&M.jpg");
//
//        register_Page.click_company_type2(driver).click();
//        WebElement v = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='شركة خاصة']")));
//        // Print the first result
//        System.out.println(v.getText());
//        register_Page.click_next4(driver).click();
//        Thread.sleep(2000);
//    }

}
