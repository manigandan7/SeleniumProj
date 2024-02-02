package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


    public class ActionsWithPauseExample {

        public static void main(String[] args) {
            // Set the path to the ChromeDriver executable
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            // Open the demoqa website
            driver.get("http://demoqa.com/");

            // Find the "Widgets" menu item
            WebElement widgetsMenuItem = driver.findElement(By.xpath("//span[text()='Widgets']"));

            // Create an instance of the Actions class
            Actions actions = new Actions(driver);

            // Perform a mouse hover over the "Widgets" menu item
            actions.moveToElement(widgetsMenuItem).perform();

            // Pause for 2 seconds (2000 milliseconds)
            actions.pause(2000).perform();

            // Find a sub-menu item (e.g., "Accordian") and click on it
            WebElement accordionMenuItem = driver.findElement(By.xpath("//span[text()='Accordian']"));
            actions.click(accordionMenuItem).perform();

            // You can perform additional actions as needed

            // Close the browser
            driver.quit();
        }
    }


