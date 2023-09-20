package components.Test;

import components.POM.Accordion_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.LoginSteps;

public class AccordionTest extends LoginSteps  {

    //create an object for accordion_POM
    Accordion_POM accordion_pom;

    //declare the annotation
    @BeforeTest
    public void loginTest(){
        initializeDriver();
        login();
        try{
            Thread.sleep(3000);

        }catch(Exception e){}
    }

    @Test
    public void verifyAccordion(){
        accordion_pom= new Accordion_POM();
        accordion_pom.clickAccordionLink();
        accordion_pom.verifyAccordionTitle();
        try{
            Thread.sleep(3000);

        }catch(Exception e){}

        accordion_pom.verifyAccordionText();

    }

    @AfterTest
    public void tearDown(){
       // driver.quit();

    }



}
