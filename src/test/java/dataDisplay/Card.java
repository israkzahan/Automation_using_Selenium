package dataDisplay;

import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Card extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        driver.findElement(By.xpath("//span[normalize-space()='Card']")).click();

    }
}
