package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class Accordion_POM extends LoginSteps {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[2]/div[2]/span")
    WebElement accordionLink;

    @FindBy(xpath = "//h3[normalize-space()='Accordion']")
    WebElement accordionPageTitle;

    @FindBy(xpath = "//p[normalize-space()='Accordion Item 1']")
    WebElement accordionText;

    @FindBy(xpath = "//*[@id=\"panel1d-content\"]/div/p")
    WebElement accordionOneText;



    //initialize the elements or declare the constructor
    public Accordion_POM(){
        //just call the page factory

        PageFactory.initElements(driver, this);
    }

    //create method For AccordionLink
    public void clickAccordionLink(){
        accordionLink.click();
    }

    //For Verify the AccordionTitle
    public void verifyAccordionTitle(){
        String accordionPageTitleText= accordionPageTitle.getText();
        Assert.assertEquals(accordionPageTitleText,"Accordion", "Accordion page title is not matched");
    }

    //For verify the AccordionText
    public void verifyAccordionText(){

        // verify Accordion Item 1 text
        String accordionElementText= accordionText.getText();
        Assert.assertEquals(accordionElementText,"Accordion Item 1");

        //verify Second line text
        String accordionOneElementText=accordionOneText.getText();
        Assert.assertEquals(accordionElementText,"Accordions are useful when you want to toggle between hiding and showing large amount of content", "Text not message");
    }

}
