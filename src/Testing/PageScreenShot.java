package Testing;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;

public class PageScreenShot {
    public static void main(String[] args)throws Exception {
//        Object obj = " mani";
//        Object obj1 = 123;
//        int strg = (int) obj;
//        int i = (int)obj1;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("https://www.amazon.in/");
        TakesScreenshot ts = (TakesScreenshot) driver;
//        ((TakesScreenshot) driver).getScreenshotAs()
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\balaj\\Downloads\\vijay\\AmazonWebpageScreenshot.png"));
//        driver.quit();
//         ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    }
}