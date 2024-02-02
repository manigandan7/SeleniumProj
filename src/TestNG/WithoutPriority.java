package TestNG;


import org.testng.annotations.Test;

public class WithoutPriority {
    @Test
    public void launchURL() {
        System.out.println("\n Welcome to Facebook");
    }
    @Test
    public void enterUsername() {
        System.out.println("\n Username : Mani");
    }
    @Test
    public void enterPassword() {
        System.out.println("\n Pass: 1234");
    }
}

