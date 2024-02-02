package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethodsSingle {
    @Test
    public void launchURL() {
        System.out.println("\n Welcome to Facebook");
    }

    @Test(dependsOnMethods = "launchURL")
    public void enterUsername() {
        System.out.println("\n Username : Mani");
    }
}
