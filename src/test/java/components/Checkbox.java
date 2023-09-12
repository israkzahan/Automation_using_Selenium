package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Checkbox extends LoginSteps {


    public static void main(String[] args) {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Checkbox']")).click();
        //click on the second checkbox
        driver.findElement(By.xpath("(//input[@aria-label='Checkbox demo'])[2]")).click();
        //heart icon
        driver.findElement(By.xpath("(//input[@aria-label='Checkbox demo'])[5]")).click();
        //6th icon
        driver.findElement(By.xpath("(//input[@aria-label='Checkbox demo'])[6]")).click();

    }
}
