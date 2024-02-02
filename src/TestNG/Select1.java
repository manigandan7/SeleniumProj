package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class Select1 {

        WebDriver driver;
        Select select;

        @BeforeTest
        public void test() {

            driver = new ChromeDriver();
            driver.get("https://demoqa.com/select-menu");
            WebElement selectButton = driver.findElement(By.id("oldSelectMenu"));
            driver.manage().window().maximize();

            select = new Select(selectButton);
        }

        @Test
        public void select4() throws InterruptedException {
            //One time

            select.selectByIndex(4);
            Thread.sleep(2000);
            String element1 = select.getFirstSelectedOption().getText();
            System.out.println(element1);

        }

        @Test(dependsOnMethods = "select4")
        public void select1() throws InterruptedException {

            select.selectByValue("7");
            String element2 = select.getFirstSelectedOption().getText();
            System.out.println(element2);
            Thread.sleep(2000);

        }

        @Test(dependsOnMethods = "select1")
        public void select2() throws InterruptedException {


            select.selectByVisibleText("White");
            Thread.sleep(2000);
            String element3 = select.getFirstSelectedOption().getText();
            System.out.println(element3);
        }

        @Test(dependsOnMethods ="select2" )
        public void select3() {
            select.selectByIndex(3);

            String element4 = select.getOptions().get(3).getText();
            System.out.println(element4);


        }

//        @AfterTest
//        public void close() {
//            driver.quit();
        }
//    }


