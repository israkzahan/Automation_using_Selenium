package components.Test;

import components.POM.Alert_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class AlertTest2 extends LoginSteps{
    //create an object for alert_POM
    Alert_POM alert_pom;

    @BeforeTest
    public void Login(){
        initializeDriver();
        login();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
    }
    @Test
    public void verifyAlertText(){
        alert_pom= new Alert_POM();
        alert_pom.clickAlertLink();
        alert_pom.getAlertTitle();
    }
    @Test
    public void verifyErrorAlertText(){
        alert_pom.getErrorAlertText();
    }

    @Test
    public void verifyClickCypressButton(){
        alert_pom.clickCypressButton();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
