package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class DropDown_POM extends LoginSteps {
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[7]/div[2]/span")
    WebElement dropdownLink;

    @FindBy(xpath = "//button[@id='demo-customized-button']")
    WebElement optionsButton;

    @FindBy(xpath = "//li[normalize-space()='Duplicate']")
    WebElement duplicateButton;


    //initialize the elements or declare the constructor
    public DropDown_POM(){
        PageFactory.initElements(driver, this);
    }

    public void clickDropDown(){
        dropdownLink.click();
    }
    public void clickOptionButton(){
        optionsButton.click();
    }

    public void clickDuplicateButton(){
        duplicateButton.click();
        String duplicateText= duplicateButton.getText();
        System.out.println(duplicateText);
        Assert.assertEquals(duplicateText,"Duplicate", "Not matched");
    }
}
