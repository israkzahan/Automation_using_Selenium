package components.Test;

import components.POM.CheckBox_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class CheckBoxTest extends LoginSteps {
    //Create the object
    CheckBox_POM checkBox_pom;

    @BeforeTest
    public void Login(){
        initializeDriver();
        login();
        try{
            Thread.sleep(3000);
        }catch (Exception e){}
    }

    @Test
    public void checkBoxLink(){
        checkBox_pom= new CheckBox_POM();
        checkBox_pom.clickCheckBox();

        try{
            Thread.sleep(3000);
        }catch (Exception e){}

        checkBox_pom.checkBoxText();

    }

    @Test
    public void verifyCheckBoxClickTwo(){
        checkBox_pom.checkBoxClick2();

    }

    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
