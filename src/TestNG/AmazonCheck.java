package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AmazonCheck {
        WebDriver driver;

        @Test(invocationCount = 2)
        public void iLaunchTheAmazon() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/ap/signin/257-2072847-5313018");
        }


        public void enterTheValidMailId() {
            driver.findElement(By.name("email")).sendKeys("msm84205@gmail.com");
            driver.findElement(By.id("continue")).click();

        }


        public void enterTheUnvalidPassword() {
            driver.findElement(By.id("password")).sendKeys("@123");
            driver.findElement(By.id("signInSubmit")).click();

        }


        public void iShouldNotAbleToLoginSuccessfully() {
            Boolean status = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div")).isDisplayed();
            Assert.assertEquals(true,status);

        }
    }


