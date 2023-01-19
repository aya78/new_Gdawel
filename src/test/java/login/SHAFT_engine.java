package login;

//import org.testng.annotations.AfterMethod;
//import com.shaft.driver.SHAFT;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Story;
//import io.qameta.allure.TmsLink;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class SHAFT_engine {
//    private  SHAFT.GUI.WebDriver driver;
//    private SHAFT.TestData.JSON testData;
//
//    @Epic("SHAFT Web GUI Template")
//    @Story("Google Basic Validations")
//    @TmsLink("TC-001")
//    @Description("Given I am on the Home page,\nThen the browser title should be 'Google'.")
//    @Test(description = "Check that Home Page Title is correct.")
//    public void checkHomePageTitleIsCorrect() {
//        new Home(driver).verifyBrowserTitleIsCorrect();
//    }
//
//    @Epic("SHAFT Web GUI Template")
//    @Story("Google Basic Validations")@TmsLink("TC-002")
//    @Description("Given I am on the Home page,\nWhen I search for a valid query,\nThen the result stats will show some data (will not be empty).")
//    @Test(description = "Check that Result Stats is not empty after searching for a query.")
//    public void checkResultStatsIsNotEmptyAfterSearchingForAQuery() {
//        new Home(driver).searchForQuery(testData.getTestData("searchQuery"))
//                .assertResultStatsIsNotEmpty();
//    }
//
//    @BeforeClass(description = "Setup Test Data.")
//    public void beforeClass(){
//        testData = new SHAFT.TestData.JSON("simpleJSON.json");
//    }
//
//    @BeforeMethod(description = "Setup Browser instance.")
//    public void beforeMethod() {
//        driver = new SHAFT.GUI.WebDriver();
//        new Home(driver).navigate();
//    }
//
//    @AfterMethod(description = "Teardown Browser instance.")
//    public void afterMethod() {
//        driver.quit();
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//}
//package guru99_demo;
//
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.support.ui.Select;
//
//        import java.util.Random;
//
//public class Payment_Gateway {
//    private static WebElement element=null;
//    // public int randomInt;
//    final WebDriver driver;
//
//    public Payment_Gateway(WebDriver driver) {
//        this.driver = driver;
//    }
//
//
//    public static WebElement select_Quantity(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.name("quantity"));
//
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#three > div > form > div > div.\\31 u.\\31 2u\\$\\(small\\).select-wrapper > select > option")).size();
//        System.out.println(dropdown_value);
//        element.click();
//
//        Random random3=new Random();
//        int index= random3.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(index);
//        Thread.sleep(5000);
//        element.click();
//        return element;
//    }
//    public static WebElement button_click(WebDriver driver){
//        element =driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input"));
//        return element;
//    }
//
//    public static WebElement write_num(WebDriver driver){
//        element=driver.findElement(By.id("card_nmuber"));
//        return element;
//    }
//    public static WebElement select_month(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("month"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#month > option")).size();
//        System.out.println(dropdown_value);
//        element.click();
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////         Thread.sleep(1000);
//        return element;
//    }
//    public static WebElement select_year(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("year"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector(" #year > option")).size();
//        System.out.println("size"+dropdown_value);
//        element.click();
//
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(index);
////        Thread.sleep(1000);
//        return element;
//    }
//
//    public static WebElement write_code(WebDriver driver){
//        element=driver.findElement(By.xpath("//*[@id=\"cvv_code\"]"));
//        return element;
//    }
//    public static WebElement button_click2(WebDriver driver){
//        element=driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input"));
//        return element;
//    }
//
//}
/////////////////////////////////////////////////////////////////////////////////////////////
//package guru99_demo;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//    public class paymentGatewayTest {
//        private WebDriver driver=null;
//
//        @BeforeTest
//        public void SetUp(){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        @Test
//        public void Guru99_demo() throws InterruptedException {
//
//            String random1 = RandomStringUtils.random(16, false, true);
//
//            String r = RandomStringUtils.random(3, 1,100,false ,true);
//            //Integer random2 = TestRandomBigInteger.random(3, false, true);
//
//            System.out.println(random1);
//            System.out.println(r);
//
//            driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
//            driver.manage().window().maximize();
//            Payment_Gateway.select_Quantity(driver);
//            //click on  search button
//            //another solution
//            Payment_Gateway.button_click(driver).sendKeys(Keys.RETURN);
//            //////////////////////////////////
////        // Switching to Alert
////        Alert alert = driver.switchTo().alert();
////        // Capturing alert message.
////        String alertMessage= driver.switchTo().alert().getText();
////        // Displaying alert message
////        System.out.println(alertMessage);
////        Thread.sleep(5000);
////
////        // Accepting alert
////        alert.accept();
///////////////////////////////////////////////////
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//
//            Payment_Gateway.write_num(driver).sendKeys("" + random1);
////        new Actions(driver)
////             .moveToElement(Payment_Gateway.write_num(driver))
////                .pause(Duration.ofSeconds(1))
////                .clickAndHold()
////                .pause(Duration.ofSeconds(1))
////                .sendKeys("1234567891234567")
////                .perform();
//
//            Payment_Gateway.select_month(driver);
//
//            Payment_Gateway.select_year(driver);
//            Payment_Gateway.write_code(driver).sendKeys("" + r);
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//            Payment_Gateway.button_click2(driver).sendKeys(Keys.RETURN);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//
//        }
//        @AfterTest
//        public void TearDownTest()
//        {
//            //CLOSE DRIVER
//            driver.quit();
//            System.out.println("test complete successfully");
//
//        }
//
//    }
}