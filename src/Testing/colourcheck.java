package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class colourcheck {
    public static void main(String[] args)throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");


        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");

        String Buttoncolour = driver.findElement(By.xpath("//button[@id='search_button']")).getCssValue("background");
        Thread.sleep(2000);
        String Textcolour = driver.findElement(By.xpath("//button[@id='search_button']")).getCssValue("Textcolour");

        System.out.println("Buttoncolour : " + Buttoncolour );
        System.out.println("Textcolour : "+ Textcolour );

//        driver.quit();


    }
}
