package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register_Page {
    private static WebElement element=null;
    // public int randomInt;
    static WebDriver driver ;
    public register_Page() {
        this.driver = driver;
    }
    //email
    public static WebElement click_register(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(@class,'btn btn-warn')]"));
        return element;
    }
    // //*[@id="register_stepper"]/form/div[1]/div/div[2]/div/div[1]/div/select/option[2]
    public static WebElement click_country1(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[2]/div/div[1]/div/select/option[2]"));
        return element;
    }
    public static WebElement click_country2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(1) > div > select > option:nth-child(3)"));
        return element;
    }
    // #register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(1) > div > select
    // #register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(1) > div > select > option:nth-child(2)
//    public static WebElement select_country(WebDriver driver){
//        element =driver.findElement(By.id("country"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("//label[@class='form-label fs-6']/following-sibling::select")).size();
//        System.out.println(dropdown_value);
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////      Thread.sleep(1000);
//        return element;
//    }
    // //*[@id="register_stepper"]/form/div[1]/div/div[2]/div/div[2]/div/select/option[2]
    public static WebElement click_plan1(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[2]/div/div[2]/div/select/option[2]"));
        return element;
    }
    // #register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(2) > div > select > option:nth-child(3)

    public static WebElement click_plan2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(2) > div > select > option:nth-child(3)"));
        return element;
    }
    //plan
//    public static WebElement select_plan(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("plan"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(2) > div > select > option")).size();
//        System.out.println(dropdown_value);
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////      Thread.sleep(1000);
//        return element;
//    }

    // #register_stepper > form > div.mb-5 > div > div.fv-row.fv-plugins-icon-container > div > div:nth-child(2) > div > select
    public static WebElement click_personal_account(WebDriver driver){
        element = driver.findElement(By.xpath("//label[@for='kt_create_account_form_account_type_personal']"));
        return element;
    }
    // //span[text()='حساب شركة']
    public static WebElement click_company_account(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='حساب شركة']"));
        return element;
    }
    // (//button[@type='button'])[2]
    public static WebElement click_next1(WebDriver driver){
        element = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        return element;
    }
    public static WebElement enter_name(WebDriver driver){
        element = driver.findElement(By.id("name"));
        return element;
    }
    public static WebElement enter_Email(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-642d547434aea\"]"));
        return element;
    }
    public static WebElement enter_personal_Phone(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-642d547434bdd\"]"));
        return element;
    }
    public static WebElement enter_Password(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"input-642d547437e1a\"]"));
        return element;
    }
    // (//input[@type='password'])[2]
    public static WebElement repeat_Password(WebDriver driver){
        element = driver.findElement(By.name("password_confirmation"));
        return element;
    }
    public static WebElement enter_invitation_code(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@placeholder='كود دعوة']"));
        return element;
    }
    public static WebElement click_next2(WebDriver driver){
        element = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        return element;
    }
    // //div[@class=' mb-5']//input
    public static WebElement enter_company_name(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class=' mb-5']//input"));
        return element;
    }
    // (//div[@class=' mb-5']//input)[2]
    public static WebElement enter_manager_name(WebDriver driver){
        element = driver.findElement(By.xpath("(//div[@class=' mb-5']//input)[2]"));
        return element;
    }

    // //input[@type='email']
    public static WebElement enter_company_email(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@type='email']"));
        return element;
    }

    // //input[@type='number']
    public static WebElement enter_company_number(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@type='number']"));
        return element;
    }

    // (//input[@type='number'])[2]
    //15 digits
    public static WebElement enter_TaxNumber(WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
        return element;
    }

    // (//input[@type='number'])[3]
    // 20 digits
    public static WebElement enter_CommercialRegistration(WebDriver driver){
        element = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
        return element;
    }
    // //*[@id="register_stepper"]/form/div[1]/div/div[3]/div[1]/div/select/option[3]
    public static WebElement click_state1(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[3]/div[1]/div/select/option[3]"));
        return element;
    }
    // #register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(1) > div > select > option:nth-child(4)
    public static WebElement click_state2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(1) > div > select > option:nth-child(4)   "));
        return element;
    }
    //state_id
    // #register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(1) > div > select > option:nth-child(4)
//    public static WebElement select_state(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("state_id"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(1) > div > select > option")).size();
//        System.out.println(dropdown_value);
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////      Thread.sleep(1000);
//        return element;
//    }

    public static WebElement click_city1(WebDriver driver){
            element = driver.findElement(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[3]/div[2]/div/select/option[17]"));
            return element;
    }
    // #register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(2) > div > select > option:nth-child(5)
    public static WebElement click_city2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(2) > div > select > option:nth-child(5)"));
        return element;
    }

    //city_id
    // #register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(2) > div > select > option:nth-child(4)
//    public static WebElement select_city(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("city_id"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#register_stepper > form > div.mb-5 > div > div:nth-child(3) > div:nth-child(2) > div > select > option")).size();
//        System.out.println(dropdown_value);
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////      Thread.sleep(1000);
//        return element;
//    }

    // //input[@placeholder='Address 1']
    public static WebElement enter_first_address(WebDriver driver){

        element = driver.findElement(By.name("company_addresses.0"));
        return element;
    }

    // //label[text()[normalize-space()='العنوان الثاني']]/following::input
//    public static WebElement enter_second_address(WebDriver driver){
//        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/form/div[1]/div/div[4]/div[2]/div/input"));
//        return element;
//    }
    public static WebElement click_next3(WebDriver driver){
        element = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-')])[2]"));
        return element;
    }
    // //span[@class='fw-bold fs-3']
    public static WebElement select_sizeOfTeam1(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='fw-bold fs-3']"));
        return element;
    }
    public static WebElement select_sizeOfTeam2(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='2-10']"));
        return element;
    }
    public static WebElement click_c_work1(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.row > div:nth-child(1) > div:nth-child(2) > select > option:nth-child(4)"));
        return element;
    }
    public static WebElement click_c_work2(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.row > div:nth-child(1) > div:nth-child(2) > select > option:nth-child(7)"));
        return element;
    }
    //company_activity
    // #register_stepper > form > div.mb-5 > div > div.row > div:nth-child(1) > div:nth-child(2) > select > option:nth-child(3)
//    public static WebElement select_company_activities(WebDriver driver) throws InterruptedException {
//        element =driver.findElement(By.id("company_activity"));
//        Select skills = new Select(element);
//        int dropdown_value= driver.findElements(By.cssSelector("#register_stepper > form > div.mb-5 > div > div.row > div:nth-child(1) > div:nth-child(2) > select > option")).size();
//        System.out.println(dropdown_value);
//
//        Random random2=new Random();
//        int index= random2.nextInt(dropdown_value);
//
//        skills.selectByIndex(index);
//        System.out.println(" count"+index);
////      Thread.sleep(1000);
//        return element;
//    }
    public static WebElement upload_c_image(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"register_stepper\"]/form/div[1]/div/div[2]/div[1]/div[3]/div/div/label/input[1]"));
        return element;
    }
    // //span[text()='شركة خاصة']
    public static WebElement click_company_type1(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='شركة خاصة']"));
        return element;
    }
    public static WebElement click_company_type2(WebDriver driver){
        element = driver.findElement(By.xpath("//span[text()='شركة المساهمة']"));
        return element;
    }
    // (//button[@type='button'])[3]
    public static WebElement click_next4(WebDriver driver){
        element = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        return element;
    }



}
