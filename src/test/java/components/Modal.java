package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Modal extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        //navigate the Input element
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Modal']")).click();
        //navigate OPEN MODAL button
        driver.findElement(By.xpath("//button[normalize-space()='Open modal']")).click();
    }

}
