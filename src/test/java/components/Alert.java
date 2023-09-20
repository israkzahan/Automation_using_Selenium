package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

import java.io.PrintStream;

public class Alert extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps=new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(4000);

        }catch(Exception e){}
        //inspect the alert link and click on the element
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Alert']")).click();

        //getting the text
        String alertTitle= driver.findElement(By.xpath("//h3[normalize-space()='Alert']")).getText();
        //print the text
        System.out.println("Title: " +alertTitle);

        //verify the alert title
        if(alertTitle.equals("Alert")){
            System.out.println("Alert title is matching!");
        } else{
            System.out.println("Alert title is not matching!");
        }

        //print the error alert text
        String errorAlert= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/div[1]/div[2]")).getText();
        System.out.println("errorAlert: " +errorAlert);
        //Verify   the error text

        if (errorAlert.equals("This is an error alert — check it out!")){
            System.out.println("The error alert text is matching!");
        } else {
            System.out.println("The error alert test is not matching! ");
        }

    }
}
