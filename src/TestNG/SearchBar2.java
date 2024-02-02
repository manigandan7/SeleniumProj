package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBar2 {
    WebDriver driver;

    @BeforeTest
    public void Launch (){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void WebsiteLaunch(){
        WebElement Input1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Input1.sendKeys("volley Ball");

        WebElement Input2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Input2.click();
    }
    @AfterTest
    public void WebsiteClose(){
        driver.quit();
    }


}
