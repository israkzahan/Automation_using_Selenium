package components.Test;

import components.POM.Modal_POM;
import components.POM.Modal_POM_UsingString;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class ModalTestUsingString extends LoginSteps {
    Modal_POM_UsingString modal_pom_usingString;
    @BeforeTest
    public void Login(){
        initializeDriver();
        login();
        waitDriver(2000);
    }
    @Test(priority = 1)
    public void verifyModalLink(){
       modal_pom_usingString= new Modal_POM_UsingString();
       modal_pom_usingString.clickModalLink1();
       waitDriver(2000);
    }

    @Test(priority = 2)
    public void verifyModalTitle(){
        Assert.assertEquals(modal_pom_usingString.modalTitleText(),"Modal"," Not Matched");
    }
    @AfterTest
    public void tearDown(){

    }

}
