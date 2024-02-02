package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");



        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

        driver.switchTo().frame(iframe);


        WebElement SourceElement = driver.findElement(By.id("draggable"));

        WebElement TargetElement = driver.findElement(By.id("droppable"));


         Actions actions = new Actions(driver);

         actions.dragAndDrop(SourceElement, TargetElement).build().perform();


         driver.switchTo().defaultContent();

         Thread.sleep(3000);

//         driver.findElement(By.xpath("//input[@type='search']")).sendKeys("HI");

//         Thread.sleep(3000);



    }
}