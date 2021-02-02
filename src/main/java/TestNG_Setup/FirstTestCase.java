package TestNG_Setup;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test

    void start(){
        System.out.println("Start");
    }

    @Test (priority = 1)
    void setup(){
        System.out.println("This is setup test");
    }

    @Test (priority = 2)
    void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing browser");
    }
}
