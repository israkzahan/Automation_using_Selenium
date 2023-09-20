package components;
import org.openqa.selenium.By;
import webElementsLogin.LoginSteps;

public class Accordion extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        try{
            Thread.sleep(3000);


        }catch(Exception e){}


        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[2]/div[2]/span")).click();
//inspect the accordion title
        String accordionTitle= driver.findElement(By.xpath("//h3[normalize-space()='Accordion']")).getText();
        System.out.println(accordionTitle);


        if (accordionTitle.equals("Accordion")) {
            System.out.println("Accordion text is matching");
        } else {
            System.out.println("System not matching");
        }


//inspect the accordion Item
        String accordionItem= driver.findElement(By.xpath("//p[normalize-space()='Accordion Item 1']")).getText();
        System.out.println(accordionItem);


        if (accordionItem.equals("Accordion Item 1")) {
            System.out.println("AccordionItem text is matching");
        } else {
            System.out.println("AccordionItem not matching");
        }




    }


}
