package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Select extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        //navigate the Select element
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Select']")).click();

        //click on the CYPRESS JAVASCRIPT button
        driver.findElement(By.xpath("//button[normalize-space()='Cypress JavaScript']")).click();

        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        //navigate the AGE dropdown box
        driver.findElement(By.xpath("//div[@id='demo-simple-select']")).click();
      //select the age
        driver.findElement(By.xpath("//li[normalize-space()='Twenty']")).click();

        System.out.println("Age Selected");

    }
}
