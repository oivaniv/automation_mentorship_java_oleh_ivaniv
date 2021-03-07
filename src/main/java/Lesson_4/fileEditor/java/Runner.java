package Lesson_4.fileEditor.java;


import Lesson_4.fileEditor.test.TestHelper;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner {

    public static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";



    public static void main(String[] args) throws IOException {

        Runner runner = new Runner();
        runner.nonStaticMethod();
    }

    public void nonStaticMethod() throws IOException {

        User expectedUser1 = new User();
        expectedUser1.setId(1);
        expectedUser1.setName("Oleh");
        expectedUser1.setSurname("Ivaniv");

        User expectedUser2 = new User();
        expectedUser2.setId(2);
        expectedUser2.setName("Ivan");
        expectedUser2.setSurname("Baloh");

        User expectedUser3 = new User();
        expectedUser3.setId(3);
        expectedUser3.setName("Pavlo");
        expectedUser3.setSurname("Korec");

//        UserManager userManager = new UserManager();
//        userManager.createUser(expectedUser1);
//        userManager.createUser(expectedUser2);
//        userManager.createUser(expectedUser3);

        TestHelper testHelper = new TestHelper();

        //testHelper.setOneUserToFile(DEFAULT_PATH, 1, "Olha", "Ivaniv");

        //testHelper.setManyUsersToFile(DEFAULT_PATH,10);

        //testHelper.readDataFromFile(DEFAULT_PATH,3);
        //System.out.println(testHelper.readDataFromFile(DEFAULT_PATH,3));

        //testHelper.deleteFileTest(DEFAULT_PATH);
        //userManager.getUser(5);
    }
}
