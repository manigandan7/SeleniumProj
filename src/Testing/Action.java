package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.WillNotClose;

public class Action {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        driver.get("https://omayo.blogspot.com/");

        WebElement blogsmenuElement = driver.findElement(By.id("blogsmenu"));

        actions.moveToElement( blogsmenuElement).perform();

        WebElement SbaOptionElement = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));

        actions.moveToElement(blogsmenuElement).click().build().perform();


    }
}
