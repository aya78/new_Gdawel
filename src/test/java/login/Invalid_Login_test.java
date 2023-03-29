package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invalid_Login_test {
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //        driver=new ChromeDriver();
    }

    @Test(priority = 0,description = "login into Gadawel with correct e-mail & empty password ")
    public void LoginWithEmptyPassword() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys("");
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1,description = "login into Gadawel with Incorrect e-mail & correct password ")
    public void LoginWithInvalidEmail() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo12@gmail.com");
        login_Page.enter_pass(driver).sendKeys("12345678");
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);

    }
    @Test(priority = 2,description = "login into Gadawel with empty e-mail & correct password ")
    public void LoginWithEmptyEmail() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("");
        login_Page.enter_pass(driver).sendKeys(""+12345678);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);

    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }


}
