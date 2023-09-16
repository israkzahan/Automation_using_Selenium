package google_Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

    WebDriver driver = null;
    By text_box_search= By.id("input");
    //By button_search= By.name("");

    public GoogleSearchPageObjects(WebDriver driver){
        this.driver= driver;
    }
    public void setTextInSearchBox(String text){
        driver.findElement(text_box_search).sendKeys(text);
        driver.findElement(text_box_search).sendKeys(Keys.ENTER);

    }

    public void clickSearchButton(){
        driver.findElement(text_box_search).sendKeys(Keys.ENTER);

    }
}
