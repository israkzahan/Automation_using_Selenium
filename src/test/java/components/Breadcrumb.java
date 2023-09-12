package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Breadcrumb extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(3000);

        } catch (Exception e) {
        }
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Breadcrumb']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Cypress JavaScript']")).click();

    }
}
