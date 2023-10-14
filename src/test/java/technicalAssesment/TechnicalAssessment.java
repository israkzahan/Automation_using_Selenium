package technicalAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;


public class TechnicalAssessment {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //For maximizing the page
        driver.manage().window().maximize();
        //time manage implicitlyTimeWait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://automation.ts4u.us/");

        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Modal']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Open modal']")).click();



    }
}
