package login;

import Pages.login_Page;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.converters.ExtentHtmlLogConverter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Valid_login_test{

    public WebDriver driver;
    public ExtentReports extentReports;
    public ExtentTest test;

    @Test
    public void Valid_login() throws InterruptedException {
        extentReports  = new ExtentReports("/home/hash-pc-8/Documents/vs_code/Gadawl/ExtentReports/TestReports.html",true);
//        test= Reporter.getCurrentTestResult();
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);
        options.addArguments("--remote-allow-origins=*");
        test =extentReports.startTest("verify valid  Login ");
        driver = new ChromeDriver(options);
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("/home/hash-pc-8/Documents/vs_code/Gadawl/ExtentReports/TestReports.html");
        driver.manage().window().maximize();
        driver.get("https://gdawel.app/");
        test.log(LogStatus.PASS,"browser is open and windows is maximized");
        if(login_Page.click_login(driver).isEnabled())
        {
            test.log(LogStatus.PASS,"login page is opened");
        }else
            test.log(LogStatus.FAIL,"crash in login page");
        login_Page.click_login(driver).click();



        if(login_Page.enter_email(driver).isSelected())
        {
            test.log(LogStatus.PASS,"Username is entered");
        }else
            test.log(LogStatus.FAIL,"fail to find username element");
        login_Page.enter_email(driver).sendKeys("ayak77431@gmail.com");



        if(login_Page.enter_pass(driver).isSelected())
        {
            test.log(LogStatus.PASS,"Password is entered");
        }else
            test.log(LogStatus.FAIL,"fail to find password element");
        login_Page.enter_pass(driver).sendKeys(""+74108520);



        if(login_Page.validlogin(driver).isSelected())
        {
            test.log(LogStatus.PASS,"gadawel app is open ");
        }else
            test.log(LogStatus.FAIL,"fail to find login button");
        login_Page.validlogin(driver).click();
        extentReports.endTest(test);
        extentReports.flush();
        Thread.sleep(2000);
        driver.quit();

    }

}
