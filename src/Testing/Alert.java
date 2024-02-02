package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

       Thread .sleep(5000);

        driver.findElement(By.id("promptexample")).click();

        Thread.sleep(5000);

        System.out.println(driver.switchTo().alert().getText());

       Thread.sleep(5000);

       driver.switchTo().alert().accept();

       driver.quit();





//        driver.quit();

    }
}
