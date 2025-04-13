package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cart {

    public static void ustGiyim(WebDriver driver){
        driver.findElement(By.cssSelector(".col-xs-24[data-rel='2']")).click();
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(2) > " +
                "div:nth-child(1) > div:nth-child(2) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > " +
                "div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("label[for='o-1'] span[class='checkable']")).click();
        Addax.pause(4000);
        driver.get("https://www.addax.com.tr/siyah-baglamali-yelek-pantolon-ikili-takim-tkm3789-t5_adx-00032448-226");
        driver.findElement(By.cssSelector("a[title='Siyah'] span")).click();
        driver.findElement(By.cssSelector(".S")).click();
        Addax.pause(5000);
        driver.findElement(By.cssSelector("#Basket")).click();
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();

    }

    public static void summer(WebDriver driver){
        Addax.pause(2000);
        driver.findElement(By.cssSelector(".col-xs-24[data-rel='116']")).click();
        Addax.pause(2000);
        driver.get("https://www.addax.com.tr/lacivert-bisiklet-yaka-basic-crop-t-shirt-p1098-l1_adx-00028427-157");
        Addax.pause(3000);
        driver.findElement(By.cssSelector("a[title='Laci'] span")).click();
        driver.findElement(By.cssSelector(".S")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Basket")).click();
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);

    }

    public static void altGiyim_esofman(WebDriver driver){
        WebElement hoverable = driver.findElement(By.cssSelector(".col-xs-24[data-rel='3']"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
        driver.findElement(By.cssSelector("a[data-rel='31']")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)")).click();
        Addax.pause(4000);
        driver.findElement(By.cssSelector("label[for='s-25']")).click();
        driver.get("https://www.addax.com.tr/mavi-pacasi-lastikli-esofman-esf9430-h1h6_adx-0000022199-221");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("a[title='Kırmızı'] span")).click();
        driver.findElement(By.cssSelector(".M")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("#Basket")).click();
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();
    }


    public static void seamless_color(WebDriver driver){
        driver.findElement(By.cssSelector(".col-xs-24[data-rel='81']")).click();
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("label[title='Yeşil']")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/yesil-halter-yaka-seamless-crop-atlet-a0186-e13_adx-0000025126-11");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("a[title='Açık Yeşil'] span")).click();
        driver.findElement(By.xpath("//a[@class='M/L']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Basket")).click();
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();

    }

    public static void dis_ceket_withoutSize(WebDriver driver){
        WebElement hoverable = driver.findElement(By.cssSelector(".col-xs-24[data-rel='4']"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("a[data-rel='19']")).click();
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        driver.findElement(By.xpath("//div[contains(@class,'col-xs-24 col-md-4 CategoryLeftBar')]//div[6]" +
                "//div[1]")).click();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("label[for='pt-6'] span[class='checkable']")).click();
        driver.get("https://www.addax.com.tr/siyah-kruvaze-yaka-dugmeli-blazer-ceket-c50873-y6_adx-00025431-226");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("a[title='Laci'] span")).click();
        driver.findElement(By.cssSelector("#Basket")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();

    }

    public static void aks_bere_withoutColor(WebDriver driver){
        WebElement hoverable = driver.findElement(By.cssSelector(".col-xs-24[data-rel='5']"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
        Addax.pause(3000);
        driver.findElement(By.cssSelector("a[data-rel='52']")).click();
        Addax.pause(2000);
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        driver.findElement(By.xpath("//div[normalize-space()='Ürün Grubu']")).click();
        Addax.pause(3000);
        driver.findElement(By.xpath("//label[@for='dp-66']//span[@class='checkable']")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/yesil-basic-triko-bere-spk3253-e1_adx-00028561-268");
        driver.findElement(By.cssSelector("#Basket")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();
    }

    public static void yeni_withoutSelection(WebDriver driver){
        driver.findElement(By.cssSelector(".col-xs-24[data-rel='1']")).click();
        driver.findElement(By.cssSelector(".ToggleFilterBtn")).click();
        Addax.pause(2000);
        driver.findElement(By.xpath("//div[normalize-space()='Yaka']")).click();
        Addax.pause(4000);
        driver.findElement(By.xpath("//label[contains(@for,'cll-2')]//span[contains(@class,'checkable')]")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/kirmizi-bisiklet-yaka-fitilli-modal-atlet-a13615-s10_adx-00032240-120");
        Addax.pause(2000);
        driver.findElement(By.cssSelector("#Basket")).click();
        Addax.pause(3000);
        driver.get("https://www.addax.com.tr/tr/p/CheckOut/sepet");
        Addax.pause(3000);
        driver.quit();

    }
}
