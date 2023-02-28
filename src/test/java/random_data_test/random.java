package random_data_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

public class random {

//    @BeforeTest
//    public void generateData(){
//
//    }
    @Test
    public void registerEmployee() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();

        for (int i =0 ; i <5 ; i++){
            customer c=new customer();
            Faker fakeData=new Faker();
            c.setFirstName(fakeData.name().firstName());
            c.setLastName(fakeData.name().lastName());
            c.setInterests(fakeData.internet().domainWord());
            c.setPhoneNumber(fakeData.phoneNumber().cellPhone());
            c.setEmail(fakeData.internet().emailAddress());
            c.setDesignation(fakeData.job().position());
            System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
            WebDriver driver=new ChromeDriver();
            driver.get("https://sajithatharaka.github.io/employee_registration/default/basic_details.html");
            driver.findElement(By.id("fname")).sendKeys(c.getFirstName());
            driver.findElement(By.id("lname")).sendKeys(c.getLastName());
            driver.findElement(By.id("interest")).sendKeys(c.getInterests());
            driver.findElement(By.xpath("//a[text()='Next']")).click();
            driver.findElement(By.id("phone")).sendKeys(c.getPhoneNumber());
            driver.findElement(By.id("email")).sendKeys(c.getEmail());
            driver.findElement(By.xpath("//a[text()='Next']")).click();
            driver.findElement(By.id("designation")).sendKeys(c.getDesignation());
            driver.findElement(By.xpath("//a[text()='Next']")).click();
            Thread.sleep(1000);
        }

    }
}
