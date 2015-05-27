package courses.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua");

//        WebElement aboutGoogle = driver.findElement(By.cssSelector("css=a:contains('Про Google')"));
        WebElement aboutGoogle = driver.findElement(By.xpath("//a[contains(text(), 'Про Google')]"));
        aboutGoogle.click();
        Thread.sleep(5_000);
        driver.close();
        driver.quit();
    }
}
