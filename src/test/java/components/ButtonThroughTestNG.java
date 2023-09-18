package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webElementsLogin.LoginSteps;

public class ButtonThroughTestNG extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();

        try{
            Thread.sleep(2000);
        }catch ( Exception e){}

        driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig'][normalize-space()='Button']")).click();
      //driver.findElement(By.xpath("//button[normalize-space()='Secondary']")).click();
        ButtonThroughTestNG buttonThroughTestNG= new ButtonThroughTestNG();
        buttonThroughTestNG.ButtonText();
        buttonThroughTestNG.SecondaryButton();
        buttonThroughTestNG.ErrorButton();


    }

    public void ButtonText(){
        try{
            Thread.sleep(2000);
        }catch ( Exception e){}

        String buttonText= driver.findElement(By.xpath("//h3[normalize-space()='Button']")).getText();
        System.out.println(buttonText);
        Assert.assertEquals(buttonText,"Button","Button text is not matched");
    }
    //Secondary button click
    public void SecondaryButton(){

        try{
            Thread.sleep(2000);
        }catch ( Exception e){}

       WebElement secondaryButton = driver.findElement(By.xpath("//button[normalize-space()='Secondary']"));
       secondaryButton.click();

        try{
            Thread.sleep(2000);
        }catch ( Exception e){}

       String textVerify= driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message css-1w0ym84']")).getText();
        System.out.println(textVerify);
        Assert.assertEquals(textVerify,"Button Clicked","Message text is not matched");
        System.out.println("Button text verified successfully");
        secondaryButton.click();


    }
    //Error Button
    public void ErrorButton(){
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        WebElement errorButton = driver.findElement(By.xpath("//button[normalize-space()='Error']"));
        errorButton.click();

        try{
            Thread.sleep(2000);
        }catch ( Exception e){
            e.printStackTrace();
        }

        String errorButtonText= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/div/div")).getText();
        System.out.println(errorButtonText);
        Assert.assertEquals(errorButtonText,"Button Clicked","Message text is not matched");
        //errorButton.click();
        System.out.println("Error Button Verified");
        errorButton.click();


    }

}
