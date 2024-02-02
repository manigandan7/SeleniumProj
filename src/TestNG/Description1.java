package TestNG;

import org.testng.annotations.Test;

public class Description1 {
    @Test(description = "For Launching URL")
    public void launchURL() {
        System.out.println("\n Welcome to Facebook");
    }
}
