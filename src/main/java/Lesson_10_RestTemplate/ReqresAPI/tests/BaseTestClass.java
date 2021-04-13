package Lesson_10_RestTemplate.ReqresAPI.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod(Method method){
        System.out.println("-----------------New test case started-----------------");
        System.out.println("Start next test - " + method.getName());
        System.out.println();
    }

    @AfterMethod
    public void afterMethod(Method method){
        System.out.println();
        System.out.println("Finished next test - " + method.getName());
        System.out.println("-----------------Test case is finished-----------------");
        System.out.println();
    }

}
