package components.Test;

import components.POM.Button_POM;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class ButtonTest extends LoginSteps {
Button_POM button_pom;
    @BeforeTest
    public void loginWebsite(){
        initializeDriver();
        login();
        waitDriver(2000);
    }
    @Test(priority = 1)
    public void verifyButtonLink(){
        button_pom= new Button_POM();
        button_pom.clickButtonLink();
    }
    @Test(priority = 2)
    public void verifyButtonTitle(){
        button_pom.getButtonTitle();
        Assert.assertEquals(button_pom.getButtonTitle(),"Button","Text not matched");
    }
    @Test(priority = 3)
    public void verifySecondaryButton(){
        button_pom.getSecondaryButton();
        Assert.assertEquals(button_pom.getSecondaryButton(),"SECONDARY","Text not matched");
    }
    @Test(priority = 4)
    public void verifySuccessButton(){
        button_pom.getSuccessButton();
    }
    @AfterTest
    public void tearDown(){

    }
}
