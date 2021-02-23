package Lesson_4.fileEditor.java;

import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {

       // User user1 = new User(1, "Oleh", "Ivaniv");

        UserManager userManager1 = new UserManager("C:\\Users\\oivaniv\\Documents\\NewTestFile4.txt");


        UserManager userManager2 = new UserManager("C:\\Users\\oivaniv\\Documents\\NewTestFile4.txt", 2, "Stepan", "Giga");

    }
}
