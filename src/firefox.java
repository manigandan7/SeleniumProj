import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

    private static WebDriver booleandriver;

    public static void main(String[] args)throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaj\\Downloads\\geckodriver-v0.33.0-win64\\");
        WebDriver driver = new FirefoxDriver();


        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(4000);

        driver.findElement(By.id("username")).sendKeys(" student");
        Thread.sleep(4000);

        driver.findElement(By.name("password")).sendKeys("Password123");
        Thread.sleep(4000);

      //  booleandriver.findElement(By.className("btn")).click();
        Thread.sleep(4000);

//        booleandriver.findElement(By.className("post-title")).isDisplayed();
        Thread.sleep(4000);
        driver.quit();


    }
}
