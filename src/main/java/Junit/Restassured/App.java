package Junit.Restassured;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 * 
 */
class A{
	public void m1() {
		System.out.println("m1 super");
	}
}
class B extends A{
	public void m1() {
		System.out.println("child class");
	}
}
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        A b1=(B) new A();
        b1.m1();
//       WebDriver driver=new ChromeDriver();
//       driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
//       driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
//       Thread.sleep(7000);
//       driver.findElement(By.xpath("//label[text()='First name']")).sendKeys("ran");
//       driver.findElement(By.xpath("//label[text()='Surname']")).sendKeys("ran");
//       Select se=new Select(driver.findElement(By.xpath("//span[contains(text(),'Day')]")));
//       List<WebElement> list=se.getOptions();
//       
//       for(WebElement elent:list) {
//    	 System.out.println(elent.getText());  
//       }
      
    }
}
