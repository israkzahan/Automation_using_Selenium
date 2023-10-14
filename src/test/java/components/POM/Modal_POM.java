package components.POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class Modal_POM extends LoginSteps {
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[11]/div[2]/span")
    WebElement modalLink;
    @FindBy(xpath = "//h3[normalize-space()='Modal']")
    WebElement modalTitle;
    @FindBy(xpath="//button[normalize-space()='Open modal']")
    WebElement clickOpenModal;
    @FindBy(xpath="//h2[@id='modal-modal-title']")
    WebElement openButtonText;
    @FindBy(xpath = "//p[@id='modal-modal-description']")
    WebElement openButtonText2;

    public Modal_POM(){
        PageFactory.initElements(driver,this);
    }
    public void clickModalButton(){
        modalLink.click();
    }
    public void getModalTitle(){
        String modalText= modalTitle.getText();
        System.out.println(modalText);
        Assert.assertEquals(modalText,"Modal","Not Matched");
    }

    public void clickOpenModalButton(){
        clickOpenModal.click();
        waitDriver(2000);
        //clickOpenModal.click();
    }
    public void getOpenModalText(){
        String firstText= openButtonText.getText();
        System.out.println(firstText);
        Assert.assertEquals(firstText,"Text in a modal","Not matched");
        waitDriver(2000);
        String secondText= openButtonText2.getText();
        System.out.println(secondText);
        Assert.assertEquals(secondText,"The modal component provides a solid foundation for creating dialogs, popovers, lightboxes, or whatever else.","Not matched");

    }

    public void pressEscapeButton(){
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }


}
