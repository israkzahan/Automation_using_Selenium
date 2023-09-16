package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class DropDown extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        //navigate the DropDown button
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='DropDown']")).click();
        //click the OPTIONS button
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        //expand the OPTIONS button
        driver.findElement(By.xpath("//*[@id=\"demo-customized-button\"]")).click();
        //Duplicate
        String expectedText= "Duplicate";
        String actualText= driver.findElement(By.xpath("//li[normalize-space()='Duplicate']")).getText();
        if (expectedText.equals(actualText)){
            System.out.println("Duplicate option is matching");
        }else{
            System.out.println("Duplicate option is not matching");
        }
        //driver.quit();




        String expectedText= "Duplicate";
        String actualText= driver.findElement(By.xpath("//li[normalize-space()='Duplicate']")).getText();
        if (expectedText.equals(actualText)){
            System.out.println("Duplicate option is matching!");
        }else{
            System.out.println("Duplicate option is not matching!");
        }

        driver.quit();


    }
}
