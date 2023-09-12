package webElementsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;
    public static void main(String[] args) {

        String projectPath= System.getProperty("user.dir");
        System.out.println(projectPath);
        //Create an object of the class
        LoginSteps loginSteps=new LoginSteps();
        //call the initializeDriver and login method
        loginSteps.initializeDriver();
        loginSteps.login();
    }

    public void initializeDriver(){
        //initialize the edge driver

        driver= new ChromeDriver();
        //For maximizing the page
        driver.manage().window().maximize();
        //time manage implicitlyTimeWait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //navigate the url
        driver.get("https://automation.ts4u.us/");
    }
    public void login(){
        //inspect the login element and navigate the login button
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //inspect the email field and navigate the email button
        driver.findElement(By.id("outlined-basic1")).sendKeys("israkzahan21@gmail.com");

        //inspect the password field and navigate the password button
        driver.findElement(By.id("outlined-basic2")).sendKeys("Mo90807060.");

        //inspect the sign in field and navigate the sign in button
        driver.findElement(By.xpath("//div[@class='ant-space-item']")).click();

        //Verify the logout button
        //driver.findElement(By.xpath("//div[@class='ant-space-item']")).click();

    }
}
