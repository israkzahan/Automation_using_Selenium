package components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import webElementsLogin.LoginSteps;

import javax.swing.*;

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
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        //navigate OPEN MODAL button
        driver.findElement(By.xpath("//button[normalize-space()='Open modal']")).click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        //press ESCAPE BUTTON from keyboard

       Actions actions= new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();




    }

}
