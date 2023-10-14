package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webElementsLogin.LoginSteps;

import javax.xml.xpath.XPath;

public class Alert_POM_UsingString extends LoginSteps {
    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Alert']")
    WebElement alertLink;

    @FindBy(xpath = "//h3[normalize-space()='Alert']")
    WebElement alertTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/div[1]/div[2]")
    WebElement errorAlertText;

    @FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom MuiAlertTitle-root css-1jvvlz4']")
    WebElement successText;

    @FindBy(xpath = "//div[5]//div[1]//button[2]")
    WebElement cypressButton;


    //initialize the elements or declare the constructor
    public Alert_POM_UsingString() {
        PageFactory.initElements(driver, this);
    }

    //create method For alertLink
    public void clickAlertLink() {
        alertLink.click();
    }
    //return the alert title
    public String getAlertTitle(){
        String alertPageElement= alertTitle.getText();
        System.out.println(alertPageElement);
        return alertPageElement;
    }

    public String getErrorAlert(){
        String errorAlert= errorAlertText.getText();
        System.out.println(errorAlert);
        return errorAlert;
    }

    public String getSuccessText(){
        String successAlertText= successText.getText();
        System.out.println(successAlertText);
        return successAlertText;
    }

//    public String clickCypress(){
//        cypressButton.click();
//    }


}
