package TestNG;


import org.testng.annotations.Test;

public class WithPriority {
    @Test(priority = 1)
    public void launchURL() {
        System.out.println("\n Welcome to Facebook");
    }
    @Test(priority = 2)
    public void enterUsername() {
        System.out.println("\n Username : Mani");
    }
    @Test(priority = 3)
    public void enterPassword() {
        System.out.println("\n Pass: 1234");
    }
}

