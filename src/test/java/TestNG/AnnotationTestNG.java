package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationTestNG {
   @Test
    public void googleTest(){
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       //navigate the url
       driver.get("https://www.google.com/");

       driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step", Keys.ENTER);
       System.out.println(driver.getTitle());
      try {
         Thread.sleep(2000);
      }catch (Exception e){}
       //driver.quit();

   }

   @Test
   public void youtubeTest(){
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      //navigate the url
      driver.get("https://www.youtube.com/");
      try {
         Thread.sleep(2000);
      }catch (Exception e){}

      driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Automation step by step", Keys.ENTER);
      System.out.println(driver.getTitle());

      //driver.quit();

   }
}
