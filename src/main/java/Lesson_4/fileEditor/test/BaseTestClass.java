package Lesson_4.fileEditor.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import static Lesson_4.fileEditor.java.UserManager.DEFAULT_PATH;

public class BaseTestClass {

    TestHelper testHelper = new TestHelper();
    private static final String PATH1 = "C:\\Users\\oivaniv\\Documents\\NewCustomTestFile1.txt";


    @BeforeMethod (onlyForGroups = {"REQUIRES_FILE_DELETE"})
    public void beforeMethodDelete(Method method) {
        System.out.println("-----------------New test case started-----------------");
        System.out.println("Start next test - " + method.getName());
        testHelper.deleteFile(PATH1);
        System.out.println();
    }

    @BeforeMethod (onlyForGroups = {"REQUIRES_CREATED_FILE"})
    public void beforeMethodCreateFile(Method method) throws IOException {
        System.out.println("-----------------New test case started-----------------");
        System.out.println("Start next test - " + method.getName());
        testHelper.setManyUsersToFile(PATH1,10);
        System.out.println();
    }

    @AfterMethod (onlyForGroups = {"REQUIRES_CREATED_FILE"})
    public void afterMethodCreateFile(Method method) {
        testHelper.deleteFile(PATH1);
        System.out.println();
        System.out.println("Finished next test - " + method.getName());
        System.out.println("-----------------Test case is finished-----------------");
        System.out.println();

    }

    @BeforeMethod ()
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
