package Junit.Restassured;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovy.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       WebElement elent=driver.findElement(By.xpath("//h2[text()='Footer Links']"));
       Actions as=new Actions(driver);
       WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
        
       
    as.dragAndDrop(source, destination).build().perform();
    }
    
   
}
