package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;
import Lesson_4.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteDataCustomPath extends BaseTestClass {

    String userFolderPath = System.getProperty("user.home");
    private final String customPath = userFolderPath+"\\Documents\\NewCustomTestFile1.txt";

    File file = new File(customPath);
    UserManager userManager = new UserManager(customPath);

    public WriteDataCustomPath() throws FileNotFoundException {
    }

    @Test(testName = "Verify creating empty file", groups = "REQUIRES_FILE_DELETE", alwaysRun = true)
    public void createFileWithoutDataInFileTest() throws IOException {
        userManager.createUser(UserRepository.getEmptyUser());

        Assert.assertTrue(file.exists());
        Assert.assertEquals(file.length(), 0);
    }

    @Test(testName = "Verify creating the file and adding correct the test data")
    public void createFileAndAddDataToFileTest() throws IOException {
        userManager.createUser(UserRepository.getDefaultValidUser());
        TestUtilities.assertUserData(UserRepository.getDefaultValidUser(), TestHelper.readLineFromFile(customPath, 1));
    }

    @Test(testName = "Verify entering the test data to exist file", groups = "REQUIRES_CREATED_FILE")
    public void enterDataInExistFileTest() throws IOException {
        User actualUser = UserRepository.getUserWithCustomId(TestHelper.findLastIdFromFile(customPath) + 1);
        userManager.createUser(actualUser);
        User expectedUser = TestHelper.readLineFromFile(customPath, TestHelper.findLastIdFromFile(customPath));
        TestUtilities.assertUserData(actualUser, expectedUser);
    }
}
