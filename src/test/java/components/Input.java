package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Input extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        //navigate the Input element
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Input']")).click();
        //navigate Outline box and give the Input in the box

        driver.findElement(By.xpath("//input[@id='outlined-basic']")).sendKeys("Israk");
        //navigate Filled box and give the Input in the box

        driver.findElement(By.xpath("//input[@id='filled-basic']")).sendKeys("Zahan");

        //navigate Standard box and give the Input in the box

        driver.findElement(By.xpath("//input[@id='standard-basic']")).sendKeys("Monisha");

        //navigate Number box and give the Input in the box
        driver.findElement(By.xpath("//input[@id='outlined-number']")).click();




    }
}
