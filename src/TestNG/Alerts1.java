package TestNG;

import Testing.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts1 {
    WebDriver driver;

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("promptexample")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
//driver.get
    }




}
