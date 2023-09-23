package components.Test;

import components.POM.DropDown_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class DropDownTest extends LoginSteps {
    DropDown_POM dropDown_pom;
    @BeforeTest
    public void Login(){
        initializeDriver();
        login();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
    }
    @Test
    public void verifyClickDropDown(){
        dropDown_pom= new DropDown_POM();
        dropDown_pom.clickDropDown();
        try{
            Thread.sleep(5000);
        }catch (Exception e){}
        dropDown_pom.clickOptionButton();
    }
    @Test
    public void verifyClickDuplicate(){
        dropDown_pom.clickDuplicateButton();
    }
    @AfterTest
    public void tearDown(){

    }
}
