package components.Test;

import components.POM.Facebook_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginForFB;
import webElementsLogin.LoginSteps;

public class FacebookTest extends LoginForFB {
    Facebook_POM facebook_pom;

    @BeforeTest
    public void login(){
        initializeDriver();
        waitDriver(2000);
    }
    @Test(priority = 1)
    public void verifyFacebookLogin(){
        facebook_pom= new Facebook_POM();
        facebook_pom.inputData();
        waitDriver(3000);
    }

    @Test(priority = 2)
    public void verifyErrorText(){
        facebook_pom.wrongPassword();
    }

    @AfterTest
    public void tearDown(){

    }
}
