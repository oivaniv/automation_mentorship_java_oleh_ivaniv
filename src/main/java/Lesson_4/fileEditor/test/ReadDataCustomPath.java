package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;
import Lesson_4.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ReadDataCustomPath {
    File file;
    UserManager userManager;
    TestHelper testHelper = new TestHelper();

    private static final String PATH1 = "C:\\Users\\oivaniv\\Documents\\NewCustomTestFile1.txt";

    @Test(testName = "Verify reading correct data from file")
    public void readCorrectDataFromFileTest() throws IOException {
        file = new File(PATH1);
        User actualUser = new User();
        userManager = new UserManager(PATH1);

        actualUser.setId(1);
        actualUser.setName("Oleh");
        actualUser.setSurname("Ivaniv");
        testHelper.setOneUserToFile(PATH1, actualUser.getId(), actualUser.getName(), actualUser.getSurname());

        //Bug #1, .getUser fail without fix
        Assert.assertEquals(actualUser.getId(), userManager.getUser(1).getId());
        Assert.assertEquals(actualUser.getName(), userManager.getUser(1).getName());
        Assert.assertEquals(actualUser.getSurname(), userManager.getUser(1).getSurname());
    }
}
