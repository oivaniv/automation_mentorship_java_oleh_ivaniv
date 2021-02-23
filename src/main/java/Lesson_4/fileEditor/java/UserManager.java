package Lesson_4.fileEditor.java;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserManager {

    UserManager(String pathToFile) throws IOException {
        File file = new File(pathToFile);

        if (file.exists()) {
            System.out.println(file.getName() + " exist");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } else {
            System.out.println(file.getName() + " doesn't exist");

        }


    }

    UserManager(String pathToFile, int id, String name, String surname) throws FileNotFoundException {
        File file = new File(pathToFile);

        if (file.exists()) {

            System.out.println(file.getName() + " exist, we can't create new");

        } else {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.printf("%s %s %s", id, name, surname);
            System.out.println(file.getName() + " is edited");
            printWriter.close();
        }


    }

    public static void createUser(User user) {
        user.setId(1);
        user.setName("Oleh");
        user.setSurname("Ivaniv");
    }

    public User getUser(int id) {
        User user = new User();
        return user;
    }
}
