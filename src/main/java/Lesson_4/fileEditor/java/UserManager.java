package Lesson_4.fileEditor.java;


import java.io.*;
import java.util.*;


public class UserManager {

    public static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    private File file;
    private FileWriter printWriter;

    public UserManager() throws FileNotFoundException {
        initialize(DEFAULT_PATH);
    }

    public UserManager(String pathToFile) throws FileNotFoundException {
        initialize(pathToFile);
    }

    public void initialize(String path) throws FileNotFoundException {
        file = new File(path);
    }

    public void createUser(User user) throws IOException {

        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        //System.out.println("Data about user ID = " + user.getId() + ", name = " + user.getName() + ", surname = " + user.getSurname() + "was added to file " + file.getName());
        System.out.println(String.format("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s", user.getId(), user.getName(), user.getSurname(), file.getName()));
        bw.write(String.format("%1$s,%2$s,%3$s", user.getId(), user.getName(), user.getSurname()));
        bw.newLine();
        bw.close();
    }




    public User getUser(int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt"));
        User foundUser = null;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                foundUser = new User();
                foundUser.setId(Integer.parseInt(fileDataArray[0]));
                foundUser.setName(fileDataArray[1]);
                foundUser.setSurname(fileDataArray[2]);
            }
        }
        return foundUser;
    }
}
