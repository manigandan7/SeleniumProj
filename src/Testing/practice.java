package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");


       WebElement SearchInput = driver.findElement(By.name("q"));

        SearchInput.sendKeys("mobile");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.className("_4rR01T")).click();







    }
}
