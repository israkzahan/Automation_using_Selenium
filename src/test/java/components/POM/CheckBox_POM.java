package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class CheckBox_POM extends LoginSteps {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[6]/div[2]/span")
    WebElement checkBoxLink;

    @FindBy(xpath = "//h3[normalize-space()='Checkbox']")
    WebElement checkBoxText;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/span[2]/input[1]")
    WebElement checkBoxClick_Two;

    public CheckBox_POM(){
        PageFactory.initElements(driver, this);
    }

    public void clickCheckBox(){
        checkBoxLink.click();
    }

    public  void checkBoxText(){
        String checkBoxTitle= checkBoxText.getText();
        System.out.println(checkBoxTitle);
        Assert.assertEquals(checkBoxTitle,"Checkbox", "Text not matching");
    }

    public  void checkBoxClick2 (){
        checkBoxClick_Two.click();

    }

}
