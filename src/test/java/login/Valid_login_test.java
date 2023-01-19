package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Valid_login_test{

    public WebDriver driver;

    @Test
    public void Valid_login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver = new ChromeDriver();
//       WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("http://10.10.0.50/");
        login_Page.click_login(driver).click();
        login_Page.enter_email(driver).sendKeys("semo88@gmail.com");
        login_Page.enter_pass(driver).sendKeys(""+12345678);
        login_Page.validlogin(driver).click();
        Thread.sleep(2000);
        driver.quit();

    }

}
