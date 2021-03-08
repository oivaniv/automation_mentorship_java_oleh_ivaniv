package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;
import Lesson_4.fileEditor.java.UserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataDefaultPath extends BaseTestClass {
    File file;
    UserManager userManager;
    TestHelper testHelper = new TestHelper();

    private static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    @Test(testName = "Verify reading correct data from file")
    public void readCorrectDataFromFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        User actualUser = new User();
        userManager = new UserManager();

        actualUser.setId(1);
        actualUser.setName("Oleh");
        actualUser.setSurname("Ivaniv");
        testHelper.setOneUserToFile(DEFAULT_PATH, actualUser.getId(), actualUser.getName(), actualUser.getSurname());

        Assert.assertEquals(actualUser.getId(), userManager.getUser(1).getId());
        Assert.assertEquals(actualUser.getName(), userManager.getUser(1).getName());
        Assert.assertEquals(actualUser.getSurname(), userManager.getUser(1).getSurname());
    }

    @Test(testName = "Verify reading correct data from big file")
    public void readCorrectDataFromBigFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        User expectedUser;
        userManager = new UserManager();

        testHelper.setManyUsersToFile(DEFAULT_PATH, 1000);

        expectedUser = userManager.getUser(726);
        String expectedUserInfo = String.format("%1$s,%2$s,%3$s", expectedUser.getId(), expectedUser.getName(), expectedUser.getSurname());

        Assert.assertEquals(testHelper.readLineFromFile(DEFAULT_PATH, 726), expectedUserInfo);
    }

    @Test(testName = "Verify reading wrong ID data from file", expectedExceptions = NumberFormatException.class)
    public void readWrongIdDataFromFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        userManager = new UserManager();
        testHelper.setOneUserToFile(DEFAULT_PATH, "sdsd,Oleh,Ivaniv");
        userManager.getUser(1);
    }

    @Test(testName = "Verify reading wrong name data from file")
    public void readWrongNameDataFromFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        User expectedUser;
        userManager = new UserManager();

        testHelper.setOneUserToFile(DEFAULT_PATH, "1,&^@#,Ivaniv");

        expectedUser = userManager.getUser(1);
        String expectedUserInfo = String.format("%1$s,%2$s,%3$s", expectedUser.getId(), expectedUser.getName(), expectedUser.getSurname());

        Assert.assertEquals(testHelper.readLineFromFile(DEFAULT_PATH, 1), expectedUserInfo);
    }

    @Test(testName = "Verify reading wrong surname data from file")
    public void readWrongSurnameDataFromFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        User expectedUser;
        userManager = new UserManager();

        testHelper.setOneUserToFile(DEFAULT_PATH, "1,Oleh,^234*&(&*");

        expectedUser = userManager.getUser(1);
        String expectedUserInfo = String.format("%1$s,%2$s,%3$s", expectedUser.getId(), expectedUser.getName(), expectedUser.getSurname());

        Assert.assertEquals(testHelper.readLineFromFile(DEFAULT_PATH, 1), expectedUserInfo);
    }

    @Test(testName = "Verify reading data from empty file", expectedExceptions = NumberFormatException.class)
    public void readDataFromEmptyFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        userManager = new UserManager();
        testHelper.setOneUserToFile(DEFAULT_PATH, "");
        userManager.getUser(1);
    }

    @Test(testName = "Attempt to read not exist file ", groups = "REQUIRES_FILE_DELETE", expectedExceptions = FileNotFoundException.class)
    public void attemptToReadNotExistFileTest() throws IOException {
        file = new File(DEFAULT_PATH);
        userManager = new UserManager();
        userManager.getUser(1);
    }
}
