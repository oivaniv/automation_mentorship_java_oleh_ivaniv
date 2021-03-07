package Lesson_4.fileEditor.test;

import Lesson_4.fileEditor.java.User;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class TestHelper {

    private File file;
    private FileWriter printWriter;


    public void deleteFileTest(String pathToFile) {
        System.out.println();

        file = new File(pathToFile);
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " is deleted");
        } else {
            System.out.println("No such file - " + file.getName());
        }
    }

    public void setOneUserToFile(String pathToFile, int id, String name, String surname) throws IOException {
        file = new File(pathToFile);
        printWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(printWriter);

        System.out.printf("Data about user ID = %1$s, name = ,%2$s, surname = %3$s was added to file %4$s%n", id, name, surname, file.getName());
        bw.write(String.format("%1$s,%2$s,%3$s", id, name, surname));
        bw.newLine();
        bw.close();
    }

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
    }

    public String readDataFromFile(String pathTofFile, int id) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathTofFile));
        String lineOfFile = null;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] fileDataArray = data.split(",");
            if (id == Integer.parseInt(fileDataArray[0])) {
                int identifier = (Integer.parseInt(fileDataArray[0]));
                String name = fileDataArray[1];
                String surname = fileDataArray[2];
                lineOfFile = identifier + "," + name + "," + surname;
            }
        }
        return lineOfFile;
    }

}
