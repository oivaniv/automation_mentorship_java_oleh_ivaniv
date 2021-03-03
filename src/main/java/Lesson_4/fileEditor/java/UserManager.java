package Lesson_4.fileEditor.java;


import java.io.*;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class UserManager {

    public static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    private File file;
    private PrintWriter printWriter;
    private ArrayList<String> arrayList = new ArrayList<>();


    public UserManager() throws FileNotFoundException {
        initialize(DEFAULT_PATH);
    }

    public UserManager(String pathToFile) throws FileNotFoundException {
        initialize(pathToFile);
    }

    public void initialize(String path) throws FileNotFoundException {
        file = new File(path);
        printWriter = new PrintWriter(file);
    }

    public void createUser(User user1) {

        int id = user1.getId();
        String name = user1.getName();
        String surname = user1.getSurname();


        if (file.length() != 0) {
            printWriter.printf("%s,%s,%s\r\n", id, name, surname);
            printWriter.flush();

            System.out.println(file.getName() + " is edited");

        } else {
            printWriter.printf("%s,%s,%s\r\n", id, name, surname);
            printWriter.flush();

            System.out.println(file.getName() + " is created");
        }

        printWriter.close();


    }

    public User getUser(int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt"));
        User resultUser = new User();

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();

            String[] tmpArray = data.split(",");
            Collections.addAll(arrayList, tmpArray);

            //Here we combine the user info from file and id from parameters
            int tmpId = Integer.parseInt(arrayList.get(0));
            String tmpName = arrayList.get(1);
            String tmpSurname = arrayList.get(2);
            if (id == tmpId) {
                resultUser.setId(tmpId);
                resultUser.setName(tmpName);
                resultUser.setSurname(tmpSurname);
                System.out.println("We found the user with this ID: " + id);
                break;
            } else {
                arrayList.clear();
            }
            System.out.println("There is no such user with this ID: " + id);
        }
        return resultUser;
    }
}
