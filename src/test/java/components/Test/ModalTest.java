package components.Test;

import components.POM.Modal_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class ModalTest extends LoginSteps {
    Modal_POM modal_pom;
    @BeforeTest
    public void driverInitialize(){
        initializeDriver();
        waitDriver(2000);
    }

    @Test(priority = 1)
    public void successLogin(){
        login();
        waitDriver(2000);
    }
    @Test(priority = 2,dependsOnMethods = {"successLogin"})
    public void verifyModalLink(){
        modal_pom=new Modal_POM();
        modal_pom.clickModalButton();
        waitDriver(2000);
        modal_pom.getModalTitle();
    }

    @Test(priority = 3, dependsOnMethods = {"successLogin"})
    public void verifyOpenModalButton(){
        modal_pom.clickOpenModalButton();
        modal_pom.getOpenModalText();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}
