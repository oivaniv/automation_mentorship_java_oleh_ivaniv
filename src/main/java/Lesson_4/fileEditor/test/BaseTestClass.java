package Lesson_4.fileEditor.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.lang.reflect.Method;

import static Lesson_4.fileEditor.java.UserManager.DEFAULT_PATH;

public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("-----------------New test case started-----------------");
        System.out.println("Start next test - " + method.getName());
        System.out.println();
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println();
        System.out.println("Finished next test - " + method.getName());
        System.out.println("-----------------Test case is finished-----------------");
        System.out.println();
    }
}
