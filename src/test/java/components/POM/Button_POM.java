package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webElementsLogin.LoginSteps;

public class Button_POM extends LoginSteps {
    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Button']")
    WebElement buttonLink;
    @FindBy(xpath = "//h3[normalize-space()='Button']")
    WebElement buttonTitle;
    @FindBy(xpath = "//button[normalize-space()='Secondary']")
    WebElement secondaryButton;
    @FindBy(xpath = "//button[normalize-space()='Success']")
    WebElement successButton;
    @FindBy(xpath = "//button[normalize-space()='Error']")
    WebElement errorButton;

    public Button_POM(){
        PageFactory.initElements(driver,this);
    }

    public void clickButtonLink(){
        buttonLink.click();
    }

    public String getButtonTitle(){
        String buttonText= buttonTitle.getText();
        waitDriver(2000);
        System.out.println(buttonText);
        return buttonText;
    }

    public String getSecondaryButton(){
        secondaryButton.click();
        waitDriver(2000);
        String secondaryText= secondaryButton.getText();
        System.out.println(secondaryText);
        secondaryButton.click();
        return secondaryText;
    }
    public String getSuccessButton(){
        successButton.click();
        waitDriver(2000);
        String successText= successButton.getText();
        System.out.println(successText);
        successButton.click();
        return successText;
    }


}
