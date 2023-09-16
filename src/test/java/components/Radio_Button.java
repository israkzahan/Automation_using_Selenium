package components;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Radio_Button extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        // navigate the Radio button
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[8]/div[2]/span")).click();
        //click on the Female radio button
        driver.findElement(By.xpath("//input[@value='female']")).click();
        //click on Expand Global & Other Method
        driver.findElement(By.xpath("//p[normalize-space()='Expand Global Class & Other Method']")).click();

    }
}
