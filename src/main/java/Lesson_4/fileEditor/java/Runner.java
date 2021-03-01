package Lesson_4.fileEditor.java;

import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {

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

        UserManager userManager = new UserManager();
        userManager.createUser(expectedUser1);
        userManager.createUser(expectedUser2);
        userManager.createUser(expectedUser3);




    }
}
