package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
//    for data provider 2 Annotation are necessary
//    1st @DataProvider --> to be defined
//    2nd @Test --> to provide data

//    @DataProvider(name = "inputs1") //@DataProvider(name = "inputs1") COMPULSORY
//
//    public Object[] userInputs1() {
//        return new Object[]{"Audi", "BMW","Mercedez"};
//    }
//    @DataProvider(name = "inputs2")
//
//    public Object[] userInputs2() {
//        return new Object[]{"Mars", "Saturn","Jupiter"};
//    }

    @DataProvider(name = "inputs3")
    public Object[] userInputs3() {
        return new Object[]{"Apple", "Nokia","Samsung","Sony","G5"};
    }

    @Test(dataProvider = "inputs3") //@Test(dataProvider = "inputs1") COMPULSORY
    public void login(String f) {
        System.out.println("\n Name: " + f);
    }
//    @Test
//    public String[] login() {
//        return new String[] {"Mani","Karthi","Hemanth"};
//    }

}
