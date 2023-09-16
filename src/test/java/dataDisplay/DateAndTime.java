package dataDisplay;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import webElementsLogin.LoginSteps;

public class DateAndTime extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        //component
        //driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Components']")).click();


        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Data Display']")).click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}


        EventFiringWebDriver eventFiringWebDriver= new EventFiringWebDriver( driver);
        eventFiringWebDriver.executeScript("document.querySelector('#__next > div > div.MuiBox-root.css-0 > div > nav > div > div').scrollTop=700");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        //navigate the date&time element
        driver.findElement(By.xpath("//span[normalize-space()='Date & Time']")).click();
        //input the data on the Date & Time Field
        driver.findElement(By.xpath("//input[@id=':r1:']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        //driver.quit();
    }
}
