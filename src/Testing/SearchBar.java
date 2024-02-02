package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {
    public static void main(String[] args)throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Actions actions = new Actions(driver);

        driver.get("https://www.flipkart.com/");

        Thread.sleep(4000);

//        driver.findElement(By.xpath("//span[@role='button']")).click();

//        Thread.sleep(4000);

       WebElement searchInput = driver.findElement(By.name("q"));


        searchInput.sendKeys("mobile");
        Thread.sleep(5000);

        searchInput.clear();


//        String enteredValue = searchInput.getAttribute("value");

//        System.out.println("Value entered by user: "+ enteredValue );

//        driver.quit();

    }
}
