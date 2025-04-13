package project;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {

    public static boolean login( String email, String password){
        boolean isLogin;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.addax.com.tr/");
        Addax.pause(1000);
        Addax.cookieDel(driver);
        Addax.pause(4000);
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(4000);
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys(email);
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys(password);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > " +
                "div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1) > " +
                "button:nth-child(1)")).click();
        Addax.pause(5000);

        try {
            WebElement hoverable = driver.findElement(By.xpath("//div[contains(@class," +
                    "'TopRightItem RightAccount Logged')]//span[@class='RightButtonText']//span[1]"));
            new Actions(driver)
                    .moveToElement(hoverable)
                    .perform();
            driver.findElement(By.xpath("//a[@class='hidden-xs hidden-sm']")).click();
            Addax.pause(3000);
            driver.findElement(By.xpath("//span[contains(text(),'Çıkış')]")).click();
            isLogin = true;
        }
        catch (NoSuchElementException e){
            isLogin = false;
        }
        return isLogin;
    }
    public static void normal(WebDriver driver){
        Addax.pause(4000);
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > " +
                "div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1) > " +
                "button:nth-child(1)")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void withoutEmail(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1) > button:nth-child(1)")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void withoutPass(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1) > button:nth-child(1)")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void withNothing(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1) > button:nth-child(1)")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void wrongEmail(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("test_project@gmail.com");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > " +
                "div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > div:nth-child(1)" +
                " > button:nth-child(1)")).click();
        Addax.pause(9000);
        driver.quit();
    }

    public static void wrongPass(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) " +
                "> div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > " +
                "div:nth-child(1) > button:nth-child(1)")).click();
        Addax.pause(9000);
        driver.quit();
    }

    public static void allWrong(WebDriver driver){
        driver.findElement(By.cssSelector("span[class='HeaderText'] a:nth-child(1)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluay@gmail.com");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(2) > div:nth-child(1)" +
                " > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(6) > " +
                "div:nth-child(1) > button:nth-child(1)")).click();
        Addax.pause(9000);
        driver.quit();
    }
}
