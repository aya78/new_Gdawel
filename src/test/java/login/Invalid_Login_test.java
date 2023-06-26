package login;

import Pages.login_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import static org.assertj.core.api.Fail.fail;

public class Invalid_Login_test {
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    public WebDriver driver;
    @BeforeClass(description = "SetUp chrome driver", alwaysRun = true)
    public void SetUp()
    {
//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //        driver=new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://gdawel.app/";
        driver.get(baseUrl);
    }
    @Test(priority = 0,description = "login into Gadawel with correct e-mail & empty password ")
    public void LoginWithEmptyPassword() throws InterruptedException {
        login_Page.click_login(driver).click();

        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");
        login_Page.enter_pass(driver).sendKeys("");
        login_Page.validlogin(driver).click();
//        Thread.sleep(2000);
        driver.wait(10000);
    }
    @Test(priority = 1,description = "login into Gadawel with Incorrect e-mail & correct password ")
    public void LoginWithInvalidEmail() throws InterruptedException {

        driver.navigate().refresh();

        login_Page.enter_email(driver).sendKeys("semo12@gmail.com");
        login_Page.enter_pass(driver).sendKeys("74108520");
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);

    }
    @Test(priority = 2,description = "login into Gadawel with empty e-mail & correct password ")
    public void LoginWithEmptyEmail() throws InterruptedException {

        driver.navigate().refresh();
        login_Page.enter_email(driver).sendKeys("");
        login_Page.enter_pass(driver).sendKeys(""+74108520);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);

    }
    private boolean isElementPresent(WebDriver driver,By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


}
