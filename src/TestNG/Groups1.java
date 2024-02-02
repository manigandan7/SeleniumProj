package TestNG;

import org.testng.annotations.Test;

public class Groups1 {
    @Test(groups = {"smoke"},priority = 1)
    public void launchURL()
    {
        System.out.println("\n Welcome to Facebook");
    }
    @Test(groups = {"smoke"},priority = 2)
    public void enterUsername()
    {
        System.out.println("\n Username : Mani");
    }
    @Test(groups = {"smoke"},priority = 3)
    public void enterPassword()
    {
        System.out.println("\n Pass: 1234");
    }
    @Test(groups = {"functional"})
    public void settings() {
        System.out.println("\n Settings");
    }
    @Test(groups = {"functional"})
    public void logOut() {
        System.out.println("\n LogOut");
    }
}
