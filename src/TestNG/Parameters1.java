package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
    @Parameters({"Username","Password"})
    @Test
    public void TestMethod1(String user,String pass)
    {
        System.out.println("Name : " + user +"| Pass: "+pass);
    }
}
