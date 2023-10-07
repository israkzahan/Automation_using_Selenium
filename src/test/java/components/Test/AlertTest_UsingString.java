package components.Test;


import components.POM.Alert_POM_UsingString;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class AlertTest_UsingString extends LoginSteps {
    //create an object for alert_POM
    Alert_POM_UsingString alert_pom_usingString;

    @BeforeTest
    public void LoginClick() {
        initializeDriver();
        login();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    @Test(priority = 1)
    public void verifyAlertText() {
        alert_pom_usingString = new Alert_POM_UsingString();
        alert_pom_usingString.clickAlertLink();
        Assert.assertEquals(alert_pom_usingString.getAlertTitle(), "Alert", "Not Matched");

    }
    @Test(priority = 2)
    public void verifyErrorAlertText(){
        Assert.assertEquals(alert_pom_usingString.getErrorAlert(),"This is an error alert — check it out!");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    @Test(priority = 3)
    public void verifySuccessText(){
        Assert.assertEquals(alert_pom_usingString.getSuccessText(),"Success","Not Matched");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
