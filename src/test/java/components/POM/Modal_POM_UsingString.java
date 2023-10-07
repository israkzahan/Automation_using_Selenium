package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webElementsLogin.LoginSteps;

public class Modal_POM_UsingString extends LoginSteps {

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Modal']")
    WebElement modalLink;
    @FindBy(xpath = "//h3[normalize-space()='Modal']")
    WebElement modalTitle;
    @FindBy(xpath="//button[normalize-space()='Open modal']")
    WebElement clickOpenModal;
    @FindBy(xpath="//h2[@id='modal-modal-title']")
    WebElement openButtonText;
    @FindBy(xpath = "//p[@id='modal-modal-description']")
    WebElement openButtonText2;
    public Modal_POM_UsingString(){
        PageFactory.initElements(driver,this);
    }

    public void clickModalLink1(){
        modalLink.click();
    }
    public String modalTitleText(){
        String modalTextTitle = modalTitle.getText();
        System.out.println(modalTextTitle);
        return modalTextTitle;
    }
}
