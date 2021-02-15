package TestNG_Setup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test

    void start(){
        System.out.println("Start");
    }

    @Test (priority = 1)
    void setup(){
        System.out.println("This is setup test");
    }

    @Test (priority = 2)
    void searchCustomer(){
        System.out.println("This is search customer test");
        Assert.assertEquals(1,1);
    }


    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing browser");
    }
}
