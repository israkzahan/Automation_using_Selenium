package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Navbar extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        //navigate OPEN Navbar elements
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Navbar']")).click();
        //click on OPEN LOGO button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/header/div/div/a[1]")).click();
        //click on OPEN BLOG button
        //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/header/div/div/div[2]/button[3]")).click();

    }

}
