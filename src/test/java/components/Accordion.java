package components;

import org.openqa.selenium.By;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class Accordion extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps=new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(3000);

        }catch(Exception e){}
        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Accordion']")).click();

        Accordion accordion = new Accordion();
        accordion.verifyAccordionTitle();
        accordion.verifyAccordionText();

    }

    //verify the accordion page title
    public void verifyAccordionTitle(){
       String accordionText= driver.findElement(By.xpath("//h3[normalize-space()='Accordion']")).getText();
       System.out.println(accordionText);
        Assert.assertEquals(accordionText,"Accordion", "Accordion text is not matching");
        System.out.println("Verified the accordion title");
    }

    //verify the accordion Item 1
    public void verifyAccordionText(){
        String accordionItemText= driver.findElement(By.xpath("//*[@id=\"panel1d-header\"]/div[1]/p")).getText();
        System.out.println(accordionItemText);
        Assert.assertEquals(accordionItemText,"Accordion Item 1", "Accordion Item 1 text is not matching");
        System.out.println("Verified the accordion Item title");

        //Second line text

        String accordionItemOneText= driver.findElement(By.xpath("//div[@id='panel1d-content']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][contains(text(),'Accordions are useful when you want to toggle betw')]")).getText();
        System.out.println(accordionItemOneText);
        Assert.assertEquals(accordionItemOneText,"Accordions are useful when you want to toggle between hiding and showing large amount of content", "Text is not matching");
        System.out.println("Verified the accordion Item title!");

    }




}
