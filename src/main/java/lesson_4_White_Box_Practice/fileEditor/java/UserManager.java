package lesson_4_White_Box_Practice.fileEditor.java;


import java.io.*;
import java.util.*;


public class UserManager {

    public static final String DEFAULT_PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt";

    private File file;
    private FileWriter printWriter;

    public UserManager() throws FileNotFoundException {
        initialize(DEFAULT_PATH);
    }

    /**
     *
     * @param pathToFile - is the path to the file which we want to create
     * @throws FileNotFoundException
     */
    public UserManager(String pathToFile) throws FileNotFoundException {
        initialize(pathToFile);
    }

    /**
     *
     * @param pathToFile - is the path to the file which we want to create
     */
    public void initialize(String pathToFile) {
        file = new File(pathToFile);
    }

    /**
     *
     * @param user used to add user with this parameter to the file
     * @throws IOException
     */
    public void createUser(User user) throws IOException {
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        //System.out.println("Data about user ID = " + user.getId() + ", name = " + user.getName() + ", surname = " + user.getSurname() + "was added to file " + file.getName());

        if (user.getId()==0||user.getName()==null||user.getSurname()==null){
            System.out.println("Wrong user data, can't add it to the file");
        }else {
            System.out.printf("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s%n", user.getId(), user.getName(), user.getSurname(), file.getName());
            bw.write(String.format("%1$s,%2$s,%3$s", user.getId(), user.getName(), user.getSurname()));
            bw.newLine();
            bw.close();
            printWriter.close();
        }
    }

    /**
     *
     * @param id - parameter which we use to identify which user data we want to receive
     * @return - return foundUser object with all data
     * @throws FileNotFoundException
     */
    public User getUser(int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        //Bug #1, when use static path, TC for custom path fail
//        Scanner scanner = new Scanner(new File("C:\\Users\\oivaniv\\Documents\\NewTestFile1.txt"));

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
