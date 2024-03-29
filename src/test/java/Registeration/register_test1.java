package Registeration;

import Pages.product_page;
import Pages.register_Page;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class register_test1 {
    String Tax= RandomStringUtils.random(15, false, true);
    String Traditional = RandomStringUtils.random(20, false, true);
    String Email_c = RandomStringUtils.random(6, true, true);
//    String random_c_name = RandomStringUtils.random(10, true, false);
    String random = RandomStringUtils.random(20, true, true);
    String person_name = RandomStringUtils.random(6, true, false);
    String email_n = RandomStringUtils.random(3, false, true);
    String personal_phone = RandomStringUtils.random(10, false, true);
    String random_password = RandomStringUtils.random(10, true, true);
    String random_string = RandomStringUtils.random(6, true, false);
    String email;

    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //        driver=new ChromeDriver();
    }

    @Test(priority = 0)
    public void Register_Step1() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://gdawel.app/");
        register_Page.click_register(driver).click();

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[2]/div/div[1]/div/select/option[2]")));
        // Print the first result
        System.out.println(firstResult.getText());
        /** ********************************************Step  1***********************************************************/
        register_Page.click_country1(driver).click();
        register_Page.click_plan1(driver).click();
        register_Page.click_personal_account(driver).click();
        register_Page.click_next1(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void Register_Step2() throws InterruptedException {
        product_page object =new product_page();
        Faker fakeData=new Faker();

        object.setName(fakeData.name().name());
       ;
        /** ********************************************Step  2***********************************************************/
        register_Page.enter_name(driver).sendKeys(object.getName());
//        String var = register_Page.enter_name(driver).getText();
        register_Page.enter_Email(driver).sendKeys("beraho6297@jwsuns.com");
         email = object.getEmail();
        register_Page.enter_personal_Phone(driver).sendKeys("01241258963");
        String password="123456789";
        register_Page.enter_Password(driver).sendKeys(password);
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='xxxxxxxx']")));
//        System.out.println(random_password);
//        String repeat_pass = register_Page.enter_Password(driver).getText();
//        System.out.println("teeeeeeee"+repeat_pass);
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.name("password_confirmation")));
//        // Print the first result
//        System.out.println(firstResult.getText());
        register_Page.repeat_Password(driver).sendKeys(password);
        register_Page.click_next2(driver).click();
//        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void Register_Step3() throws InterruptedException {
        product_page object =new product_page();

        Faker fakeData=new Faker();
      Thread.sleep(2000);
        /** ***********************************************Step 3************************************************************************/
        register_Page.enter_company_name(driver).sendKeys(fakeData.company().name());
        register_Page.enter_manager_name(driver).sendKeys(fakeData.name().name());
        register_Page.enter_company_email(driver).sendKeys("beraho6297@jwsuns.com");

        register_Page.enter_company_number(driver).sendKeys("01241258963");
        // 15 digits
        register_Page.enter_TaxNumber(driver).sendKeys(fakeData.number().digits(15));
        // 20 digits
//        register_Page.enter_CommercialRegistration(driver).sendKeys(fakeData.number().digits(20));
        register_Page.enter_CommercialRegistration(driver).sendKeys(random);

//        register_Page.select_state(driver);
//        WebElement fResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.name("state_id")));
//        // Print the first result
//        System.out.println(fResult.getText());
//        register_Page.select_city(driver);
        register_Page.click_state1(driver).click();
        register_Page.click_city1(driver).click();
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/form/div[1]/div/div[4]/div[1]/div/input")));
//        register_Page.enter_first_address(driver).click();
        register_Page.enter_first_address(driver).sendKeys(fakeData.address().fullAddress());
//        register_Page.enter_second_address(driver).sendKeys(""+random_string);
//        WebElement cResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button'])[3]")));
        register_Page.click_next3(driver).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void Register_Step4() throws InterruptedException{
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fw-bold fs-3']")));
        // Print the first result
        System.out.println(firstResult.getText());
        /** ********************************************Step  4***********************************************************/
        register_Page.select_sizeOfTeam1(driver).click();
        register_Page.click_c_work1(driver).click();
//      register_Page.select_company_activities(driver).sendKeys(Keys.RETURN);

        // click the "UploadFile" button
        register_Page.upload_c_image(driver).sendKeys("/home/hash-pc-8/Downloads/company.jpeg");
        //select random value from radio button
//        List<WebElement> options = driver.findElements(By.xpath("//*[starts-with(@id, 'Q11_')]")) ;
//        Random random = new Random();
//        int index = random.nextInt(options.size());
//        options.get(index).click();
        register_Page.click_company_type1(driver).click();
        WebElement v = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='شركة خاصة']")));
        // Print the first result
        System.out.println(v.getText());
        register_Page.click_next4(driver).click();

        Thread.sleep(2000);
    }
//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
