package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class TestHelper {

    private File file;
    private FileWriter printWriter;

    /**
     * We use this method to delete the file from the pathToFile
     * @param pathToFile - parameter which we use as file location
     */
    public void deleteFile(String pathToFile) {
        System.out.println();

        file = new File(pathToFile);
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " is deleted");
        } else {
            System.out.println("No such file - " + file.getName());
        }
    }

    // Need to investigate, why i can't delete the file by default delete (The process cannot access the file because it is being used by another process)
//    public void newDeleteFile(String pathToFile) throws IOException {
//        System.out.println();
//        Path CUSTOM_PATH = Paths.get(pathToFile);
//        if(Files.exists(CUSTOM_PATH)){
//            Files.delete(CUSTOM_PATH);
//            System.out.println(CUSTOM_PATH.getFileName()+ " is deleted");
//        }
//        System.out.println("No such file - " + CUSTOM_PATH.getFileName());
//    }

    public void createFile(String pathToFile) throws IOException {
        file = new File(pathToFile);
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);
        bw.newLine();
        bw.close();
        System.out.println(file.getName() + " is created for test");
    }

    /**
     * This method we use to create the file and add one line with few parameters into the file
     * @param pathToFile - file location parameter
     * @param id - user identifier parameter
     * @param name - user name
     * @param surname - user surname
     * @throws IOException
     */
    public void setOneUserToFile(String pathToFile, int id, String name, String surname) throws IOException {
        file = new File(pathToFile);
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        System.out.printf("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s manually%n", id, name, surname, file.getName());
        bw.write(String.format("%1$s,%2$s,%3$s", id, name, surname));
        bw.newLine();
        bw.close();
    }

    /**
     * This method we use to create the file and add one line with one parameter (userInfo as one line) into the file. Used basically for entering wrong data.
     * @param pathToFile - file location parameter
     * @param userInfo - all user info as one string
     * @throws IOException
     */
    public void setOneUserToFile(String pathToFile, String userInfo) throws IOException {
        file = new File(pathToFile);
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        System.out.printf("Data about user %1$s was added to file %2$s manually%n",userInfo, file.getName());
        bw.write(String.format("%1$s",userInfo));
        bw.newLine();
        bw.close();
    }

    /**
     * This method is used to enter big amount of data to the file
     * @param pathToFile - file location parameter
     * @param userQuantity - quantity of user to add
     * @throws IOException
     */
    public void setManyUsersToFile(String pathToFile, int userQuantity) throws IOException {
        file = new File(pathToFile);
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);
        Random random = new Random();

        List<String> userNames = Arrays.asList("Oleh", "Ivan", "Stepan", "Igor", "Taras", "Dima", "Pavlo", "Roman", "Ostap", "Volodymyr", "Max", "Mykhailo");
        List<String> userSurnames = Arrays.asList("Ivaniv", "Baloh", "Datsko", "Petrenko", "Koval", "Bobul", "Giga", "Fos", "Lutsiv", "Pavlik", "Zibrov");

        for (int id = 0; id <= userQuantity; id++) {
            String name = userNames.get(random.nextInt(userNames.toArray().length));
            String surname = userSurnames.get(random.nextInt(userSurnames.toArray().length));
            System.out.printf("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s%n", id, name, surname, file.getName());
            bw.write(String.format("%1$s,%2$s,%3$s", id, name, surname));
            bw.newLine();
        }
        bw.close();
        printWriter.close();
    }

    /**
     * This method is used to read one line form the file
     * @param pathToFile - file location parameter
     * @param id - user id
     * @return one line of file as one String in format "id,name,surname"
     * @throws FileNotFoundException
     */
    public static User readLineFromFile(String pathToFile, int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathToFile));
        User userFromFile = new User();

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                userFromFile.setId((Integer.parseInt(fileDataArray[0])));
                userFromFile.setName(fileDataArray[1]);
                userFromFile.setSurname(fileDataArray[2]);
            }
        }
        scanner.close();
        return userFromFile;
    }

    //Rewrite readFromFile to return User instance instead of String!!!!!!!



    /**
     * This method is used to read user id form the file
     * @param pathTofFile - file location parameter
     * @param id - user id
     * @return user id from line which was found by specific user id as String
     * @throws FileNotFoundException
     */
    public static int readIdFromFile(String pathTofFile, int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathTofFile));
        int identificator = 0;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                identificator = (Integer.parseInt(fileDataArray[0]));
            }
        }
        return identificator;
    }

    /**
     * This method is used to read user name form the file
     * @param pathTofFile - file location parameter
     * @param id - user id
     * @return user name from line which was found by specific user id as String
     * @throws FileNotFoundException
     */
    public String readNameFromFile(String pathTofFile, int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathTofFile));
        String name = null;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                name = fileDataArray[1];
            }
        }
        return name;
    }

    /**
     * This method is used to read user surname form the file
     * @param pathTofFile - file location parameter
     * @param id - user id
     * @return user surname from line which was found by specific user id as String
     * @throws FileNotFoundException
     */
    public String readSurnameFromFile(String pathTofFile, int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathTofFile));
        String surname = null;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                surname = fileDataArray[2];
            }
        }
        return surname;
    }

    /**
     * This method is used to find last user id in the file
     * @param pathTofFile - file location parameter
     * @return the latest user's id in the file
     * @throws FileNotFoundException
     */
    public static int findLastIdFromFile(String pathTofFile) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathTofFile));
        int lastId = 0;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            while (lastId < Integer.parseInt(fileDataArray[0])) {
                lastId = Integer.parseInt(fileDataArray[0]);
            }
        }
        scanner.close();
        return lastId;
    }

}
