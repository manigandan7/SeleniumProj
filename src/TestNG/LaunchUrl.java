package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public  class LaunchUrl  {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void LaunchUrl()throws InterruptedException {

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

    }

        @AfterTest
           public void close() {
            driver.quit();
            {

            }
        }}
