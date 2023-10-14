package webElementsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginForFB {

    public static WebDriver driver;
    public static void main(String[] args) {
        //Create an object of the class
        LoginForFB loginForFB= new LoginForFB();
        //call the initializeDriver and login method
        loginForFB.initializeDriver();
    }

    public void initializeDriver(){
        //initialize the Chrome driver

        driver= new ChromeDriver();
        //For maximizing the page
        driver.manage().window().maximize();
        //time manage implicitlyTimeWait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //navigate the url
        driver.get("https://www.facebook.com/");
    }
//    public void login(){
//        //inspect the login element and navigate the login button
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//
//        //inspect the email field and navigate the email button
//        driver.findElement(By.id("outlined-basic1")).sendKeys("israkzahan21@gmail.com");
//
//        //inspect the password field and navigate the password button
//        driver.findElement(By.id("outlined-basic2")).sendKeys("Mo90807060.");
//
//        //inspect the sign in field and navigate the sign in button
//        driver.findElement(By.xpath("//div[@class='ant-space-item']")).click();
//
//        //Verify the logout button
//        //driver.findElement(By.xpath("//div[@class='ant-space-item']")).click();
//
//    }

    public void waitDriver(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        }catch (Exception e){
//waitDriver(2000)
        }
    }
}
