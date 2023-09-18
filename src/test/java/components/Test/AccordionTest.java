package components.Test;

import components.POM.Accordion_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class AccordionTest extends LoginSteps {

    //create an object for accordion_POM
    Accordion_POM accordion_pom;


    //declare the annotation
    @BeforeTest
    public void login(){

        initializeDriver();
        login();
    }

    @Test
    public  void verifyAccordion(){
        accordion_pom= new Accordion_POM();
        accordion_pom.clickAccordionLink();


    }

    @AfterTest
    public void quitDriver(){

        driver.quit();
    }


}
