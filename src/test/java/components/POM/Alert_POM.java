package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class Alert_POM extends LoginSteps {

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Alert']")
    WebElement alertLink;

    @FindBy(xpath = "//h3[normalize-space()='Alert']")
    WebElement alertTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/div[1]/div[2]")
    WebElement errorAlertText;

    @FindBy(xpath = "//div[5]//div[1]//button[2]")
    WebElement cypressButton;


    //initialize the elements or declare the constructor
    public Alert_POM() {
        PageFactory.initElements(driver, this);
    }

    //create method For alertLink
    public void clickAlertLink() {
        alertLink.click();
    }

    //create method For alertTitle
   public void getAlertTitle() {
       String alertPageTitle = alertTitle.getText();
        System.out.println(alertPageTitle);
        Assert.assertEquals(alertPageTitle, "Alert", "Expected text 'Alert' is not matching ");
    }

    //create method for errorAlertText
    public void getErrorAlertText(){
        String errorAlertPageText= errorAlertText.getText();
        System.out.println(errorAlertPageText);
        Assert.assertEquals(errorAlertPageText,"This is an error alert — check it out!"," Error text is not matching with 'This is an error alert — check it out!'");
    }

    //create method for CYPRESS JAVASCRIPT button
    public void clickCypressButton(){
        cypressButton.click();
        //System.out.println("Button clicked");
    }


}
