package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Button_Group extends LoginSteps{
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Button Group']")).click();
        //Cypress JavaScript Button
        driver.findElement(By.xpath("//div[3]//div[2]//div[1]//button[2]")).click();
        //Two button
        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonGroup-grouped MuiButtonGroup-groupedHorizontal MuiButtonGroup-groupedContained MuiButtonGroup-groupedContainedHorizontal MuiButtonGroup-groupedContainedPrimary css-110xwq5'][normalize-space()='Two']")).click();
    }
}
