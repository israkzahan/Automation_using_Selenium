package components.Test;

import components.POM.Breadcrumb_POM;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webElementsLogin.Login;
import webElementsLogin.LoginSteps;

public class BreadcrumbTest extends LoginSteps  {
//create an object
    Breadcrumb_POM breadcrumb_pom;
    @BeforeTest(groups = {"smoke"})
    public void loginWebsite(){
        initializeDriver();
        login();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    @Test(priority = 1,groups = {"smoke"})
    public void verifyBreadcrumbLink(){
        breadcrumb_pom=new Breadcrumb_POM();
        Assert.assertTrue(breadcrumb_pom.getBreadcrumbLink());
    }

    @Test(priority = 2,dependsOnMethods = {"verifyBreadcrumbLink"}, groups = {"smoke"})
    public void verifyBreadcrumbTitle(){

        Assert.assertTrue(breadcrumb_pom.getBreadcrumbTitle(),"Breadcrumb");
    }
    @Test(priority = 3,groups = {"smoke"})
    public void verifyBreadcrumbText(){

        Assert.assertTrue(breadcrumb_pom.getBreadcrumbText());
    }

    @Test(priority = 4,groups = {"smoke"})
    public void verifyCypressButton(){
        Assert.assertTrue(breadcrumb_pom.clickCypressButton());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
