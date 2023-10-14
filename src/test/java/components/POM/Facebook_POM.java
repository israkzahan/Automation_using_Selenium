package components.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginForFB;
import webElementsLogin.LoginSteps;

public class Facebook_POM extends LoginForFB {
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement passField;
    @FindBy(name = "login")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    WebElement errorTextLink;
    public Facebook_POM(){
        PageFactory.initElements(driver,this);
    }

    public void inputData(){
        emailField.sendKeys("01798");// validation check korar por wrong id diye rakhci
        passField.sendKeys("12345");
        loginButton.click();
    }

    public void wrongPassword(){
        String errorText= errorTextLink.getText();
        Assert.assertEquals(errorText,"The password that you've entered is incorrect. Forgotten password?","Not Matched");
    }

}
