package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown =driver.findElement(By.className(" css-1hwfws3 "));

        Select select = new Select(dropdown);

        select.selectByIndex(5);

        Thread.sleep(2000);

        select.selectByVisibleText("Green");

        Thread.sleep(2000);

        select.selectByValue("1");

        Thread.sleep(2000);

        driver.quit();


    }
}
