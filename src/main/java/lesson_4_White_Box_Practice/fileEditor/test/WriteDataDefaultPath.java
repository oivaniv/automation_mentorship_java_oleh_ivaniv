package lesson_4_White_Box_Practice.fileEditor.test;

import lesson_4_White_Box_Practice.fileEditor.java.User;
import lesson_4_White_Box_Practice.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class WriteDataDefaultPath extends BaseTestClass {

    File file;
    UserManager userManager;
    TestHelper testHelper = new TestHelper();

    private static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    @Test(testName = "Verify creating empty file", groups ="REQUIRES_FILE_DELETE")
    public void createFileWithoutDataInFileTest() throws IOException {
        testHelper.deleteFile(DEFAULT_PATH);

        file = new File(DEFAULT_PATH);
        User expectedUser1 = new User();

        userManager = new UserManager();
        userManager.createUser(expectedUser1);

        Assert.assertTrue(file.exists());
        Assert.assertEquals(file.length(), 0);
    }

    @Test(testName = "Verify creating the file and adding correct the test data")
    public void createFileAndAddDataToFileTest() throws IOException {
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setName("Ivan");
        expectedUser.setSurname("Baloh");

        userManager = new UserManager();
        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(), testHelper.readLineFromFile(DEFAULT_PATH, 1));
    }

    @Test(testName = "Verify entering the test data to exist file", dependsOnMethods = "createFileAndAddDataToFileTest")
    public void enterDataInExistFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        TestHelper testHelper = new TestHelper();
        User expectedUser = new User();
        userManager = new UserManager();

        expectedUser.setId(testHelper.findLastIdFromFile(DEFAULT_PATH)+1);
        expectedUser.setName("Oleh");
        expectedUser.setSurname("Ivaniv");

        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(),
                testHelper.readLineFromFile(DEFAULT_PATH, testHelper.findLastIdFromFile(DEFAULT_PATH)));
    }

    @Test(testName = "Verify adding wrong the test data for ID")
    public void createFileAndAddWrongIdDataToFileTest() throws IOException {
        User expectedUser = new User();
        expectedUser.setId(000000000001);
        expectedUser.setName("Ivan");
        expectedUser.setSurname("Baloh");

        userManager = new UserManager();
        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(), testHelper.readLineFromFile(DEFAULT_PATH, 1));
    }

    @Test(testName = "Verify adding wrong the test data for name")
    public void createFileAndAddWrongNameDataToFileTest() throws IOException {
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setName("@^#%"+"1231");
        expectedUser.setSurname("Baloh");

        userManager = new UserManager();
        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(), testHelper.readLineFromFile(DEFAULT_PATH, 1));
    }

    @Test(testName = "Verify adding wrong the test data for name")
    //This test fail, cause my helper can't read the file correctly (i used \n to go to hte next line)
    public void createFileAndAddWrongSurnameDataToFileTest() throws IOException {
        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setName("Ivan");
        expectedUser.setSurname("\n Giga");

        userManager = new UserManager();
        userManager.createUser(expectedUser);

        Assert.assertEquals(expectedUser.getId()+","+expectedUser.getName()+","+expectedUser.getSurname(), testHelper.readLineFromFile(DEFAULT_PATH, 1));
    }

    @Test(testName = "Verify file isn't created by UserManager constructor", priority = 4)
    public void attemptToCreateFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        testHelper.deleteFile(DEFAULT_PATH);
        userManager = new UserManager();
        Assert.assertFalse(file.exists());
    }

    @Test(testName = "Verify deleting the file")
    public void deleteFileTest() {
        testHelper.deleteFile(DEFAULT_PATH);
    }

}
