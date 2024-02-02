package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class task {

    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();



//        driver.get("https://www.flipkart.com/");
//
//        driver.findElement(By.xpath("//span[@role='button']")).click();
//
//         driver.findElement(By.xpath("//span[text()='Electronics']")).click();

            driver.get("https://www.flipkart.com/acer-aspire-5-gaming-intel-core-i5-12th-gen-1240p-8-gb-512-gb-ssd-windows-11-home-4-graphics-nvidia-geforce-rtx-2050-a515-57g-laptop/p/itmb81dc2bbb8837?pid=COMGFSNU8VEAMFYR&lid=LSTCOMGFSNU8VEAMFYRDVHQ2G&marketplace=FLIPKART&q=acer+aspire+7&store=6bo%2Fb5g&srno=s_1_12&otracker=AS_QueryStore_OrganicAutoSuggest_3_4_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_3_4_na_na_ps&fm=organic&iid=9a193449-6a82-43b4-98fd-2dd159bda430.COMGFSNU8VEAMFYR.SEARCH&ppt=browse&ppn=browse&ssid=rj9htcsz0g0000001703073663135&qH=8b5d26a924ee876e");


//        Actions builder = new Actions(driver);
//
//        WebElement gaming = driver.findElement(By.linkText("Gaming"));
//
//        builder.moveToElement(gaming).perform();
//
//        driver.findElement(By.linkText("All")).click();
//
//        driver.findElement(By.xpath("//a[text()='Acer Aspire 7 Intel Core i5 12th Gen 12450H - (16 GB/51...']")).click();
        String xpath1 = "//span[contains(text(),'Acer Aspire')]//parent::h1//parent::div//following-sibling::div[3]//descendant::div[contains(text(),'54,990')]";
        driver.findElement(By.xpath(xpath1)).click();
        //a[text()='All']

//       driver.findElement(By.linkText(""))


        Thread.sleep(2000);

//        WebElement name = driver.findElement (By.xpath("navbar__tutorial-menu--menu-bars"));
//        actions.moveToElement("").click().perform();










    }
}
