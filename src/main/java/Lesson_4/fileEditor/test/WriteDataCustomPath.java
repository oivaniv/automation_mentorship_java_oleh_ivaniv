package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;
import Lesson_4.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WriteDataCustomPath extends BaseTestClass{
    File file;
    UserManager userManager;
    TestHelper testHelper = new TestHelper();

    private static final String PATH1 = "C:\\Users\\oivaniv\\Documents\\NewCustomTestFile1.txt";

    @Test(testName = "Verify creating empty file", groups ="REQUIRES_FILE_DELETE", dependsOnMethods ="deleteFileTest")
    public void createFileWithoutDataInFileTest() throws IOException {
        file = new File(PATH1);
        User expectedUser1 = new User();

        userManager = new UserManager(PATH1);
        userManager.createUser(expectedUser1);

        Assert.assertTrue(file.exists());
        Assert.assertEquals(file.length(), 0);
    }

    @Test(testName = "Verify creating the file and adding correct the test data")
    public void createFileAndAddDataToFileTest() throws IOException {

        User expectedUser = new User();
        userManager = new UserManager(PATH1);

        expectedUser.setId(1);
        expectedUser.setName("Ivan");
        expectedUser.setSurname("Baloh");

        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(), testHelper.readLineFromFile(PATH1, 1));
    }

    @Test(testName = "Verify entering the test data to exist file", dependsOnMethods = "createFileAndAddDataToFileTest")
    public void enterDataInExistFileTest() throws IOException {
        file = new File(PATH1);
        TestHelper testHelper = new TestHelper();
        User expectedUser = new User();
        userManager = new UserManager(PATH1);

        expectedUser.setId(testHelper.findLastIdFromFile(PATH1)+1);
        expectedUser.setName("Oleh");
        expectedUser.setSurname("Ivaniv");

        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(),
                testHelper.readLineFromFile(PATH1, testHelper.findLastIdFromFile(PATH1)));
    }

    @Test(testName = "Verify deleting the file")
    public void deleteFileTest() {
        testHelper.deleteFile(PATH1);
    }
}
