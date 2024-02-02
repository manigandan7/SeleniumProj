import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class GoogleSearchExample {

    public static void main(String[] args)throws InterruptedException {

//        System.setProperty("webdriver.chromedriver", "C:\\Users\\balaj\\Downloads\\chromedriver-windows");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(4000);

       driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

//       driver.findElement(By.className("uiU-ZX"));

      driver.findElement(By.name("q")).sendKeys("Hp Laptop");

//        the active element is used to enter option

        WebElement activeelement = driver.switchTo().activeElement();
        activeelement.sendKeys("Hp Laptop",Keys.ENTER);

//        driver.quit();

    }
}