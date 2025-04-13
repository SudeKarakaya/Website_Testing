package project;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {

    public static boolean register(String name, String surname, String email, String telephone, String password){
        boolean isRegister;
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.addax.com.tr/");
        Addax.pause(1000);
        Addax.cookieDel(driver);
        Addax.pause(4000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys(name);
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys(surname);
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys(email);
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys(telephone);
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys(password);
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys(password);
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']" +
                "//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
            try {
                WebElement hoverable = driver.findElement(By.xpath("//div[contains(@class," +
                        "'TopRightItem RightAccount Logged')]//span[@class='RightButtonText']//span[1]"));
                new Actions(driver)
                        .moveToElement(hoverable)
                        .perform();
                driver.findElement(By.xpath("//a[@class='hidden-xs hidden-sm']")).click();
                Addax.pause(3000);
                driver.findElement(By.xpath("//span[contains(text(),'Çıkış')]")).click();
                isRegister = true;
            }
            catch (NoSuchElementException e){
                isRegister = false;
            }
            return isRegister;
        }

    public static void normal(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']" +
                "//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void existing(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }


    public static void difEmail(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluay@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']" +
                "//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void difTel(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("3856760450");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms'" +
                "]//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void difPass(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayva");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }



    public static void withoutConfirm(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void withoutConfirm2(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void nothing(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void noName(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void noSurname(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void noEmail(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void noTel(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void no1Pass(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }
    public static void no2Pass(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("ayvaAyva1.");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']" +
                "//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

    public static void noPass(WebDriver driver){
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span a:nth-child(2)")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ayva");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#LastName")).click();
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Ayvaoğlu");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#UserName")).click();
        driver.findElement(By.cssSelector("#UserName")).sendKeys("ayvaogluayva@gmail.com");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Gsm")).click();
        driver.findElement(By.cssSelector("#Gsm")).sendKeys("05385676045");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Password")).click();
        driver.findElement(By.cssSelector("#Password")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#ConfirmPassword")).click();
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("span.customCheck")).click();
        driver.findElement(By.xpath("//div[@class='forms UserCheck']//label[@for='AllowTerms']//span[@class='customCheck']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("button#LoginButton.btn.UyeOl.GenericLoginButton")).click();
        Addax.pause(5000);
        driver.quit();
    }

}
