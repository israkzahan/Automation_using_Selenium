package google_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseUrl {
    public static WebDriver driver;
    //TestNG Annotation @BeforeTest , @Test, @After
    @BeforeTest
    public static void main(String[] args) {

        BaseUrl baseUrl= new BaseUrl();
        baseUrl.GoogleLogin();
        //baseUrl.tearDownTest();

    }
    @Test

    public void GoogleLogin(){

        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        driver.findElement(By.id("APjFqb")).sendKeys("Automation step by step");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
    }


//@AfterClass
//    public void tearDownTest(){
//        //close browser
//        driver.close();
//        driver.quit();
//        System.out.println("Test Completed Successfully");
//    }

}
