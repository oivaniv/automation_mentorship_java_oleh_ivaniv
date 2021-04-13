package lesson_2_Basic_OOP.Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class WorkWithDigitsFIle {
    private static final String PATH = "C:\\Users\\oivaniv\\Documents\\NewTestFile3.txt";

    public static void createFile() {
        //Create FIle. Set text into file with digits and letters, where digits are in separate line.
        try {
            new File(PATH).createNewFile();

            Formatter formatter = new Formatter(PATH);

            //.format method we use to put some data into the file. By "%s %s %s" - we initialize the data order, each %s would be replaced by parameter
            formatter.format("%s %s", "1", "Ivo \r \n");
            formatter.format("%s %s", "2", "Oleh \r \n");
            formatter.format("%s %s", "3", "Stepan \r \n");
            formatter.close();

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileInfo() {


        //Read digits from the file and make some math operations with them
        try {
            File file = new File(PATH);
            Scanner scanner = new Scanner(file);

            ArrayList<Integer> digits = new ArrayList<>();

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    digits.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }

            System.out.println(digits);

            int sum = digits.get(0) + digits.get(1) + digits.get(2);
            System.out.println(sum);

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
