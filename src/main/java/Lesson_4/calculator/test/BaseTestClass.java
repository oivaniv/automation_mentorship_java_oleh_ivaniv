package Lesson_4.calculator.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("-----------------New test case started-----------------");
        System.out.println();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("-----------------Test case is finished-----------------");
        System.out.println();
    }

}
