package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_Page {
    private static WebElement element=null;
    // public int randomInt;
    static WebDriver driver = null;

    public login_Page(WebDriver driver) {
        this.driver = driver;
    }
    //email
    public static WebElement click_login(WebDriver driver){
         element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[1]"));
        return element;
    }
    public static WebElement enter_email(WebDriver driver){
        element = driver.findElement(By.name("email"));
        return element;
    }
    public static WebElement enter_pass(WebDriver driver){
        element = driver.findElement(By.name("password"));
        return element;
    }
    public static WebElement validlogin(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(@class,'btn btn-solid-main')]"));
        return element;
    }

}
