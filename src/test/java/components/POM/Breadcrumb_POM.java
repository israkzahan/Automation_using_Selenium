package components.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webElementsLogin.LoginSteps;

import javax.xml.xpath.XPath;

public class Breadcrumb_POM extends LoginSteps {
    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Breadcrumb']")
    WebElement breadcrumbLink;
    @FindBy(xpath = "//h3[normalize-space()='Breadcrumb']")
    WebElement breadcrumbTitle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/div[1]/nav/ol/li[5]/p")
    WebElement breadcrumbTextElement;

    @FindBy(xpath = "//button[normalize-space()='Cypress JavaScript']")
    WebElement cypressButton;


    //initialize the elements
    public Breadcrumb_POM(){
        PageFactory.initElements(driver,this);
    }

    //verify the breadcrumb title
    public boolean getBreadcrumbLink(){
        boolean buttonBreadcrumbLink= breadcrumbLink.isEnabled();
        breadcrumbLink.click();
        return buttonBreadcrumbLink;
    }

    //verify the breadcrumb title
    public boolean getBreadcrumbTitle(){
        boolean breadcrumbTitleText= breadcrumbTitle.isEnabled();
        waitDriver(2000);
        System.out.println(breadcrumbTitleText);
        return breadcrumbTitleText;
    }

    //verify breadcrumb text
    public boolean getBreadcrumbText(){
        boolean breadcrumbText= breadcrumbTextElement.isEnabled();
        waitDriver(2000);
        System.out.println(breadcrumbText);
        return breadcrumbText;
    }
    public boolean clickCypressButton(){
        boolean cypressLink= cypressButton.isEnabled();
        waitDriver(2000);
        cypressButton.click();
        return cypressLink;
    }

}
