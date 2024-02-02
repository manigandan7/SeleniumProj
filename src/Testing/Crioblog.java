package Testing;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 public class Crioblog {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\balaj\\Downloads\\geckodriver-v0.33.0-win64");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

         driver.get("https://www.crio.do/blog/");



//
        driver.findElement(By.linkText("Why Crio"));


        System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());

//
         driver.quit();

       driver.findElement(By.partialLinkText("Desktop"));
    }
}
