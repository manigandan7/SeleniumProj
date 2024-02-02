
package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Open YouTube
            driver.get("https://www.youtube.com/");

            // Wait for some time (you might need to add more precise waits based on the actual page loading)
            Thread.sleep(4000);

            // Find the search input field by its ID ("search") and enter the search query ("vijay songs")
            WebElement searchInput = driver.findElement(By.id("search"));

            searchInput.sendKeys("vijay songs");

            // Click the search icon to initiate the search
            driver.findElement(By.id("search-icon-legacy")).click();

            driver.quit();
        } finally {

        }
    }
}
