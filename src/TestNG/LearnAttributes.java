package TestNG;

import org.testng.annotations.Test;

public class LearnAttributes {

    @Test
    public  void signUp() {
        System.out.println("Sign Up");
    }
    @Test
    public void login(){
        System.out.println("Login");
    }

    @Test(dependsOnMethods = "TestNG.LearnAttributes.Login")
    public void searchProducts(){
        System.out.println("Search Products");
    }
}
