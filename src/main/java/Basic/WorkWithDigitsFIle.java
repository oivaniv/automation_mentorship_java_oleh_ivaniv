package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class WorkWithDigitsFIle {
    public static void main(String[] args) {

        //Create FIle. Set text into file with digits and letters, where digits are in separate line.
        try {
            Formatter formatter = new Formatter("C:\\Users\\oivaniv\\Documents\\NewTestFile3.txt");

            //.format method we use to put some data into the file. By "%s %s %s" - we initialize the data order, each %s would be replaced by parameter
            formatter.format("%s %s", "1", "Ivo \r \n");
            formatter.format("%s %s", "2", "Oleh \r \n");
            formatter.format("%s %s", "3", "Stepan \r \n");
            formatter.close();

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        //Read digits from the file and make some math operations with them
        try {
            File file = new File("C:\\Users\\oivaniv\\Documents\\NewTestFile3.txt");
            Scanner scanner = new Scanner(file);

            ArrayList<Integer> digits = new ArrayList<>();

            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
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
