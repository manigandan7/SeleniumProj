package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethodsMultiple {
    @Test
    public void LaunchURL() {
        System.out.println("\n Welcome to Facebook");
    }
    @Test
    public void enterUsername() {
        System.out.println("\n Username : Mani");
    }
    @Test(dependsOnMethods = {"LaunchURL","enterUsername"})
    public void enterPassword() {
        System.out.println("\n Pass: 1234");
    }
}
