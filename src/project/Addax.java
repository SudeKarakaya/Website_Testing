package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Addax {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.addax.com.tr/");
        pause(5000);
        driver.manage().window().maximize();
        cookieDel(driver);
        Addax.pause(4000);
        Login.wrongEmail(driver);

    }










    public static void pause(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cookieDel(WebDriver driver){
        WebElement hoverable = driver.findElement(By.cssSelector(".col-xs-24[data-rel='116']"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
        pause(500);
        driver.findElement(By.cssSelector("div.cct-btn-item.cct-reject-btn")).click();

    }


}
