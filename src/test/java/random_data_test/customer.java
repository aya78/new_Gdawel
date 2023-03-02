package random_data_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class customer {
    private String firstName;
    private  String name;
    private  String cost;

    private String lastName;
    private String interests;
    private String phoneNumber;
    private String email;
    private String address;
    private String joinedDate;
    private static WebElement element=null;
    private String designation;
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getInterests() {
        return interests;
    }
    public void setInterests(String interests) {
        this.interests = interests;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getJoinedDate() {
        return joinedDate;
    }
    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public static WebElement select_country(WebDriver driver) throws InterruptedException {
        element =driver.findElement(By.name("Country"));
        Select skills = new Select(element);
        int dropdown_value= driver.findElements(By.cssSelector("#country > option")).size();
        System.out.println(dropdown_value);

        Random random3=new Random();
        int index= random3.nextInt(dropdown_value);
        skills.selectByIndex(index);
        System.out.println(index);
        Thread.sleep(5000);
        return element;
    }
}
