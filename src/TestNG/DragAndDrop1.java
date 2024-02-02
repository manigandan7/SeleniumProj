package TestNG;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop1 {
    WebDriver driver;
    @BeforeTest
    public  void Launch() {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
    }

    @Test(priority = 1)
    public void FrameSwitch(){
        WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
    }
     @Test(priority = 2)
     public void DragAndDrop(){
         WebElement SourceElement = driver.findElement(By.id("draggable"));
         WebElement TargetElement = driver.findElement(By.id("droppable"));
         Actions actions = new Actions(driver);
         actions.dragAndDrop(SourceElement, TargetElement).build().perform();
    }
    @AfterTest
    public void close(){
        driver.quit();


    }
}
