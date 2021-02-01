package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WorkWithFile {
    public static void createFile() {
        try {
            //We use Formatter class to create new file
            //If file exist it will overwrite it
            Formatter formatter = new Formatter("C:\\Users\\oivaniv\\Documents\\NewTestFile2.txt");

            //.format method we use to put some data into the file. By "%s %s %s" - we initialize the data order, each %s would be replaced by parameter
            formatter.format("%s %s %s", "1", "Ivo", "Bobyl \r \n");
            formatter.format("%s %s %s", "2", "Oleh", "Ivaniv \r \n");
            formatter.format("%s %s %s", "3", "Stepan", "Giga \r \n");
            formatter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try {
            File file = new File("C:\\Users\\oivaniv\\Documents\\NewTestFile2.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}