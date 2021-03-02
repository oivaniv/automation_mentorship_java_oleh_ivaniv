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
    static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public UserManager() {
        File file = new File(DEFAULT_PATH);

        if (file.exists()) {
            System.out.println(file.getName() + " exist, we can't create new");

        } else {
            System.out.println(file.getName() + " is created with default path");
        }


    }

    UserManager(String pathToFile) {
        File file = new File(pathToFile);

        if (file.exists()) {
            System.out.println(file.getName() + " exist, we can't create new");

        } else {
            System.out.println(file.getName() + " is created with default path");
        }


    }

    public static void createUser(User user1) {

        int id = user1.getId();
        String name = user1.getName();
        String surname = user1.getSurname();


        if (file.length()!=0){
            printWriter.printf("%s,%s,%s \r \n", id, name, surname);
            System.out.println(file.getName() + " is edited");

        }else {
            printWriter.printf("%s,%s,%s \r \n", id, name, surname);
            System.out.println(file.getName() + " is created");
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
