package Lesson_4.fileEditor.java;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserManager {

    public static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    static File file = new File(DEFAULT_PATH);


    public UserManager() throws IOException {
        File file = new File(DEFAULT_PATH);

        if (file.exists()) {
            System.out.println(file.getName() + " exist, we can't create new");

        } else {
            System.out.println(file.getName() + " is created with default path");
        }


    }

    UserManager(String pathToFile) throws FileNotFoundException {
        File file = new File(pathToFile);

        if (file.exists()) {
            System.out.println(file.getName() + " exist, we can't create new");

        } else {
            System.out.println(file.getName() + " is created with default path");
        }


    }

    public static void createUser(User user1) throws FileNotFoundException {

        int id = user1.getId();
        String name = user1.getName();
        String surname = user1.getSurname();
        PrintWriter printWriter = new PrintWriter(file);


        if (file.length()==0){
            printWriter.printf("%s,%s,%s", id, name, surname);
            printWriter.println();
            System.out.println(file.getName() + " is created");
        }else {
            printWriter.printf("%s,%s,%s", id, name, surname);
            printWriter.println();
            System.out.println(file.getName() + " is edited");
        }

        printWriter.close();
    }

    public User getUser(int id) {
        String name = "Oleh";
        String surname = "Ivaniv";

        User resultUser = new User();
        resultUser.setId(id);
        resultUser.setName(name);
        resultUser.setSurname(surname);

        return resultUser;
    }
}
