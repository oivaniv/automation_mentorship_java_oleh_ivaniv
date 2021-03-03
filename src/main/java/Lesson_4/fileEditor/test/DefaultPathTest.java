package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;
import Lesson_4.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static Lesson_4.fileEditor.java.UserManager.DEFAULT_PATH;

public class DefaultPathTest extends BaseTestClass {

    @Test(testName = "Verify creating new file the test data")
    public void createFileTest() throws FileNotFoundException {
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setName("Oleh");
        expectedUser.setSurname("Ivaniv");

        new UserManager().createUser(expectedUser);
    }

    @Test(testName = "Verify adding the test data to the file")
    public void addDataToFileTest() throws FileNotFoundException {
        User expectedUser2 = new User();
        expectedUser2.setId(2);
        expectedUser2.setName("Ivan");
        expectedUser2.setSurname("Baloh");

        new UserManager().createUser(expectedUser2);
    }


    @Test(testName = "Verify entering the test data")
    public void enterDataTest() throws IOException {
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setName("Oleh");
        expectedUser.setSurname("Ivaniv");

        new UserManager().createUser(expectedUser);

        User actualUser = new UserManager().getUser(expectedUser.getId());
        Assert.assertEquals(expectedUser.getId(), actualUser.getId());
        Assert.assertEquals(expectedUser.getName(), actualUser.getName());
        Assert.assertEquals(expectedUser.getSurname(), actualUser.getSurname());
    }

    @Test(testName = "Verify deleting the file")
    public void deleteFileTest() {
        System.out.println();

        File file = new File(DEFAULT_PATH);
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " is deleted");
        } else {
            System.out.println("No such file - " + file.getName());
        }
    }

}
