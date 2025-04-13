package project;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Search {

    public static boolean search(String itemName){
        boolean isSearched;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.addax.com.tr/");
        Addax.pause(1000);
        Addax.cookieDel(driver);
        Addax.pause(4000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']"));
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys(itemName);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(4000);
        try {
            WebElement hoverable = driver.findElement(By.xpath("//div[@id='MainNavBrd']"));
            new Actions(driver)
                    .moveToElement(hoverable)
                    .perform();
            Addax.pause(3000);
            isSearched = true;
        }
        catch (NoSuchElementException e){
            isSearched = false;
        }
        return isSearched;
    }

    public static void maviGomlek(WebDriver driver){
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']"));
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys
                ("Mavi gömlek");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(4000);
        driver.quit();
    }

    public static void weird(WebDriver driver){
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys("&%!");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(50000);
        driver.quit();
    }

    public static void notComplete(WebDriver driver){
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys("Mavi göm");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(5000);
        driver.quit();
    }

    public static void nothing(WebDriver driver){
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys("");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(5000);
        driver.quit();
    }


    public static void weird2(WebDriver driver) {
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys("Mavi g2");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(5000);
        driver.quit();
    }

    public static void longWord(WebDriver driver){
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).sendKeys("aaaaaaaa");
        driver.findElement(By.cssSelector("input[class='searchInput_New SearchNewText']")).submit();
        Addax.pause(5000);
        driver.quit();
    }


}
